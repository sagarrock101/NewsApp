package com.sagarock101.newsheadlines.fragments

import androidx.lifecycle.ViewModelProvider
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailBinding
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import javax.inject.Inject

class NewsDetailFragment : BaseViewModelFragment<FragmentNewsDetailBinding, NewsHeadlinesViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun getLayout() = R.layout.fragment_news_detail

    override fun initView() {
        viewModel = injectViewModel(viewModelFactory)
    }
}