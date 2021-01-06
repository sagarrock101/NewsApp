package com.sagarock101.newsheadlines.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.ViewCompat
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBinding
import com.sagarock101.newsheadlines.interfaces.OnClickRvItemListener
import com.sagarock101.newsheadlines.model.Articles

class TopHeadlineViewHolder(val binding: ItemNewsCardBinding)
    : BaseViewHolder<Articles>(binding) {
    var onItemClick: ((ImageView, Articles) -> Unit)? = null
    override fun bind(item: Articles) {
        binding.article = item
        ViewCompat.setTransitionName(binding.ivNewsImg, item.title)
        itemView.setOnClickListener {
            onItemClick?.invoke(binding.ivNewsImg, item)
        }
    }

    companion object {
        fun from(
            parent: ViewGroup,
            onItemClick: (ImageView, Articles) -> Unit
            ): BaseViewHolder<Articles> {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemNewsCardBinding.inflate(layoutInflater, parent, false)

            return TopHeadlineViewHolder(binding).apply {
                this.onItemClick = onItemClick
            }
        }
    }
}