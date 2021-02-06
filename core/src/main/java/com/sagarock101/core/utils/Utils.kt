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





}