package com.sagarock101.newsheadlines.fragments

import android.os.Build
import android.os.Bundle
import android.transition.TransitionInflater
import androidx.annotation.RequiresApi
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

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(android.R.transition.move)
    }

    override fun initView() {
        viewModel = injectViewModel(viewModelFactory)

//        if(arguments != null) {
//            binding.imgUrl = arguments?.getString("imgUrl") ?: ""
//        }
    }
}