package com.sagarock101.newsheadlines.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.embibe.core.view.BaseViewModelFragment
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.interfaces.Injectable
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBinding
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import javax.inject.Inject

class NewsHeadlinesFragment : Fragment() {


    lateinit var binding: FragmentNewsHeadlinesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsHeadlinesBinding.inflate(inflater)
        binding.btnCheck.setOnClickListener {
            findNavController().navigate(R.id.action_newsHeadlinesFragment_to_newsDetailFragment)
        }
        return binding.root
    }

//    override fun bindView(inflater: LayoutInflater, container: ViewGroup?): View {
//
//    }

//    override fun getLayout() = R.layout.fragment_news_headlines
//
//    override fun initView() {
//        viewModel = injectViewModel(viewModelFactory)
//        binding.btnCheck.setOnClickListener {
//            findNavController().navigate(R.id.action_newsHeadlinesFragment_to_newsDetailFragment)
//        }
//    }
}