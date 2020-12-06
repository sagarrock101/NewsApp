package com.sagarock101.newsapp.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavGraph
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sagarock101.newsapp.R
import com.sagarock101.newsapp.databinding.FragmentSplashBinding
import java.lang.Exception

class SplashFragment : Fragment() {

    lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater)
        (activity)?.findViewById<BottomNavigationView>(R.id.btm_nav)?.visibility = View.GONE
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            (activity)?.findViewById<BottomNavigationView>(R.id.btm_nav)?.visibility = View.VISIBLE
            navigateToNewsHeadlines()
        }, 1000)
        return binding.root
    }

    private fun navigateToNewsHeadlines() {
        try {
            val graph = findNavController().graph.findNode(R.id.navigation_news_headlines)
            if (graph is NavGraph) {
                graph.startDestination = R.id.newsHeadlinesFragment
            }
            findNavController().navigate(R.id.action_splashFragment_to_newsHeadlinesFragment3)
        } catch (e: Exception) {
            Log.e(this.javaClass.name, "${e.message}")
        }
    }

    override fun onPause() {
        super.onPause()
    }

}