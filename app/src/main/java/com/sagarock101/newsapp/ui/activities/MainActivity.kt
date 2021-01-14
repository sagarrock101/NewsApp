package com.sagarock101.newsapp.ui.activities

import android.animation.Animator
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import com.sagarock101.newsapp.R
import com.sagarock101.newsapp.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity

const val MIN_DISTANCE = 150

class MainActivity : DaggerAppCompatActivity(), NavController.OnDestinationChangedListener {
    private var x2: Float = 0.0f
    private var x1: Float = 0.0f
    lateinit var binding: ActivityMainBinding

    private val navController by lazy { findNavController(R.id.nav_main_fragment) }

    private var btmNavObjectAnimator: ObjectAnimator? = null
    private var btmNavAlphaObjectAnimator: ObjectAnimator? = null


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
            R.id.newsDetailFragment -> hideBtmNavBar()

            R.id.newsHeadlinesFragment -> showBtnNavBar()
        }
    }

    private fun showBtnNavBar() {
        val listener = object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                btmNavObjectAnimator?.removeAllListeners()
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationStart(animation: Animator?) {
                binding.btmNav.visibility = View.VISIBLE
                binding.btmNav.setBackgroundResource(R.color.white)
            }

        }
        btmNavAlphaObjectAnimator = ObjectAnimator.ofFloat(binding.btmNav, View.ALPHA, 0f, 1f)
        btmNavObjectAnimator = ObjectAnimator.ofFloat(
            binding.btmNav,
            View.TRANSLATION_Y,
            binding.btmNav.height.toFloat(),
            0f
        ).apply {
            addListener(listener)
            duration = 500
            start()
        }
    }

    private fun hideBtmNavBar() {
        val listener = object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                binding.btmNav.visibility = View.GONE
                btmNavObjectAnimator?.removeAllListeners()
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationStart(animation: Animator?) {
                binding.btmNav.setBackgroundResource(android.R.color.transparent)
            }

        }
        btmNavAlphaObjectAnimator = ObjectAnimator.ofFloat(binding.btmNav, View.ALPHA, 1f, 0f)
        btmNavObjectAnimator = ObjectAnimator.ofFloat(
            binding.btmNav,
            View.TRANSLATION_Y,
            0f,
            binding.btmNav.height.toFloat()
        ).apply {
            addListener(listener)
            duration = 500
            start()
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