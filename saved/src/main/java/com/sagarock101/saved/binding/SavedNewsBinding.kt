package com.sagarock101.saved.binding

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.sagarock101.core.adapter.BaseAdapter
import com.sagarock101.core.utils.BindingUtils
import com.sagarock101.core.utils.DateUtils
import com.sagarock101.core.utils.Utils
import com.sagarock101.saved.R
import java.sql.Timestamp

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
            CenterCrop()
        )
    }
    url?.let {
        Glide.with(context).load(it)
            .apply(requestOptions.placeholder(R.drawable.ic_news))
            .dontAnimate()
            .into(this)

    } ?: kotlin.run {
        Glide.with(context).load(R.drawable.ic_news)
            .dontAnimate()
            .into(this)
    }
}

fun ImageView.startTransitionAfterImageLoad(url: String, onFinished: () -> Unit) {
    if (url.isNotEmpty()) {
        Glide.with(context)
            .load(url)
            .listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    onFinished.invoke()
                    return false
                }

            }).into(this)
    } else {
        this.setImageResource(R.drawable.ic_news)
    }

}

fun View.rotateFab(rotate: Boolean): Boolean {
    this.animate().setDuration(200)
        .setListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator?) {
                visibility = View.VISIBLE
                super.onAnimationEnd(animation)
            }
        })
        .rotation(if (rotate) 135f else 0f)
    return rotate
}

fun View.showFab() {
    this.visibility = View.VISIBLE
    this.alpha = 0f
    this.translationY = this.height.toFloat()
    this.animate()
        .setDuration(200)
        .translationY(0f)
        .setListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
            }
        })
        .alpha(1f)
        .start()
}

fun View.hideFab() {
    this.visibility = View.VISIBLE
    this.alpha = 1f
    this.translationY = 0f
    this.animate()
        .setDuration(200)
        .translationY(this.height.toFloat())
        .setListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                visibility = View.GONE
                super.onAnimationEnd(animation)
            }
        }).alpha(0f)
        .start()
}

fun View.hideChildFabInitially() {
    this.visibility = View.GONE
    this.translationY = this.height.toFloat()
    this.alpha = 0f
}

@BindingAdapter("app:bindSource", "app:publishedAt")
fun TextView.bindSourceAndTime(source: String, publishedAt: Timestamp) {
    text = BindingUtils.getSourceAndTime(source, publishedAt)
}

@BindingAdapter("app:formatDate")
fun TextView.getFormattedDate(unFormattedDate: Timestamp) {
    text = DateUtils.parseDate(unFormattedDate.toString())
}

@BindingAdapter("app:textLikeNewsPaper")
fun TextView.bindTextLikeNewsText(desc: String?) {
    text = desc?.let {
        Utils.getSpannable(this.context,
            it, 2f, R.color.black, 0, 1)
    }
}