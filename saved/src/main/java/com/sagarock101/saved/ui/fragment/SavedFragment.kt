package com.sagarock101.saved.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import androidx.lifecycle.Observer
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.sagarock101.core.bindings.removeTransparentStatusBar
import com.sagarock101.core.di.ViewModelFactory
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.utilities.UiActionClassWithItemHelper
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.database.model.Articles
import com.sagarock101.newsheadlines.viewmodel.NewsViewModel
import com.sagarock101.saved.R
import com.sagarock101.saved.databinding.FragmentSavedBinding
import com.sagarock101.saved.ui.adapter.SavedNewsAdapter
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SavedFragment : BaseViewModelFragment<FragmentSavedBinding, NewsViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var adapter: SavedNewsAdapter

    private var currentSwipedItem: Articles? = null

    private var currentSwipedPosition = -1

    override fun getLayout() = R.layout.fragment_saved

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = SavedNewsAdapter()
    }

    override fun initView(view: View) {
        (activity as DaggerAppCompatActivity).removeTransparentStatusBar()
        viewModel = injectViewModel(viewModelFactory)
        setupRvWithAdapter()
        setSavedNewsObserver()
    }

    private fun setSavedNewsObserver() {
        viewModel.getAllSavedNews().observe(viewLifecycleOwner, Observer { savedArticles ->
            savedArticles?.let {
                adapter.setItems(it as MutableList<Articles>)
            }
        })
    }

    private fun setupRvWithAdapter() {
        var extras: FragmentNavigator.Extras?
        adapter.apply {
            viewModel = this@SavedFragment.viewModel
        }?.onItemClick = { imageView, textView, data ->
            val directions =
                SavedFragmentDirections.actionSavedFragmentToNewsDetailFragment2(data)
            extras = FragmentNavigatorExtras(
                imageView to ViewCompat.getTransitionName(imageView)!!,
                textView to ViewCompat.getTransitionName(textView)!!
            )
            findNavController().navigate(
                directions,
                extras ?: FragmentNavigatorExtras()
            )
        }

        binding.rvSavedNews.apply {
            adapter = this@SavedFragment.adapter
            postponeEnterTransition()
            viewTreeObserver
                .addOnPreDrawListener {
                    startPostponedEnterTransition()
                    true
                }
        }

        setUpItemTouchHelper()
    }

    private fun setUpItemTouchHelper() {
        val uiActionClassWithItemTouchHelper =
            object : UiActionClassWithItemHelper(requireContext()) {
                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                    currentSwipedItem = adapter.getSavedNewsAt(viewHolder.adapterPosition)
                    currentSwipedPosition = viewHolder.adapterPosition
                    adapter.removeItem(viewHolder.adapterPosition)
                    Snackbar.make(binding.root, getString(R.string.removed), Snackbar.LENGTH_SHORT)
                        .addCallback(object : Snackbar.Callback() {
                            override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                                if (event == DISMISS_EVENT_TIMEOUT) {
                                    viewModel.deleteNews(currentSwipedItem!!)
                                }
                            }
                        })
                        .setAction(getString(R.string.undo)) {
                            adapter.restoreItem(
                                currentSwipedItem,
                                currentSwipedPosition
                            )
                        }
                        .show()
                }
            }
        val itemTouchHelper = ItemTouchHelper(uiActionClassWithItemTouchHelper)
        itemTouchHelper.attachToRecyclerView(binding.rvSavedNews)

    }
}