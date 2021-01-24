package com.sagarock101.saved.ui.fragment

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.view.ActionMode
import androidx.core.view.ViewCompat
import androidx.lifecycle.Observer
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.selection.SelectionPredicates
import androidx.recyclerview.selection.SelectionTracker
import androidx.recyclerview.selection.StorageStrategy
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.sagarock101.core.bindings.removeTransparentStatusBar
import com.sagarock101.core.di.ViewModelFactory
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.utils.UiActionClassWithItemHelper
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.database.model.Articles
import com.sagarock101.newsheadlines.viewmodel.NewsViewModel
import com.sagarock101.saved.R
import com.sagarock101.saved.databinding.FragmentSavedBinding
import com.sagarock101.saved.ui.adapter.SavedNewsAdapter
import com.sagarock101.saved.ui.itemSelection.MyItemDetailsLookup
import com.sagarock101.saved.ui.itemSelection.MyItemKeyProvider
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SavedFragment : BaseViewModelFragment<FragmentSavedBinding, NewsViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var adapter: SavedNewsAdapter

    private var currentSwipedItem: Articles? = null

    private var currentSwipedPosition = -1

    private var listOfSavedArticles: List<Articles>? = null

    private var actionMode: ActionMode.Callback? = null

    private var selectionTracker: SelectionTracker<Articles>? = null

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
        (activity as DaggerAppCompatActivity)?.setSupportActionBar(binding.customAppBar.toolbar)
        (activity as DaggerAppCompatActivity).supportActionBar?.title = getString(R.string.empty)
        setHasOptionsMenu(true)
    }

    private fun setSavedNewsObserver() {
        viewModel.getAllSavedNews().observe(viewLifecycleOwner, Observer { savedArticles ->
            savedArticles?.let {
                listOfSavedArticles = it
                adapter.setItems(it as MutableList<Articles>)
                setupSelectorTracker()
//                setupActionMode()
            }
        })
    }

    private fun setupActionMode() {
        actionMode = object : ActionMode.Callback {
            override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {
                return when (item?.itemId) {
                    R.menu.menu_list_delete -> {
                        showToast("delete")
                        mode?.finish()
                        true
                    }
                    else -> false
                }
            }

            override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean {
                mode?.menuInflater?.inflate(R.menu.menu_list_delete, menu)
                mode?.title = "select"
                return true
            }

            override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean {
                TODO("Not yet implemented")
            }

            override fun onDestroyActionMode(mode: ActionMode?) {
                actionMode = null
            }

        }
        (activity as DaggerAppCompatActivity).startSupportActionMode(actionMode!!)

    }

    private fun setupRvWithAdapter() {
        var extras: FragmentNavigator.Extras?
        adapter.apply {
            viewModel = this@SavedFragment.viewModel
        }.onItemClick = { imageView, textView, data ->
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

    private fun setupSelectorTracker() {
        selectionTracker = SelectionTracker.Builder<Articles>(
            "mySelection",
            binding.rvSavedNews,
            MyItemKeyProvider(listOfSavedArticles!!),
            MyItemDetailsLookup(binding.rvSavedNews),
            StorageStrategy.createParcelableStorage(Articles::class.java)
        ).withSelectionPredicate(
            SelectionPredicates.createSelectAnything()
        ).build()
        adapter.tracker = selectionTracker
        selectionTracker?.addObserver(object : SelectionTracker.SelectionObserver<Articles>() {
            override fun onSelectionChanged() {
                super.onSelectionChanged()
                val items = selectionTracker?.selection!!.size()
                if (selectionTracker?.hasSelection()!! && actionMode != null) {
                    setupActionMode()
                } else {
                    actionMode = null
                }
            }
        })
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