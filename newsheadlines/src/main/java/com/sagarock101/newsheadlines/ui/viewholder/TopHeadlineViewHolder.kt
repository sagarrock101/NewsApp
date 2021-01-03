package com.sagarock101.newsheadlines.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBinding
import com.sagarock101.newsheadlines.model.Articles

class TopHeadlineViewHolder(val binding: ItemNewsCardBinding)
    : BaseViewHolder<Articles>(binding) {

    override fun bind(item: Articles) {
        binding.article = item
    }

    companion object {
        fun from(parent: ViewGroup): BaseViewHolder<Articles> {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemNewsCardBinding.inflate(layoutInflater, parent, false)

            return TopHeadlineViewHolder(binding)
        }
    }
}