package com.sagarock101.core.utils

import android.R
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Context
import android.view.View
import android.view.ViewAnimationUtils
import android.widget.Toast
import timber.log.Timber
import java.lang.Exception


object Utils {

    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    @JvmStatic
    fun truncateExtra(content: String?): String? {
        return content?.replace("(\\[\\+\\d+ chars])".toRegex(), "") ?: ""
    }

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

        val anim: Animator =
            ViewAnimationUtils.createCircularReveal(this, cx, cy, initialRadius.toFloat(), 0f)

        anim.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator?) {
                super.onAnimationEnd(animation)
                visibility = View.INVISIBLE
            }
        })

        anim.start()
    }

}