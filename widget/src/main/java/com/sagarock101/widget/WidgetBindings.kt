package com.sagarock101.widget

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewAnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.sagarock101.core.utils.Utils
import kotlin.math.max

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
            .listener(requestGlideListener())
            .into(this)

    } ?: kotlin.run {
        Glide.with(context).load(R.drawable.ic_news)
            .listener(requestGlideListener())
            .dontAnimate()
            .into(this)
    }
}

fun View.requestGlideListener(): RequestListener<Drawable> {
    return object : RequestListener<Drawable> {
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
            circularRevealedAtCenter()
            return false
        }
    }
}

fun View.circularRevealedAtCenter() {
    val view = this
    val cx = (view.left + view.right) / 2
    val cy = (view.top + view.bottom) / 2
    val finalRadius = max(view.width, view.height)

    if (view.isAttachedToWindow) {
        ViewAnimationUtils.createCircularReveal(view, cx, cy, 0f, finalRadius.toFloat())
            .apply {
                view.visible()
                duration = 550
                start()
            }
    }
}

fun View.visible() {
    visibility = View.VISIBLE
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

@BindingAdapter("app:textLikeNewsPaper")
fun TextView.bindTextLikeNewsText(desc: String?) {
    if(desc.isNullOrEmpty()) {
        visibility = View.GONE
        return
    }
    text = desc?.let {
        Utils.getSpannable(this.context,
            it, 2f, R.color.black, 0, 1)
    }
}