package com.sagarock101.newsheadlines.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.interfaces.Injectable
import com.sagarock101.core.utilities.SnapHelper
import com.sagarock101.core.utilities.Utils
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBinding
import com.sagarock101.newsheadlines.model.Articles
import com.sagarock101.newsheadlines.model.NewsHeadLines
import com.sagarock101.newsheadlines.ui.adapter.TopHeadlinesAdapter
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import javax.inject.Inject

class NewsHeadlinesFragment : BaseViewModelFragment<FragmentNewsHeadlinesBinding, NewsHeadlinesViewModel>(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

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
        binding.vm = viewModel
        viewModel.newsHeadLinesLD.observe(viewLifecycleOwner, Observer {
            when(it.status) {
                DataWrapper.Status.LOADING -> {
                    binding.shimmer.startShimmer()
                }
                DataWrapper.Status.SUCCESS -> {
                    binding.shimmer.stopShimmer()
                    binding.shimmer.visibility = View.GONE
                    binding.rvNews.visibility = View.VISIBLE
                    attachSnapToRvWithData(it)
                }
                DataWrapper.Status.ERROR -> {
                    binding.shimmer.stopShimmer()
                    binding.shimmer.visibility = View.GONE
                    it.message?.let { it1 -> Utils.showToast(requireContext(), it1) }
                }
            }
        })
    }

    private fun attachSnapToRvWithData(it: DataWrapper<NewsHeadLines>) {
        val snapHelper = SnapHelper()
        var extras: FragmentNavigator.Extras?
        binding.rvNews.adapter = TopHeadlinesAdapter() { imageView, data ->
            val directions = NewsHeadlinesFragmentDirections.actionNewsHeadlinesFragmentToNewsDetailFragment(data)
            extras = FragmentNavigatorExtras(
                imageView to ViewCompat.getTransitionName(imageView)!!
            )
         findNavController().navigate(directions,
             extras ?: FragmentNavigatorExtras())
        }.apply {
            setItems(it.data?.articles as MutableList<Articles>)
        }
        snapHelper.attachToRecyclerView(binding.rvNews)
        binding.rvNews.apply {
            postponeEnterTransition()
            viewTreeObserver
                .addOnPreDrawListener {
                    startPostponedEnterTransition()
                    true
                }
        }
    }

}