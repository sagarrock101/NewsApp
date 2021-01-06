package com.sagarock101.newsheadlines.fragments

import android.view.View
import androidx.core.view.ViewCompat
import androidx.lifecycle.ViewModelProvider
import androidx.transition.TransitionInflater
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailBinding
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import javax.inject.Inject

class NewsDetailFragment :
    BaseViewModelFragment<FragmentNewsDetailBinding, NewsHeadlinesViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun getLayout() = R.layout.fragment_news_detail

    override fun initView(view: View) {
        val animation =
            TransitionInflater.from(context)
                .inflateTransition(R.transition.shared_element_transition)
        sharedElementEnterTransition = animation
        viewModel = injectViewModel(viewModelFactory)
        if (arguments != null) {
            val requestOptions = RequestOptions().dontTransform()
            Glide.with(binding.ivNewsImg).load(arguments?.getString("imgUrl")).apply(requestOptions)
                .into(binding.ivNewsImg)
            ViewCompat.setTransitionName(binding.ivNewsImg, arguments?.getString("title") ?: "")
        }

    }

}