package com.sagarock101.search.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.search.databinding.ItemSearchResultBinding
import com.sagarock101.search.model.Articles

class SearchResultsViewHolder(private val binding: ItemSearchResultBinding)
    : BaseViewHolder<Articles>(binding) {
    var onItemClick: ((ImageView, TextView, Articles) -> Unit)? = null
//    var viewModel: NewsViewModel? = null
    var item: Articles? = null
    override fun bind(item: Articles) {
        binding.article = item
        this.item = item
//        binding.viewModel = viewModel
        ViewCompat.setTransitionName(binding.ivNewsImg, item.urlToImage ?: "")
        ViewCompat.setTransitionName(binding.tvTitle, item.title)
        itemView.setOnClickListener {
            onItemClick?.invoke(binding.ivNewsImg, binding.tvTitle, item)
//            viewModel?.checkIfSaved(item)
        }
    }

    companion object {
        fun from(
            parent: ViewGroup,
            onItemClick: ((ImageView, TextView, Articles) -> Unit)? = null
//            ,
//            viewModel: NewsViewModel? = null
            ): BaseViewHolder<Articles> {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemSearchResultBinding.inflate(layoutInflater, parent, false)

            return SearchResultsViewHolder(binding).apply {
                this.onItemClick = onItemClick
//                this.viewModel = viewModel
            }
        }
    }
}