package com.sagarock101.newsapp.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sagarock101.newsapp.R
import com.sagarock101.newsapp.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater)
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            findNavController().navigate(R.id.action_splashFragment_to_navigation_news_headlines)
        }, 1000)
        return binding.root
    }

    override fun onPause() {
        super.onPause()
    }

}