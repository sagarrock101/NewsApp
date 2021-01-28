package com.sagarock101.newsapp.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavGraph
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sagarock101.stylekit.binding.removeTransparentStatusBar
import com.sagarock101.core.di.ViewModelFactory
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.newsapp.R
import com.sagarock101.newsapp.databinding.FragmentSplashBinding
import com.sagarock101.newsheadlines.viewmodel.NewsViewModel
import com.sagarock101.stylekit.binding.changeStatusBarBasedOnTheme
import com.sagarock101.stylekit.binding.getThemeId
import dagger.android.support.DaggerFragment
import java.lang.Exception
import javax.inject.Inject

class SplashFragment : DaggerFragment() {

    lateinit var binding: FragmentSplashBinding

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var viewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        changeStatusBarBasedOnTheme()
        binding = FragmentSplashBinding.inflate(inflater)
        viewModel = injectViewModel(viewModelFactory)
//        activity?.removeTransparentStatusBar()
        (activity)?.findViewById<BottomNavigationView>(R.id.btm_nav)?.visibility = View.GONE
        (activity)?.findViewById<ConstraintLayout>(R.id.custom_app_bar)?.visibility = View.GONE
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            (activity)?.findViewById<BottomNavigationView>(R.id.btm_nav)?.visibility = View.GONE
            (activity)?.findViewById<ConstraintLayout>(R.id.custom_app_bar)?.visibility = View.VISIBLE
            navigateToNewsHeadlines()
        }, 1000)
        return binding.root
    }

    private fun navigateToNewsHeadlines() {
        try {
//            val graph = findNavController().graph.findNode(R.id.navigation_news_headlines)
//            if (graph is NavGraph) {
//                graph.startDestination = R.id.newsHeadlinesFragment
//            }
            findNavController().navigate(R.id.action_splashFragment_to_newsHeadlinesFragment3)
        } catch (e: Exception) {
            Log.e(this.javaClass.name, "${e.message}")
        }
    }

    override fun onPause() {
        super.onPause()
    }

}