package com.sagarock101.newsheadlines.ui.fragments

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.transition.Transition
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.sagarock101.core.bindings.removeTransparentStatusBar
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.interfaces.Injectable
import com.sagarock101.core.interfaces.OnSnapPositionChangeListener
import com.sagarock101.core.utilities.SnapHelper
import com.sagarock101.core.utilities.SnapOnScrollListener
import com.sagarock101.core.utilities.Utils
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBinding
import com.sagarock101.newsheadlines.model.Articles
import com.sagarock101.newsheadlines.ui.adapter.TopHeadlinesAdapter
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class NewsHeadlinesFragment :
    BaseViewModelFragment<FragmentNewsHeadlinesBinding, NewsHeadlinesViewModel>(), Injectable,
    OnSnapPositionChangeListener, ChipGroup.OnCheckedChangeListener, Transition.TransitionListener {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private var adapter: TopHeadlinesAdapter? = null

    private var handler: Handler? = null

    private var runnable: Runnable? = null

    private var extras: FragmentNavigator.Extras? = null

    private var sharedTextView: TextView? = null

    private var onClickedPosition: Int = -1

    override fun getLayout() = R.layout.fragment_news_headlines

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = injectViewModel(viewModelFactory)
        viewModel.getNewsHeadLines()
    }

    override fun onResume() {
        super.onResume()
        binding.shimmer.startShimmer()
    }

    override fun onPause() {
        super.onPause()
        binding.shimmer.stopShimmer()
    }

    override fun initView(view: View) {
//        if(onClickedPosition != -1) {
//            (activity)?.window?.sharedElementEnterTransition = null
//            (activity)?.window?.sharedElementEnterTransition = null
//            (activity)?.window?.sharedElementReenterTransition = null
//            (activity)?.window?.sharedElementReturnTransition = null
//            ViewCompat.setTransitionName(sharedTextView!!, null)
//        }
        (sharedElementEnterTransition as? Transition)?.addListener(this)
        runnable = Runnable {
            binding.shimmer.apply {
                visibility = View.VISIBLE
                stopShimmer()
                binding.rvNews.visibility = View.VISIBLE
            }
            scrollToFirstArticle()
        }
        (activity as DaggerAppCompatActivity).removeTransparentStatusBar()
        setAdapterToRecyclerView()
        attachSnapTov()
        if(onClickedPosition != -1) {
            adapter?.slideTextFromBottom(onClickedPosition)
//            sharedTextView?.visibility = View.GONE
//            var objectAnimator = ObjectAnimator.ofFloat(sharedTextView, View.TRANSLATION_Y, 0f, 2f)
//            objectAnimator?.addUpdateListener {
//                sharedTextView?.translationY = it.animatedValue as Float
//            }
//            objectAnimator.duration = 1000
//            objectAnimator.start()
//            sharedTextView?.animate()?.translationY(0.0f)?.setDuration(1000)?.start()
        }
        handler = Handler(Looper.getMainLooper())
        binding.chipGroup.setOnCheckedChangeListener(this)
        binding.vm = viewModel
        viewModel.newsHeadLinesLD.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                DataWrapper.Status.LOADING -> {
                    binding.shimmer.visibility = View.VISIBLE
                    binding.shimmer.startShimmer()
                }
                DataWrapper.Status.SUCCESS -> {
                    binding.shimmer.stopShimmer()
                    binding.shimmer.visibility = View.GONE
                    binding.rvNews.visibility = View.VISIBLE
                    adapter?.apply {
                        setItems(it.data?.articles as MutableList<Articles>)
                    }
                }
                DataWrapper.Status.ERROR -> {
                    binding.shimmer.stopShimmer()
                    binding.shimmer.visibility = View.GONE
                    it.message?.let { it1 -> Utils.showToast(requireContext(), it1) }
                }
            }
        })
    }

    private fun setAdapterToRecyclerView() {
        adapter = TopHeadlinesAdapter()
        adapter?.onItemClick = { imageView, textView, data, position ->
            val directions =
                NewsHeadlinesFragmentDirections.actionNewsHeadlinesFragmentToNewsDetailFragment(data)
            extras = FragmentNavigatorExtras(
                imageView to ViewCompat.getTransitionName(imageView)!!
            )
            sharedTextView = textView
            onClickedPosition = position
            findNavController().navigate(
                directions,
                extras ?: FragmentNavigatorExtras()
            )
        }
    }

    private fun attachSnapTov() {
        val snapHelper = SnapHelper()
        snapHelper.attachToRecyclerView(binding.rvNews)
        val snapOnScrollListener = SnapOnScrollListener(snapHelper, this)
        binding.rvNews.apply {
            adapter = this@NewsHeadlinesFragment.adapter
            addOnScrollListener(snapOnScrollListener)
            postponeEnterTransition()
            viewTreeObserver
                .addOnPreDrawListener {
                    startPostponedEnterTransition()
                    true
                }
        }
    }

    override fun onSnapPositionChange(position: Int, previousPotion: Int) {
        //TODO need to decrease/increase alpha layer on proper positions
//        adapter?.notifyChange(position, true)
//        adapter?.notifyChange(previousPotion, false)
    }

    override fun onCheckedChanged(group: ChipGroup?, checkedId: Int) {
        when (checkedId) {
            binding.chipAll.id -> {
               binding.chipAll.callApiIfChipIsPressed()
            }
            binding.chipBusiness.id -> {
                binding.chipBusiness.callApiIfChipIsPressed(getString(R.string.business))
            }
            binding.chipEntertainment.id -> {
                binding.chipEntertainment.callApiIfChipIsPressed(getString(R.string.entertainment))
            }
            binding.chipHealth.id -> {
                binding.chipHealth.callApiIfChipIsPressed(getString(R.string.health))
            }
            binding.chipSports.id -> {
                binding.chipHealth.callApiIfChipIsPressed(getString(R.string.sports))
            }
            binding.chipTechnology.id -> {
                binding.chipTechnology.callApiIfChipIsPressed(getString(R.string.technology))
            }
            binding.chipScience.id -> {
                binding.chipScience.callApiIfChipIsPressed(getString(R.string.science))
            }

        }
    }

    private fun scrollToFirstArticle() {
        adapter?.itemCount?.let {
            if (it > 0)
                binding.rvNews.scrollToPosition(0)
        }
    }

    private fun getNews(category: String = "") {
        viewModel.getNewsHeadLines(category)
        binding.shimmer.startShimmer()
        binding.rvNews.visibility = View.GONE
        runnable?.let {
            handler?.postDelayed(
                it, 1000
            )
        }
    }

    override fun onDestroyView() {
        runnable?.let { handler?.removeCallbacks(it) }
        handler = null
        binding.chipGroup.setOnCheckedChangeListener(null)
        super.onDestroyView()
    }

    private fun Chip.callApiIfChipIsPressed(category: String = "") {
        if (this.isPressed)
            getNews(category)
    }

    override fun onTransitionEnd(transition: Transition) {
        showToast(transition.name.toString())
    }

    override fun onTransitionResume(transition: Transition) {
        showToast(transition.name.toString())
    }

    override fun onTransitionPause(transition: Transition) {
        showToast(transition.name.toString())
    }

    override fun onTransitionCancel(transition: Transition) {
        showToast(transition.name.toString())
    }

    override fun onTransitionStart(transition: Transition) {
        showToast(transition.name.toString())
    }


}