package com.sagarock101.core.bindings

import android.app.Activity
import android.graphics.Color
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.sagarock101.core.R
import com.sagarock101.core.utils.SnapHelper

fun Activity.setTransparentStatusBar() {
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
    window.statusBarColor = Color.TRANSPARENT
}

fun Activity.removeTransparentStatusBar() {
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
    window.statusBarColor = ResourcesCompat.getColor(resources, R.color.colorDarkPrimary, null)
}

fun SnapHelper.getSnapPosition(recyclerView: RecyclerView): Int {
    val layoutManager = recyclerView.layoutManager ?: return RecyclerView.NO_POSITION
    val snapView = findSnapView(layoutManager) ?: return RecyclerView.NO_POSITION
    return layoutManager.getPosition(snapView)
}

