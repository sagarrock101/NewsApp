package com.sagarock101.saved.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.database.model.Articles
import com.sagarock101.newsheadlines.viewmodel.NewsViewModel
import com.sagarock101.saved.databinding.ItemSavedBinding

class SavedNewsViewHolder(val binding: ItemSavedBinding)
    : BaseViewHolder<Articles>(binding) {
    var onItemClick: ((ImageView, TextView, Articles) -> Unit)? = null
    var viewModel: NewsViewModel? = null
    override fun bind(item: Articles) {
        binding.article = item
        binding.viewModel = viewModel
        ViewCompat.setTransitionName(binding.ivNewsImg, item.urlToImage ?: "")
        ViewCompat.setTransitionName(binding.tvTitle, item.title)
        itemView.setOnClickListener {
            onItemClick?.invoke(binding.ivNewsImg, binding.tvTitle, item)
            viewModel?.checkIfSaved(item)
        }
    }

    companion object {
        fun from(
            parent: ViewGroup,
            onItemClick: ((ImageView, TextView, Articles) -> Unit)? = null,
            viewModel: NewsViewModel? = null
            ): BaseViewHolder<Articles> {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemSavedBinding.inflate(layoutInflater, parent, false)

            return SavedNewsViewHolder(binding).apply {
                this.onItemClick = onItemClick
                this.viewModel = viewModel
            }
        }
    }
}