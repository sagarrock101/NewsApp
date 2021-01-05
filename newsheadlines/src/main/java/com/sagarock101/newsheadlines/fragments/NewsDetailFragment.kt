package com.sagarock101.newsheadlines.fragments

import android.os.Bundle
import android.view.View
import androidx.core.view.doOnPreDraw
import androidx.transition.TransitionInflater
import androidx.lifecycle.ViewModelProvider
import androidx.transition.ChangeBounds
import androidx.transition.Transition
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailBinding
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import javax.inject.Inject

class NewsDetailFragment : BaseViewModelFragment<FragmentNewsDetailBinding, NewsHeadlinesViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun getLayout() = R.layout.fragment_news_detail

    override fun initView(view: View) {
        val animation = TransitionInflater.from(context).inflateTransition(com.sagarock101.stylekit.R.transition.shared_element_transition)
        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation
        viewModel = injectViewModel(viewModelFactory)
        if(arguments != null) {
            binding.imgUrl = arguments?.getString("imgUrl") ?: ""
        }
        binding.ivNewsImg.transitionName = "news"
    }

    private fun enterTransition(): Transition? {
        val bounds = ChangeBounds()
        bounds.duration = 2000
        return bounds
    }

}