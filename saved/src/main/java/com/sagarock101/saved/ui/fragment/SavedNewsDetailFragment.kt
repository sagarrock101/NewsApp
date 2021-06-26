package com.sagarock101.saved.ui.fragment

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.net.Uri
import android.view.View
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
import com.sagarock101.core.utils.Utils
import com.sagarock101.core.utils.Utils.setOnSingleClickListener
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.saved.R
import com.sagarock101.saved.binding.*
import com.sagarock101.saved.databinding.FragmentSavedNewsDetailBinding
import com.sagarock101.saved.viewmodel.SavedNewsViewModel
import com.sagarock101.stylekit.binding.setTransparentStatusBar
import com.sagarock101.widget.MyAppWidgetProvider
import javax.inject.Inject

class SavedNewsDetailFragment :
    BaseViewModelFragment<FragmentSavedNewsDetailBinding, SavedNewsViewModel>(),
    View.OnClickListener, Transition.TransitionListener, AppBarLayout.OnOffsetChangedListener {
    //TODO: need to make ll to extend fab and have ll fab behavior so it can go up when snack is shown currently handling it using translation
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val args: SavedNewsDetailFragmentArgs by navArgs()

    override fun getLayout() = R.layout.fragment_saved_news_detail

    private var isFabRotated = false

    private var isSaved = false

    private var snackBarDismissListener: Snackbar.Callback? = null

    override fun initView(view: View) {
        setHasOptionsMenu(true)
        (activity)?.setTransparentStatusBar()
        sharedElementEnterTransition = TransitionInflater.from(context)
            .inflateTransition(R.transition.new_shared_element_transition)
        (sharedElementEnterTransition as? Transition)?.addListener(this)
        if (args.articles?.urlToImage != null)
            postponeEnterTransition()
        viewModel = injectViewModel(viewModelFactory)
        startEnterTransitionAfterLoadingImage()
        hideChildFabs()
        binding?.appBar?.addOnOffsetChangedListener(this)
        setClickListener()
        setSaveObserver()
        snackBarDismissListener = object : Snackbar.Callback() {

            override fun onDismissed(sb: Snackbar?, event: Int) {
                binding.llFab.animate().translationY(0f)
            }

            override fun onShown(sb: Snackbar?) {
            }
        }
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
        binding.fabSave.setOnSingleClickListener(this, 2000)
        binding.fabShare.setOnClickListener(this)
    }

    private fun startEnterTransitionAfterLoadingImage() {
        binding.article = args.articles
        binding.tvTitle.transitionName = args?.articles?.title ?: ""
        binding.tvPublishedDate.transitionName = args?.articles?.source?.name + " " + args.articles?.publishedAt
        binding.ivNewsImg.apply {
            transitionName = args?.articles?.urlToImage ?: ""
            args.articles?.urlToImage?.let {
                startTransitionAfterImageLoad(args?.articles?.urlToImage ?: "") {
                    startPostponedEnterTransition()
                }
            } ?: kotlin.run {
                setImageResource(R.drawable.ic_news)
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

        args.articles?.let {
//            try {
//                it.publishedAt = DateUtils.getCurrentTimeStamp()
//            } catch (e: Exception) {
//                Utils.showToast(requireContext(), "${e.message}")
//            }
            viewModel.insertNews(it)
            showSnack("Saved")
        }
        Utils.refreshWidget(
            requireContext(),
            MyAppWidgetProvider::class.java.name,
            com.sagarock101.widget.R.id.stack_view
        )

    }

    private fun showSnack(actionName: String) {
        val sb = Snackbar.make(binding.colParent, actionName, Snackbar.LENGTH_SHORT)
        val snackbarView = sb.view
        sb.addCallback(snackBarDismissListener)
            .show()
        snackbarView.height.toFloat().let {
            binding.llFab.animate().translationY(-120f)
        }
    }

    private fun deleteArticle() {
        args.articles?.let {
            viewModel.deleteNews(it)
            showSnack("Removed")
        }
        Utils.refreshWidget(
            requireContext(),
            MyAppWidgetProvider::class.java.name,
            com.sagarock101.widget.R.id.stack_view
        )

    }

    private fun shareArticle() {
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, args?.articles?.title)
            putExtra(Intent.EXTRA_TEXT, args.articles?.url)
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
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(args.articles?.url))
        startActivity(intent)
    }


    override fun onTransitionEnd(transition: Transition) {
        with(binding) {
            cvContent.visibility = View.VISIBLE
            btnReadFullStory.visibility = View.VISIBLE
            tvPublishedDate.visibility = View.VISIBLE
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
        viewModel.clearViewModelMLDs()
        super.onDestroyView()
    }

    override fun isNetworkActive(isActive: Boolean) {

    }

}