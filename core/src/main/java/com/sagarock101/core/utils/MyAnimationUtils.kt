package com.sagarock101.core.utils

import android.R
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.view.View
import android.view.ViewAnimationUtils
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import timber.log.Timber


object MyAnimationUtils {
    fun View.enterReveal() {
        val cx = measuredHeight / 2
        val cy = measuredWidth / 2
        val finalRadius = width.coerceAtLeast(height).div(2)
        try {
            val anim = ViewAnimationUtils.createCircularReveal(this, cx, cy, 0f, finalRadius.toFloat())
            visibility = View.VISIBLE
            anim.start()
        } catch (e: Exception) {
            Timber.e(e.message)
        }
    }

    fun View.exitReveal() {
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
        duration: Int
    ) {
        val anim = ValueAnimator()
        anim.setIntValues(startColor, endColor)
        anim.setEvaluator(ArgbEvaluator())
        anim.addUpdateListener { valueAnimator -> setBackgroundColor((valueAnimator.animatedValue as Int)) }
        anim.duration = duration.toLong()
        anim.start()
    }

    fun View.enterReveal2FromFab(fabWidth: Int, fabHeight: Int) {
        val cx: Int = (fabHeight/2).toInt()
        val cy: Int = (fabWidth/2).toInt()
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

}