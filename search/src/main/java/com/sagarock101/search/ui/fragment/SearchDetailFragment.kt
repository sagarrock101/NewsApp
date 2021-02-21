package com.sagarock101.search.ui.fragment

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.core.widget.ImageViewCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.transition.Transition
import androidx.transition.TransitionInflater
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.snackbar.Snackbar
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.database.model.Articles
import com.sagarock101.database.model.Source
import com.sagarock101.search.R
import com.sagarock101.search.databinding.FragmentSearchItemDetailBinding
import com.sagarock101.search.model.Results
import com.sagarock101.search.ui.bindings.*
import com.sagarock101.search.ui.viewmodel.SearchViewModel
import com.sagarock101.stylekit.binding.setTransparentStatusBar
import javax.inject.Inject


class SearchDetailFragment :
    BaseViewModelFragment<FragmentSearchItemDetailBinding, SearchViewModel>(),
    View.OnClickListener, Transition.TransitionListener, AppBarLayout.OnOffsetChangedListener {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val args: SearchDetailFragmentArgs by navArgs()

    override fun getLayout() = R.layout.fragment_search_item_detail

    private var isFabRotated = false

    private var isSaved = false

    private var articles: Articles? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    findNavController().popBackStack()
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
    }

    override fun initView(view: View) {
        setHasOptionsMenu(true)
        (activity)?.setTransparentStatusBar()
        sharedElementEnterTransition = TransitionInflater.from(context)
            .inflateTransition(R.transition.new_shared_element_transition)
        (sharedElementEnterTransition as? Transition)?.addListener(this)
        postponeEnterTransition()
        viewModel = injectViewModel(viewModelFactory)
        startEnterTransitionAfterLoadingImage()
        hideChildFabs()
        binding.appBar.addOnOffsetChangedListener(this)
        setClickListener()
        translateSearchResultToArticle(args?.searchedResult)
        setSaveObserver()
    }

    private fun hideChildFabs() {
        binding.fabSave.hideChildFabInitially()
        binding.fabShare.hideChildFabInitially()
    }

    private fun setSaveObserver() {
        viewModel.savedLiveData.observe(this, Observer { isSaved ->
            this.isSaved = isSaved
            if (this.isSaved) {
                ImageViewCompat.setImageTintList(
                    binding.fabSave,
                    ColorStateList.valueOf(Color.BLACK)
                )
            } else {
                ImageViewCompat.setImageTintList(
                    binding.fabSave,
                    ColorStateList.valueOf(Color.WHITE)
                )
            }
        })
    }

    private fun setClickListener() {
        binding.btnReadFullStory.setOnClickListener(this)
        binding.fabAdd.setOnClickListener(this)
        binding.fabSave.setOnClickListener(this)
        binding.fabShare.setOnClickListener(this)
    }

    private fun startEnterTransitionAfterLoadingImage() {
        binding.result = args.searchedResult
        binding.tvTitle.transitionName = args?.searchedResult?.webTitle ?: ""
        binding.ivNewsImg.apply {
            transitionName = args?.searchedResult?.fields?.thumbnail ?: ""
            args.searchedResult?.fields?.thumbnail.let {
                startTransitionAfterImageLoad(it ?: "") {
                    startPostponedEnterTransition()
                }
            } ?: kotlin.run {
                binding.ivNewsImg.setImageResource(R.drawable.ic_news)
            }

        }
        binding.ivBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.ivBack -> findNavController().popBackStack()

            binding.btnReadFullStory -> showAppChooserDialog()

            binding.fabAdd -> animateFab(v)

            binding.fabShare -> shareArticle()

            binding.fabSave -> if (isSaved) deleteArticle() else saveArticle()

        }
    }

    private fun saveArticle() {
        args.searchedResult?.let {
            articles?.let { it1 -> viewModel.insertNews(it1) }
//            showSnack("Saved")
        }
    }

    private fun showSnack(actionName: String) {
        Snackbar.make(binding.colParent, actionName, Snackbar.LENGTH_SHORT).show()
    }

    private fun deleteArticle() {
        args.searchedResult?.let {
            articles?.let { it1 -> viewModel.deleteNews(it1) }
//            showSnack("Removed")
        }
    }

    private fun translateSearchResultToArticle(it: Results): Articles? {
        articles = Articles(
            Source(it.id, it.pillarName),
            "",
            it.webTitle,
            description = "",
            content = it.fields.bodyText,
            url = it.webUrl,
            urlToImage = it.fields.thumbnail
        )

        return articles
    }

    private fun shareArticle() {
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, args?.searchedResult?.webTitle)
            putExtra(Intent.EXTRA_TEXT, args?.searchedResult?.webUrl)
            startActivity(Intent.createChooser(sharingIntent, getString(R.string.share_using)))
        }
    }

    private fun animateFab(v: View) {
        isFabRotated = v.rotateFab(!isFabRotated)
        if (isFabRotated) {
            binding.fabShare.showFab()
            binding.fabSave.showFab()
            binding.fabAdd.visibility = View.VISIBLE
        } else {
            binding.fabShare.hideFab()
            binding.fabSave.hideFab()
            binding.fabAdd.visibility = View.VISIBLE
        }
    }

    private fun showAppChooserDialog() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(args?.searchedResult?.webUrl))
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
        if (verticalOffset == -binding.appBar.totalScrollRange) {
            binding.fabAdd.visibility = View.VISIBLE
            binding.fabShare.visibility = View.VISIBLE
            binding.fabSave.visibility = View.VISIBLE
            binding.ivGradient.visibility = View.VISIBLE
        } else {
            binding.fabAdd.visibility = View.GONE
            binding.fabShare.visibility = View.GONE
            binding.fabSave.visibility = View.GONE
            binding.ivGradient.visibility = View.GONE
        }
    }

    override fun onDestroyView() {
//        viewModel.clearViewModelMLDs()
        super.onDestroyView()
    }

    override fun isNetworkActive(isActive: Boolean) {

    }

}