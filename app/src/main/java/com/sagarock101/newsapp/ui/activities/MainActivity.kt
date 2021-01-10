package com.sagarock101.newsapp.ui.activities

import android.animation.Animator
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.gson.Gson
import com.sagarock101.core.utilities.Utils
import com.sagarock101.newsapp.R
import com.sagarock101.newsapp.databinding.ActivityMainBinding
import com.sagarock101.newsheadlines.data.remote.NewsHeadlinesService
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), NavController.OnDestinationChangedListener {

    lateinit var binding: ActivityMainBinding
    private val navController by lazy { findNavController(R.id.nav_main_fragment) }
    private var objectAnimatorShowBtm: ObjectAnimator? = null
    private var objectAnimatorHideBtm: ObjectAnimator? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        when (destination.id) {
            R.id.newsDetailFragment -> {
                hideBtmNavBar()
            }
            else -> showBtnNavBar()
        }
    }

    private fun showBtnNavBar() {
        val listener = object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                objectAnimatorShowBtm?.removeAllListeners()
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationStart(animation: Animator?) {
                binding.btmNav.visibility = View.VISIBLE
            }

        }
        objectAnimatorShowBtm = ObjectAnimator.ofFloat(
            binding.btmNav,
            View.TRANSLATION_Y,
            binding.btmNav.height.toFloat(),
            0f
        ).apply {
            duration = 500
            addListener(listener)
            start()
        }
    }

    private fun hideBtmNavBar() {
        val listener = object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                binding.btmNav.visibility = View.GONE
                objectAnimatorHideBtm?.removeAllListeners()
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationStart(animation: Animator?) {
            }

        }
        objectAnimatorHideBtm = ObjectAnimator.ofFloat(
            binding.btmNav,
            View.TRANSLATION_Y,
            0f,
            binding.btmNav.height.toFloat()
        ).apply {
            duration = 500
            start()
            addListener(listener)
        }


    }

    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(this)
    }


    override fun onPause() {
        super.onPause()
        navController.removeOnDestinationChangedListener(this)
    }


}