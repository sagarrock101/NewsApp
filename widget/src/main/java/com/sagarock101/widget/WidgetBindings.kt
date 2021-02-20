package com.sagarock101.widget

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestOptions

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