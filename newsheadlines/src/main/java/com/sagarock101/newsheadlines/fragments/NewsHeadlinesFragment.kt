package com.sagarock101.newsheadlines.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBinding

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
}