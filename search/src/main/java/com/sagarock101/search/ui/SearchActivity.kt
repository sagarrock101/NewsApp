package com.sagarock101.search.ui

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import android.view.ViewTreeObserver
import android.view.animation.AccelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import com.sagarock101.common.AppConstants
import com.sagarock101.core.utils.MyAnimationUtils.startColorAnimation
import com.sagarock101.core.utils.PreferenceHelper
import com.sagarock101.search.R
import com.sagarock101.search.databinding.ActivitySearchBinding
import com.sagarock101.stylekit.binding.getColorFromAttr
import timber.log.Timber
import kotlin.math.sqrt
import kotlin.properties.Delegates

class SearchActivity : AppCompatActivity() {
    //TODO: need to refactor the reveal animations to a helper class and also preferences
    lateinit var rootLayout: ConstraintLayout
    lateinit var binding: ActivitySearchBinding

    var revealX by Delegates.notNull<Int>()
    var revealY by Delegates.notNull<Int>()


    private val LIGHT_THEME = com.sagarock101.stylekit.R.style.LightTheme
    private val DARK_THEME = com.sagarock101.stylekit.R.style.DarkTheme

    private var themeSelected: Int? = null

    lateinit var preferenceHelper: PreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        revealX = intent.getIntExtra("revealX", 0)
        revealY = intent.getIntExtra("revealY", 0)
        Timber.i("x and y values of fab $revealX, $revealY")
        setupSharedPreferences()
        setupTheme()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search)
        rootLayout = binding.clSearchRoot
        val viewTreeObserver = rootLayout.viewTreeObserver
        viewTreeObserver.addOnGlobalLayoutListener(object :
            ViewTreeObserver.OnGlobalLayoutListener {
            @SuppressLint("ResourceType")
            override fun onGlobalLayout() {
                revealActivity(revealX, revealY)
//                binding.clSearchRoot.enterReveal2FromFab(50, 50)
                rootLayout.viewTreeObserver.removeOnGlobalLayoutListener(this)
                animateRevealColorChanges()
            }
        })

    }

    private fun revealActivity(x: Int, y: Int) {
        val circularReveal: Animator =
            ViewAnimationUtils.createCircularReveal(rootLayout, x, y, 0f, ((Math.max(
                rootLayout.width,
                rootLayout.height
            ) * 1.1).toFloat())
            )
        circularReveal.setDuration(400)
        circularReveal.setInterpolator(AccelerateInterpolator())

        // make the view visible and start the animation

        // make the view visible and start the animation
        rootLayout.visibility = View.VISIBLE
        circularReveal.start()
    }

    private fun unRevealActivity() {
//       val initRadius = ((Math.max(
//            rootLayout.getWidth(),
//            rootLayout.getHeight()
//        ) * 1.1).toFloat())
        val initRadius =
            sqrt((rootLayout.width * rootLayout.width + rootLayout.height * rootLayout.height).toDouble()).toFloat()
        val circularReveal = ViewAnimationUtils.createCircularReveal(
            rootLayout, revealX, revealY, initRadius, 0f
        )

        circularReveal.duration = 400
        circularReveal.interpolator = FastOutSlowInInterpolator()
        circularReveal.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                rootLayout.setVisibility(View.INVISIBLE)
                finish()
            }
        })


        circularReveal.start()
    }

    override fun onBackPressed() {
        animateRevealColorChanges()
        unRevealActivity()
        super.onBackPressed()
    }

    private fun setupSharedPreferences() {
        preferenceHelper = PreferenceHelper(this)
        themeSelected = preferenceHelper.getStringToPreferences(AppConstants.UI_THEME_KEY, LIGHT_THEME)
    }

    private fun setupTheme() {
        themeSelected?.let { setTheme(it) }
    }

    @SuppressLint("ResourceType")
    private fun animateRevealColorChanges() {
        rootLayout.startColorAnimation(
            ResourcesCompat.getColor(resources, getColorFromAttr(R.attr.btmIconAndTextColor), null),
            ResourcesCompat.getColor(resources, getColorFromAttr(R.attr.bgColor), null), 2000
        )
    }

}