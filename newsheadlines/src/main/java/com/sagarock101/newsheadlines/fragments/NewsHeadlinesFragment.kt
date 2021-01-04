package com.sagarock101.newsheadlines.fragments

import android.os.Bundle
import androidx.databinding.ViewDataBinding
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
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBinding
import com.sagarock101.newsheadlines.interfaces.OnClickRvItemListener
import com.sagarock101.newsheadlines.model.Articles
import com.sagarock101.newsheadlines.model.NewsHeadLines
import com.sagarock101.newsheadlines.ui.adapter.TopHeadlinesAdapter
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import javax.inject.Inject

class NewsHeadlinesFragment : BaseViewModelFragment<FragmentNewsHeadlinesBinding, NewsHeadlinesViewModel>(), Injectable, OnClickRvItemListener {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun getLayout() = R.layout.fragment_news_headlines

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = injectViewModel(viewModelFactory)
        viewModel.getNewsHeadLines()
    }

    override fun initView() {
        binding.vm = viewModel
        viewModel.newsHeadLinesLD.observe(viewLifecycleOwner, Observer {
            when(it.status) {
                DataWrapper.Status.LOADING -> {

                }
                DataWrapper.Status.SUCCESS -> {
                    attachSnapToRvWithData(it)
                }
                DataWrapper.Status.ERROR -> {
                    it.message?.let { it1 -> Utils.showToast(requireContext(), it1) }
                }
            }
        })
    }

    private fun attachSnapToRvWithData(it: DataWrapper<NewsHeadLines>) {
        val snapHelper = SnapHelper()
        binding.rvNews.adapter = TopHeadlinesAdapter().apply {
            setItems(it.data?.articles as MutableList<Articles>)
            listener = this@NewsHeadlinesFragment
        }
        binding.rvNews.onFlingListener = null
        snapHelper.attachToRecyclerView(binding.rvNews)
    }

    override fun onClick(data: Any?, viewBinding: ViewDataBinding) {
        val bundle = Bundle()
        var extras: FragmentNavigator.Extras? = null
        if(data is Articles && viewBinding is ItemNewsCardBinding) {
            bundle.apply {
                putString("imgUrl", data.urlToImage)
            }
            extras = FragmentNavigatorExtras(
                viewBinding.ivNewsImg to "news_img"
            )
        }
        findNavController().navigate(R.id.action_newsHeadlinesFragment_to_newsDetailFragment, bundle, null, extras)
    }


}