package com.sagarock101.stylekit.binding

import androidx.fragment.app.Fragment
import com.sagarock101.stylekit.R

fun Fragment.changeStatusBarBasedOnTheme() {
    if(activity?.getThemeId() == R.style.LightTheme) {
        (activity)?.removeTransparentStatusBar(com.sagarock101.stylekit.R.color.colorDarkPrimary_Light)
    } else (activity)?.removeTransparentStatusBar(com.sagarock101.stylekit.R.color.purple_700)
}
