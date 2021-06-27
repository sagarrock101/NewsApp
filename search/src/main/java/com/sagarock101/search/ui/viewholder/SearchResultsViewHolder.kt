package com.sagarock101.search.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.search.databinding.ItemSearchResultBinding
import com.sagarock101.search.model.Articles
import com.sagarock101.search.model.Results
import com.sagarock101.search.model.SearchResults

class SearchResultsViewHolder(private val binding: ItemSearchResultBinding)
    : BaseViewHolder<Results>(binding) {
    var onItemClick: ((ImageView, TextView, TextView, Results) -> Unit)? = null
    var item: Results? = null
    override fun bind(item: Results) {
        binding.searchResult = item
        this.item = item
        ViewCompat.setTransitionName(binding.ivNewsImg, item.fields.thumbnail ?: "")
        ViewCompat.setTransitionName(binding.tvTitle, item.webTitle)
        ViewCompat.setTransitionName(binding.tvSource, item.sectionName + " " + item.webPublicationDate)
        itemView.setOnClickListener {
            onItemClick?.invoke(binding.ivNewsImg, binding.tvTitle, binding.tvSource, item)
        }
    }

    companion object {
        fun from(
            parent: ViewGroup,
            onItemClick: ((ImageView, TextView, TextView, Results) -> Unit)? = null
//            ,
//            viewModel: NewsViewModel? = null
            ): BaseViewHolder<Results> {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemSearchResultBinding.inflate(layoutInflater, parent, false)

            return SearchResultsViewHolder(binding).apply {
                this.onItemClick = onItemClick
//                this.viewModel = viewModel
            }
        }
    }
}