package com.sagarock101.newsheadlines.ui.fragments

import android.view.View
import android.view.WindowManager
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.transition.TransitionInflater
import com.sagarock101.core.bindings.setTransparentStatusBar
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.utilities.Utils
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.binding.startTransitionAfterImageLoad
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailBinding
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class NewsDetailFragment :
    BaseViewModelFragment<FragmentNewsDetailBinding, NewsHeadlinesViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val args: NewsDetailFragmentArgs by navArgs()

    override fun getLayout() = R.layout.fragment_news_detail

    override fun initView(view: View) {
        (activity as DaggerAppCompatActivity).setTransparentStatusBar()
        val animation =
            TransitionInflater.from(context)
                .inflateTransition(R.transition.shared_element_transition)
        sharedElementEnterTransition = animation
        postponeEnterTransition()
        viewModel = injectViewModel(viewModelFactory)
        if (arguments != null) {
            startEnterTransitionAfterLoadingImage()
        }

    }

    private fun startEnterTransitionAfterLoadingImage() {
        binding.article = args.article
        binding.ivNewsImg.apply {
            transitionName = args?.article?.title ?: ""
            startTransitionAfterImageLoad(args?.article?.urlToImage ?: "") {
                startPostponedEnterTransition()
            }
        }
    }

}