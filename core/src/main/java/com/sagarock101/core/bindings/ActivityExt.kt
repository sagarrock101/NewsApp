package com.sagarock101.core.bindings

import android.app.Activity
import android.graphics.Color
import android.view.View
import androidx.core.content.res.ResourcesCompat
import com.sagarock101.core.R

fun Activity.setTransparentStatusBar() {
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
    window.statusBarColor = Color.TRANSPARENT
}

fun Activity.removeTransparentStatusBar() {
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
    window.statusBarColor = ResourcesCompat.getColor(resources, R.color.colorDarkPrimary, null)
}

