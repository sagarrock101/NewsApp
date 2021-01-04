package com.sagarock101.newsheadlines.interfaces

import androidx.databinding.ViewDataBinding

interface OnClickRvItemListener {
    fun onClick(data: Any? = null, viewBinding: ViewDataBinding)
}