package com.sagarock101.stylekit.binding

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.util.TypedValue
import android.view.View
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.sagarock101.stylekit.R
import java.lang.reflect.Method

fun Activity.setTransparentStatusBar() {
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
    window.statusBarColor = Color.TRANSPARENT
}

@SuppressLint("ResourceType")
fun Activity.removeTransparentStatusBar(color: Int) {
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
    window.statusBarColor = ResourcesCompat.getColor(resources, color, null)
}

fun SnapHelper.getSnapPosition(recyclerView: RecyclerView): Int {
    val layoutManager = recyclerView.layoutManager ?: return RecyclerView.NO_POSITION
    val snapView = findSnapView(layoutManager) ?: return RecyclerView.NO_POSITION
    return layoutManager.getPosition(snapView)
}

@ColorInt
fun Context.getColorFromAttr(
    @AttrRes attrColor: Int,
    typedValue: TypedValue = TypedValue(),
    resolveRefs: Boolean = true
): Int {
    theme.resolveAttribute(attrColor, typedValue, resolveRefs)
    return typedValue.data
}


fun Activity.getThemeId(): Int {
    try {
        val wrapper: Class<*> = Context::class.java
        val method: Method = wrapper.getMethod("getThemeResId")
        method.isAccessible = true
        return method.invoke(this) as Int
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return 0
}

fun Activity.changeStatusBarBasedOnTheme() {
    if(getThemeId() == R.style.LightTheme) {
        removeTransparentStatusBar(R.color.colorDarkPrimary_Light)
    } else removeTransparentStatusBar(R.color.purple_700)
}

