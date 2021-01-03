package com.sagarock101.newsheadlines.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBinding
import com.sagarock101.newsheadlines.interfaces.OnClickRvItemListener
import com.sagarock101.newsheadlines.model.Articles

class TopHeadlineViewHolder(val binding: ItemNewsCardBinding)
    : BaseViewHolder<Articles>(binding) {
    var listener: OnClickRvItemListener? = null
    override fun bind(item: Articles) {
        binding.article = item
        itemView.setOnClickListener {
            listener?.onClick(item)
        }
    }

    companion object {
        fun from(
            parent: ViewGroup,
            listener: OnClickRvItemListener? = null
        ): BaseViewHolder<Articles> {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemNewsCardBinding.inflate(layoutInflater, parent, false)

            return TopHeadlineViewHolder(binding).apply {
                this.listener = listener
            }
        }
    }
}