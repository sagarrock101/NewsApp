package com.sagarock101.newsheadlines.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.view.ViewCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
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
    OnSnapPositionChangeListener, ChipGroup.OnCheckedChangeListener {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private var adapter: TopHeadlinesAdapter? = null

    private var handler: Handler? = null

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
        (activity as DaggerAppCompatActivity).removeTransparentStatusBar()
        setAdapterToRecyclerView()
        attachSnapTov()
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
        var extras: FragmentNavigator.Extras?
        adapter?.onItemClick = { imageView, textView, data ->
            val directions =
                NewsHeadlinesFragmentDirections.actionNewsHeadlinesFragmentToNewsDetailFragment(data)
            extras = FragmentNavigatorExtras(
                imageView to ViewCompat.getTransitionName(imageView)!!,
                textView to ViewCompat.getTransitionName(textView)!!
            )
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
                viewModel.getNewsHeadLines()
//                handler?.postDelayed({
//                    scrollToFirstArticle()
//                }, 500)
            }
            binding.chipBusiness.id -> {
                viewModel.getNewsHeadLines(getString(R.string.entertainment))
//                handler?.postDelayed({
//                    scrollToFirstArticle()
//                }, 500)
            }
            binding.chipEntertainment.id -> {
                viewModel.getNewsHeadLines(getString(R.string.entertainment))
//                handler?.postDelayed({
//                    scrollToFirstArticle()
//                }, 500)
            }
            binding.chipHealth.id -> {
                viewModel.getNewsHeadLines(getString(R.string.health))
//                handler?.postDelayed({
//                    scrollToFirstArticle()
//                }, 500)
            }
            binding.chipSports.id -> {
                viewModel.getNewsHeadLines(getString(R.string.sports))
//                handler?.postDelayed({
//                    scrollToFirstArticle()
//                }, 500)
            }
            binding.chipTechnology.id -> {
                viewModel.getNewsHeadLines(getString(R.string.technology))
//                handler?.postDelayed({
//                    scrollToFirstArticle()
//                }, 500)
            }
            binding.chipScience.id -> {
                viewModel.getNewsHeadLines(getString(R.string.science))
//                handler?.postDelayed({
//                    scrollToFirstArticle()
//                }, 500)
            }

        }
    }

    private fun scrollToFirstArticle() {
        adapter?.itemCount?.let {
            if(it > 0)
                binding.rvNews.scrollToPosition(0)
        }
    }

    private fun getNews(category: String = "") {
        handler?.postDelayed({
            viewModel.getNewsHeadLines(category)
            binding.shimmer.apply {
                visibility = View.VISIBLE
                startShimmer()
                binding.rvNews.visibility = View.GONE
            }
            scrollToFirstArticle()
        }, 1000)
    }

    override fun onDestroyView() {
        handler = null
        binding.chipGroup.setOnCheckedChangeListener(null)
        super.onDestroyView()
    }

}