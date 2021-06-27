package com.sagarock101.newsheadlines.ui.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.ViewCompat
import com.sagarock101.core.utils.Utils.setOnSingleClickListener
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBinding
import com.sagarock101.database.model.Articles
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.viewmodel.NewsViewModel

class TopHeadlineViewHolder(val binding: ItemNewsCardBinding)
    : BaseViewHolder<Articles>(binding) {
    var onItemClick: ((ImageView, TextView, Articles) -> Unit)? = null
    var viewModel: NewsViewModel? = null
    override fun bind(item: Articles) {
        binding.article = item
        binding.viewModel = viewModel
        ViewCompat.setTransitionName(binding.ivNewsImg, item.urlToImage ?: "")
        ViewCompat.setTransitionName(binding.tvTitle, item.title)
        itemView.setOnSingleClickListener(View.OnClickListener {
            if((binding.ivNewsImg.tag as Int) != R.drawable.ic_news) {
                onItemClick?.invoke(binding.ivNewsImg, binding.tvTitle, item)
                viewModel?.checkIfSaved(item)
            }
        }, 2000)
    }

    fun decreaseAlpha() {
        binding.viewAlphaLayer.alpha = 0.2f
    }

    fun increaseAlpha() {
        binding.viewAlphaLayer.alpha = 0.8f
    }

    companion object {
        fun from(
            parent: ViewGroup,
            onItemClick: ((ImageView, TextView, Articles) -> Unit)? = null,
            viewModel: NewsViewModel? = null
            ): BaseViewHolder<Articles> {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemNewsCardBinding.inflate(layoutInflater, parent, false)

            return TopHeadlineViewHolder(binding).apply {
                this.onItemClick = onItemClick
                this.viewModel = viewModel
            }
        }
    }
}