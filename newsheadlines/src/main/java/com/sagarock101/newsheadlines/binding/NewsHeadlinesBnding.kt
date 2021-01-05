package com.sagarock101.newsheadlines.binding

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.sagarock101.core.adapter.BaseAdapter
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.model.Articles

@BindingAdapter("app:items")
fun setItems(listView: RecyclerView, items: List<Any>?) {
    items?.let {
        (listView.adapter as BaseAdapter<Any>).setItems(items as MutableList<Any>)
    }
}

@BindingAdapter("app:imgSrc")
fun ImageView.setImage(url: String?) {
    val listener =  object : RequestListener<Drawable> {
        override fun onLoadFailed(
            e: GlideException?,
            model: Any?,
            target: com.bumptech.glide.request.target.Target<Drawable>?,
            isFirstResource: Boolean
        ): Boolean {
            return false
        }

        override fun onResourceReady(
            resource: Drawable?,
            model: Any?,
            target: com.bumptech.glide.request.target.Target<Drawable>?,
            dataSource: DataSource?,
            isFirstResource: Boolean
        ): Boolean {
            return false
        }
    }
    val requestOptions = RequestOptions()
    requestOptions.apply {
        transform(
            CenterCrop(),
            RoundedCorners(16)
        )
    }
    url?.let {
        Glide.with(context).load(it)
            .apply(requestOptions.placeholder(R.drawable.ic_news))
            .listener(listener)
            .into(this)

    }
}