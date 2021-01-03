package com.sagarock101.newsheadlines.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.sagarock101.core.adapter.BaseAdapter
import com.sagarock101.newsheadlines.model.Articles

@BindingAdapter("app:items")
fun setItems(listView: RecyclerView, items: List<Any>?) {
    items?.let {
        (listView.adapter as BaseAdapter<Any>).setItems(items as MutableList<Any>)
    }
}

@BindingAdapter("app:imgSrc")
fun ImageView.setImage(url: String?) {
    val requestOptions = RequestOptions()
    requestOptions.apply {
        transform(
            CenterCrop(),
            RoundedCorners(16)
        )
    }
    url?.let {
        Glide.with(context).load(it)
            .apply(requestOptions).into(this)

    }
}