package com.sagarock101.newsheadlines.fragments

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.interfaces.Injectable
import com.sagarock101.core.utilities.Utils
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo
import com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBinding
import com.sagarock101.newsheadlines.model.Articles
import com.sagarock101.newsheadlines.ui.adapter.TopHeadlinesAdapter
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import javax.inject.Inject

class NewsHeadlinesFragment : BaseViewModelFragment<FragmentNewsHeadlinesBinding, NewsHeadlinesViewModel>(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var string: String

    @Inject
    lateinit var newsHeadlinesRepo: NewsHeadlinesRepo

    override fun getLayout() = R.layout.fragment_news_headlines

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initView() {
        viewModel = injectViewModel(viewModelFactory)
        viewModel.getNewsHeadLines()
        binding.vm = viewModel
        viewModel.newsHeadLinesLD.observe(viewLifecycleOwner, Observer {
            when(it.status) {
                DataWrapper.Status.LOADING -> {

                }
                DataWrapper.Status.SUCCESS -> {
                    binding.rvNews.adapter = TopHeadlinesAdapter().apply {
                        setItems(it.data?.articles as MutableList<Articles>)
                    }
                }
                DataWrapper.Status.ERROR -> {
                    it.message?.let { it1 -> Utils.showToast(requireContext(), it1) }
                }
            }
        })
    }

}