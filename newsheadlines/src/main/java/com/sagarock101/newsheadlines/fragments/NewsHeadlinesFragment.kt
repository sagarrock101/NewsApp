package com.sagarock101.newsheadlines.fragments

import android.os.Bundle
import android.view.View
import androidx.core.view.doOnPreDraw
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.interfaces.Injectable
import com.sagarock101.core.utilities.SnapHelper
import com.sagarock101.core.utilities.Utils
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBinding
import com.sagarock101.newsheadlines.model.Articles
import com.sagarock101.newsheadlines.model.NewsHeadLines
import com.sagarock101.newsheadlines.ui.adapter.TopHeadlinesAdapter
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import javax.inject.Inject

class NewsHeadlinesFragment : BaseViewModelFragment<FragmentNewsHeadlinesBinding, NewsHeadlinesViewModel>(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun getLayout() = R.layout.fragment_news_headlines

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = injectViewModel(viewModelFactory)
        viewModel.getNewsHeadLines()
    }

    override fun initView(view: View) {
        binding.vm = viewModel
        viewModel.newsHeadLinesLD.observe(viewLifecycleOwner, Observer {
            when(it.status) {
                DataWrapper.Status.LOADING -> {

                }
                DataWrapper.Status.SUCCESS -> {
                    attachSnapToRvWithData(it)
                }
                DataWrapper.Status.ERROR -> {
                    it.message?.let { it1 -> Utils.showToast(requireContext(), it1) }
                }
            }
        })
        postponeEnterTransition()
        view.doOnPreDraw {
            startPostponedEnterTransition()
        }
    }

    private fun attachSnapToRvWithData(it: DataWrapper<NewsHeadLines>) {
        val snapHelper = SnapHelper()
        binding.rvNews.adapter = TopHeadlinesAdapter() { imageView, data ->
            val bundle = Bundle()
            var extras: FragmentNavigator.Extras? = null
            bundle.apply {
                putString("imgUrl", data.urlToImage)
            }
            extras = FragmentNavigatorExtras(
                imageView to "news"
            )
            findNavController().navigate(R.id.action_newsHeadlinesFragment_to_newsDetailFragment, bundle, null, extras)
        }.apply {
            setItems(it.data?.articles as MutableList<Articles>)
        }
        snapHelper.attachToRecyclerView(binding.rvNews)
    }

//    override fun onClick(data: Any?, imageView: ImageView) {
//        val bundle = Bundle()
//        var extras: FragmentNavigator.Extras? = null
//        if(data is Articles ) {
//            bundle.apply {
//                putString("imgUrl", data.urlToImage)
//            }
//            extras = FragmentNavigatorExtras(
//                imageView to "news"
//            )
//        }
//        findNavController().navigate(R.id.action_newsHeadlinesFragment_to_newsDetailFragment, bundle, null, extras)
//    }


}