package com.sagarock101.newsheadlines.ui.fragments

import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.transition.TransitionInflater
import com.google.android.material.appbar.AppBarLayout
import com.sagarock101.core.bindings.setTransparentStatusBar
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.binding.startTransitionAfterImageLoad
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailBinding
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class NewsDetailFragment :
    BaseViewModelFragment<FragmentNewsDetailBinding, NewsHeadlinesViewModel>(),
    View.OnClickListener, AppBarLayout.OnOffsetChangedListener, androidx.transition.Transition.TransitionListener {

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
        (sharedElementEnterTransition as? androidx.transition.ChangeBounds)?.addListener(this)
        postponeEnterTransition()
        viewModel = injectViewModel(viewModelFactory)
        startEnterTransitionAfterLoadingImage()
    }

    private fun startEnterTransitionAfterLoadingImage() {
        binding.article = args.article
        binding.tvTitle.transitionName = args?.article?.title ?: ""
        binding.ivNewsImg.apply {
            transitionName = args?.article?.urlToImage ?: ""
            startTransitionAfterImageLoad(args?.article?.urlToImage ?: "") {
                startPostponedEnterTransition()
            }
        }
        binding.ivBack.setOnClickListener(this)
        binding.appBar.addOnOffsetChangedListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.ivBack -> {
                findNavController().popBackStack()
            }
        }
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        if (verticalOffset == 0)
            binding.ivBack.visibility = View.GONE
        else binding.ivBack.visibility = View.VISIBLE
    }


    override fun onTransitionEnd(transition: androidx.transition.Transition) {
        binding.tvContent.visibility = View.VISIBLE
        binding.tvDesc.visibility = View.VISIBLE
    }

    override fun onTransitionResume(transition: androidx.transition.Transition) {
    }

    override fun onTransitionPause(transition: androidx.transition.Transition) {
    }

    override fun onTransitionCancel(transition: androidx.transition.Transition) {
    }

    override fun onTransitionStart(transition: androidx.transition.Transition) {
    }


}