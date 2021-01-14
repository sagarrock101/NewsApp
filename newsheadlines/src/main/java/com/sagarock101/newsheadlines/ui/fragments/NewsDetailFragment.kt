package com.sagarock101.newsheadlines.ui.fragments

import android.content.Intent
import android.net.Uri
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.transition.Transition
import androidx.transition.TransitionInflater
import com.google.android.material.appbar.AppBarLayout
import com.sagarock101.core.bindings.setTransparentStatusBar
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.binding.*
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailBinding
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class NewsDetailFragment :
    BaseViewModelFragment<FragmentNewsDetailBinding, NewsHeadlinesViewModel>(),
    View.OnClickListener, Transition.TransitionListener, AppBarLayout.OnOffsetChangedListener {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val args: NewsDetailFragmentArgs by navArgs()

    override fun getLayout() = R.layout.fragment_news_detail

    private var isFabRotated = false

    override fun initView(view: View) {
        setHasOptionsMenu(true)
        (activity as DaggerAppCompatActivity).setTransparentStatusBar()
        sharedElementEnterTransition = TransitionInflater.from(context)
            .inflateTransition(android.R.transition.move)
        (sharedElementEnterTransition as? Transition)?.addListener(this)
        sharedElementReturnTransition = TransitionInflater.from(context)
            .inflateTransition(R.transition.shared_element_transition)
        postponeEnterTransition()
        viewModel = injectViewModel(viewModelFactory)
        startEnterTransitionAfterLoadingImage()
        binding.fabSave.hideChildFabInitially()
        binding.fabShare.hideChildFabInitially()
        binding.btnReadFullStory.setOnClickListener(this)
        binding.fabAdd.setOnClickListener(this)
        binding.appBar.addOnOffsetChangedListener(this)
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
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.ivBack -> {
                findNavController().popBackStack()
            }
            binding.btnReadFullStory -> {
                showAppChooserDialog()
            }
            binding.fabAdd -> {
                animateFab(v)
            }
        }
    }

    private fun animateFab(v: View) {
        isFabRotated = v.rotateFab(!isFabRotated)
        if (isFabRotated) {
            binding.fabShare.showFab()
            binding.fabSave.showFab()
        } else {
            binding.fabShare.hideFab()
            binding.fabSave.hideFab()
        }
    }

    private fun showAppChooserDialog() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(args.article?.url))
        startActivity(intent)
    }


    override fun onTransitionEnd(transition: Transition) {
        with(binding) {
            tvContent.visibility = View.VISIBLE
            tvDesc.visibility = View.VISIBLE
            btnReadFullStory.visibility = View.VISIBLE
        }

    }

    override fun onTransitionResume(transition: Transition) {
    }

    override fun onTransitionPause(transition: Transition) {
    }

    override fun onTransitionCancel(transition: Transition) {
    }

    override fun onTransitionStart(transition: Transition) {
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        if (verticalOffset == 0)
            binding.fabAdd.visibility = View.GONE
        else binding.fabAdd.visibility = View.VISIBLE
    }

}