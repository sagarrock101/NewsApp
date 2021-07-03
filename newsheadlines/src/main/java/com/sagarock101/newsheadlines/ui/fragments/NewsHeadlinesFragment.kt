package com.sagarock101.newsheadlines.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.ViewTreeObserver
import androidx.core.view.ViewCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.sagarock101.common.AppConstants
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.interfaces.Injectable
import com.sagarock101.core.interfaces.OnSnapPositionChangeListener
import com.sagarock101.core.utils.SnapHelper
import com.sagarock101.core.utils.SnapOnScrollListener
import com.sagarock101.core.utils.Utils
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.database.model.Articles
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBinding
import com.sagarock101.newsheadlines.ui.adapter.TopHeadlinesAdapter
import com.sagarock101.newsheadlines.viewmodel.NewsViewModel
import com.sagarock101.stylekit.binding.changeStatusBarBasedOnTheme
import timber.log.Timber
import java.lang.Exception
import javax.inject.Inject

class NewsHeadlinesFragment :
    BaseViewModelFragment<FragmentNewsHeadlinesBinding, NewsViewModel>(), Injectable,
    OnSnapPositionChangeListener, ChipGroup.OnCheckedChangeListener, View.OnClickListener {

    private lateinit var snapHelper: SnapHelper
    private var snapOnScrollListener: SnapOnScrollListener? = null
    private var preDrawListener: ViewTreeObserver.OnPreDrawListener? = null

    private var prevCheckedId: Int? = null

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private var adapter: TopHeadlinesAdapter? = null

    private var handler: Handler? = null

    override fun getLayout() = R.layout.fragment_news_headlines


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = injectViewModel(viewModelFactory)
        snapHelper = SnapHelper()
    }

    override fun onResume() {
        super.onResume()
        setUpSnapToRv()
    }

    override fun onPause() {
        binding.shimmer.stopShimmer()
        snapHelper.attachToRecyclerView(null)
        snapOnScrollListener = null
        super.onPause()
    }

    override fun initView(view: View) {
        handler = Handler(Looper.getMainLooper())
        changeStatusBarBasedOnTheme()
        setAdapterToRecyclerView()
        setUpSnapToRv()
        postponeRvTransition()
        binding.chipGroup.setOnCheckedChangeListener(this)
        viewModel.newsHeadLinesLD.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                DataWrapper.Status.LOADING -> {
                    binding.shimmer.visibility = View.VISIBLE
                    binding.shimmer.startShimmer()
                }
                DataWrapper.Status.SUCCESS -> {
                    binding.shimmer.stopShimmer()
                    binding.shimmer.visibility = View.GONE
                    binding.rvNews.visibility = View.VISIBLE
                    binding.indicator.visibility = View.VISIBLE
                    adapter?.apply {
                        setItems(it.data?.articles as MutableList<Articles>)
                    }
                    binding.layoutNoNetwork.svNoNetwork.visibility = View.GONE
                }
                DataWrapper.Status.ERROR -> {
                    binding.shimmer.stopShimmer()
                    binding.shimmer.visibility = View.GONE
                    it.message?.let { it1 -> Utils.showToast(requireContext(), it1) }
                }
            }
        })
    }

    private fun setUpSnapToRv() {
        if (snapOnScrollListener == null) {
            snapHelper.attachToRecyclerView(binding.rvNews)
            snapOnScrollListener = SnapOnScrollListener(snapHelper, this)
            binding.shimmer.startShimmer()
            binding.rvNews.apply {
                snapOnScrollListener?.let {
                    addOnScrollListener(it)
                }
            }
        }
    }


    private fun setAdapterToRecyclerView() {
        adapter = TopHeadlinesAdapter()
        var extras: FragmentNavigator.Extras?
        adapter?.apply {
            this.viewModel = this@NewsHeadlinesFragment.viewModel
        }?.onItemClick = { imageView, textView, data ->
            adapter?.listItems?.indexOf(data)?.let {
                handler?.postDelayed({
                    binding.rvNews.scrollToPosition(it)
                }, 1)
            }
            val directions =
                NewsHeadlinesFragmentDirections.actionNewsHeadlinesFragmentToNewsDetailFragment(data)
            extras = FragmentNavigatorExtras(
                imageView to ViewCompat.getTransitionName(imageView)!!,
                textView to ViewCompat.getTransitionName(textView)!!
            )
            viewModel.lastSelectedChipId = binding.chipGroup.checkedChipId
            findNavController().navigate(
                directions,
                extras ?: FragmentNavigatorExtras()
            )
        }

    }

    private fun postponeRvTransition() {
        preDrawListener = ViewTreeObserver.OnPreDrawListener {
            startPostponedEnterTransition()
            true
        }
        binding.rvNews.apply {
            adapter = this@NewsHeadlinesFragment.adapter
            postponeEnterTransition()
            viewTreeObserver
                .addOnPreDrawListener(preDrawListener)
        }
        binding.indicator.attachToRecyclerView(binding.rvNews)

    }

    override fun onSnapPositionChange(position: Int, previousPosition: Int) {
        adapter?.notifyChange(position, true)
        adapter?.listItems?.size?.let {
            if ((it - 1) != previousPosition) {
                adapter?.notifyChange(previousPosition, false)
            }
        }
    }

    override fun onCheckedChanged(group: ChipGroup?, checkedId: Int) {
        when (checkedId) {
            binding.chipAll.id -> {
                binding.chipAll.callApiIfChipIsPressed()
            }
            binding.chipBusiness.id -> {
                binding.chipBusiness.callApiIfChipIsPressed(getString(R.string.business))
            }
            binding.chipEntertainment.id -> {
                binding.chipEntertainment.callApiIfChipIsPressed(getString(R.string.entertainment))
            }
            binding.chipHealth.id -> {
                binding.chipHealth.callApiIfChipIsPressed(getString(R.string.health))
            }
            binding.chipSports.id -> {
                binding.chipSports.callApiIfChipIsPressed(getString(R.string.sports))
            }
            binding.chipTechnology.id -> {
                binding.chipTechnology.callApiIfChipIsPressed(getString(R.string.technology))
            }
            binding.chipScience.id -> {
                binding.chipScience.callApiIfChipIsPressed(getString(R.string.science))
            }
        }
    }

    private fun scrollToFirstArticle() {
        adapter?.itemCount?.let {
            if (it > 0)
                binding.rvNews.scrollToPosition(0)
        }
    }

    private fun getNews(category: String = "") {
        binding.shimmer.apply {
            visibility = View.VISIBLE
            startShimmer()
            binding.rvNews.visibility = View.GONE
            binding.indicator.visibility = View.GONE
        }
        handler?.postDelayed({
            viewModel.getNewsHeadLines(category)
            scrollToFirstArticle()
        }, 1000)
    }

    override fun onDestroyView() {
        handler = null
        binding.chipGroup.setOnCheckedChangeListener(null)
        snapHelper.clear()
        viewModel.lastSelectedChipId = binding.chipGroup.checkedChipId
        binding.rvNews.layoutManager = null
        binding.rvNews.adapter = null
        adapter?.onItemClick = null
        adapter = null
        preDrawListener = null
        super.onDestroyView()
    }

    override fun isNetworkActive(isActive: Boolean) {
        if (!isActive)
            showNoWifiMsg()
        else hideNoWifiMsg()
    }

    private fun hideNoWifiMsg() {
//        callApiForOnlyAllChipSelected()
        if (binding.chipAll.isChecked) {
            if (adapter?.listItems?.size!! <= 0)
                viewModel.getNewsHeadLines()
        }

        binding.layoutNoNetwork.svNoNetwork.visibility = View.GONE
    }

    private fun showNoWifiMsg() {
        binding.layoutNoNetwork.svNoNetwork.visibility = View.VISIBLE
    }

    private fun Chip.callApiIfChipIsPressed(category: String = "") {
        if (this.isPressed)
            getNews(category)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        try {
            outState.putInt(AppConstants.SELECTED_CHIP_KEY, binding.chipGroup.checkedChipId)
        } catch (e: Exception) {
            Timber.e("${e.message}")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        prevCheckedId = savedInstanceState?.getInt(AppConstants.SELECTED_CHIP_KEY)
        if ((prevCheckedId == null || prevCheckedId == binding.chipAll.id)
            && (viewModel.lastSelectedChipId == binding.chipAll.id || viewModel.lastSelectedChipId == -1)
        ) {
            viewModel.getNewsHeadLines()
        }
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.layoutNoNetwork.btnRetry -> {
                callApiForOnlyAllChipSelected()
            }
        }
    }

    private fun callApiIfAnyOfChipSelected() {
        val chips = binding.chipGroup
        for (chipIndex in 0 until chips.childCount) {
            val chip = chips.getChildAt(chipIndex) as? Chip
            if (chip?.isPressed!!)
                chip.callApiIfChipIsPressed(chip.text.toString())
        }
    }

    private fun callApiForOnlyAllChipSelected() {
        val chips = binding.chipGroup
        val chip = chips.getChildAt(0) as? Chip
        if (chip?.isChecked!!) {
            chip?.isPressed = true
            chip.callApiIfChipIsPressed()
        }
    }

}