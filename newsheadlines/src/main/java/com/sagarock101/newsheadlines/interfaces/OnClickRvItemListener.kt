package com.sagarock101.newsheadlines.interfaces

import android.widget.ImageView
import androidx.databinding.ViewDataBinding

interface OnClickRvItemListener {
    fun onClick(data: Any? = null, imageView: ImageView)
}