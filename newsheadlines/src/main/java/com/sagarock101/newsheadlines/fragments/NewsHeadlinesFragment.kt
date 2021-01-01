package com.sagarock101.newsheadlines.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.embibe.core.view.BaseFragment
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBinding

class NewsHeadlinesFragment : BaseFragment() {

    lateinit var binding: FragmentNewsHeadlinesBinding

    override fun bindView(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = FragmentNewsHeadlinesBinding.inflate(inflater)
        binding.btnCheck.setOnClickListener {
            findNavController().navigate(R.id.action_newsHeadlinesFragment_to_newsDetailFragment)
        }
        return binding.root
    }
}