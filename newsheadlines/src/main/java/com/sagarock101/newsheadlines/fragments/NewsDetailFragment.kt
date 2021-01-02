package com.sagarock101.newsheadlines.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.embibe.core.view.BaseViewModelFragment
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.interfaces.Injectable
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailBinding
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import javax.inject.Inject

class NewsDetailFragment : BaseViewModelFragment<FragmentNewsDetailBinding, NewsHeadlinesViewModel>(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun bindView(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = FragmentNewsDetailBinding.inflate(inflater)
        viewModel = injectViewModel(viewModelFactory)
        return binding.root
    }

    override fun getLayout() = R.layout.fragment_news_detail

    override fun initView() {
    }
}