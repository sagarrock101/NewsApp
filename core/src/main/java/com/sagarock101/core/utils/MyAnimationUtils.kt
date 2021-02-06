package com.sagarock101.core.utils

import android.R
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.view.View
import android.view.ViewAnimationUtils
import android.view.ViewTreeObserver
import android.view.animation.AccelerateInterpolator
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import timber.log.Timber
import kotlin.math.sqrt


object MyAnimationUtils {
    fun View.enterFabReveal() {
        if(visibility == View.VISIBLE)
            return
        val cx = measuredHeight / 2
        val cy = measuredWidth / 2
        val finalRadius = width.coerceAtLeast(height).div(2)
        try {
            val anim =
                ViewAnimationUtils.createCircularReveal(this, cx, cy, 0f, finalRadius.toFloat())
            visibility = View.VISIBLE
            anim.start()
        } catch (e: Exception) {
            Timber.e(e.message)
        }
    }

    fun View.exitFabReveal() {
        val cx = measuredWidth / 2
        val cy = measuredHeight / 2

        val initialRadius = width / 2

        try {
            val anim: Animator =
                ViewAnimationUtils.createCircularReveal(this, cx, cy, initialRadius.toFloat(), 0f)

            anim.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator?) {
                    super.onAnimationEnd(animation)
                    visibility = View.INVISIBLE
                }
            })

            anim.start()
        } catch (e: Exception) {
            Timber.e(e.message)
        }
    }

    fun View.startColorAnimation(
        startColor: Int,
        endColor: Int,
        duration: Int = 2000
    ) {
        val anim = ValueAnimator()
        anim.setIntValues(startColor, endColor)
        anim.setEvaluator(ArgbEvaluator())
        anim.addUpdateListener { valueAnimator -> setBackgroundColor((valueAnimator.animatedValue as Int)) }
        anim.duration = duration.toLong()
        anim.start()
    }

    fun View.enterReveal2FromFab(fabWidth: Int, fabHeight: Int) {
        val cx: Int = (fabHeight / 2).toInt()
        val cy: Int = (fabWidth / 2).toInt()
        val width: Int = getWidth()
        val height: Int = getHeight()
        val duration =
            context.resources.getInteger(R.integer.config_longAnimTime)

        //Simply use the diagonal of the view

        //Simply use the diagonal of the view
        val finalRadius =
            Math.sqrt(width * width + height * height.toDouble()).toFloat()
        val anim =
            ViewAnimationUtils.createCircularReveal(this, cx, cy, 0f, finalRadius)
                .setDuration(duration.toLong())
        anim.interpolator = FastOutSlowInInterpolator()
        anim.start()
    }

    fun View.startRevealOnGlobalLayoutChangeForActivity(
        revealX: Int,
        revealY: Int,
        startColor: Int,
        endColor: Int
    ) {
        viewTreeObserver.addOnGlobalLayoutListener(object :
            ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                revealActivity(revealX, revealY)
                viewTreeObserver.removeOnGlobalLayoutListener(this)
                startColorAnimation(startColor, endColor)
            }
        })
    }

    fun View.revealActivity(x: Int, y: Int) {
        val circularReveal: Animator =
            ViewAnimationUtils.createCircularReveal(
                this, x, y, 0f, ((Math.max(
                    width,
                    height
                ) * 1.1).toFloat())
            )
        circularReveal.setDuration(400)
        circularReveal.setInterpolator(AccelerateInterpolator())
        visibility = View.VISIBLE
        circularReveal.start()
    }

    fun View.unRevealActivity(
        x: Int,
        y: Int,
        startColor: Int,
        endColor: Int,
        action: (() -> Unit)? = null
    ) {
        startColorAnimation(startColor, endColor)
        val initRadius =
            sqrt((width * width + height * height).toDouble()).toFloat()
        val circularReveal = ViewAnimationUtils.createCircularReveal(
            this, x, y, initRadius, 0f
        )

        circularReveal.duration = 400
        circularReveal.interpolator = FastOutSlowInInterpolator()
        circularReveal.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                visibility = View.INVISIBLE
                action?.invoke()
            }
        })

        circularReveal.start()
    }


}