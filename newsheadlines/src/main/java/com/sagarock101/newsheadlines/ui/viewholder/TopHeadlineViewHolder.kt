package com.sagarock101.newsheadlines.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBinding
import com.sagarock101.newsheadlines.interfaces.OnClickRvItemListener
import com.sagarock101.newsheadlines.model.Articles
import org.w3c.dom.Text

class TopHeadlineViewHolder(val binding: ItemNewsCardBinding)
    : BaseViewHolder<Articles>(binding) {
    var onItemClick: ((ImageView, TextView, Articles) -> Unit)? = null
    override fun bind(item: Articles) {
        binding.article = item
        ViewCompat.setTransitionName(binding.ivNewsImg, item.urlToImage)
        ViewCompat.setTransitionName(binding.tvTitle, item.title)
        itemView.setOnClickListener {
            onItemClick?.invoke(binding.ivNewsImg, binding.tvTitle, item)
        }
    }

    companion object {
        fun from(
            parent: ViewGroup,
            onItemClick: (ImageView, TextView, Articles) -> Unit
            ): BaseViewHolder<Articles> {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemNewsCardBinding.inflate(layoutInflater, parent, false)

            return TopHeadlineViewHolder(binding).apply {
                this.onItemClick = onItemClick
            }
        }
    }
}