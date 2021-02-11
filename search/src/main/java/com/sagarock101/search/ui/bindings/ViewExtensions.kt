package com.sagarock101.search.ui.bindings

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
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
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.utils.DateUtils
import com.sagarock101.search.R
import com.sagarock101.search.model.Articles
import com.sagarock101.search.model.Results

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

@BindingAdapter("app:showViewBasedOnListSize")
fun View.showViewBasedOnListSize(items: List<Results>?) {
    items?.let {
        visibility = if (it.isNotEmpty()) View.VISIBLE else View.GONE
    } ?: kotlin.run {
        visibility = View.GONE
    }
}


@BindingAdapter("app:showProgressBasedOnStatus")
fun ProgressBar.showProgressBasedOnStatus(status: DataWrapper.Status?) {
    visibility = when(status) {
        DataWrapper.Status.LOADING -> View.VISIBLE
        DataWrapper.Status.SUCCESS -> View.GONE
        DataWrapper.Status.ERROR -> View.GONE
        else -> View.GONE
    }
}

@BindingAdapter("app:showTextWhenResultsAreEmpty" , "app:setItems")
fun TextView.showTextWhenResultsAreEmptyAfterSearch(status: DataWrapper.Status?, items: List<Results>?) {
    visibility = when(status) {
        DataWrapper.Status.LOADING -> View.GONE
        DataWrapper.Status.SUCCESS -> {
            items?.let {
                if(it.isNotEmpty()) View.GONE else {
                    View.VISIBLE
                }
            } ?: kotlin.run {
                View.GONE
            }
        }
        DataWrapper.Status.ERROR -> View.GONE
        else -> View.GONE
    }
}

@BindingAdapter("app:formatDate")
fun TextView.getFormattedDate(unFormattedDate: String) {
    text = DateUtils.parseDate(unFormattedDate)
}

