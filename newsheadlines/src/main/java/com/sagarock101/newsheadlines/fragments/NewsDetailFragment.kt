package com.sagarock101.newsheadlines.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.embibe.core.view.BaseFragment
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailBinding

class NewsDetailFragment : BaseFragment() {

    lateinit var binding: FragmentNewsDetailBinding

    override fun bindView(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = FragmentNewsDetailBinding.inflate(inflater)
        return binding.root
    }
}