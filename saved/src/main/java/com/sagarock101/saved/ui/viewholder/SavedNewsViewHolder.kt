package com.sagarock101.saved.ui.viewholder

import android.view.HapticFeedbackConstants
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.recyclerview.selection.ItemDetailsLookup
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.database.model.Articles
import com.sagarock101.saved.databinding.ItemSavedBinding
import com.sagarock101.saved.viewmodel.SavedNewsViewModel

class SavedNewsViewHolder(private val binding: ItemSavedBinding)
    : BaseViewHolder<Articles>(binding) {
    var onItemClick: ((ImageView, TextView, TextView,  Articles) -> Unit)? = null
    var viewModel: SavedNewsViewModel? = null
    var item: Articles? = null
    override fun bind(item: Articles) {
        binding.article = item
        this.item = item
        binding.viewModel = viewModel
        ViewCompat.setTransitionName(binding.ivNewsImg, item.urlToImage ?: "")
        ViewCompat.setTransitionName(binding.tvTitle, item.title)
        ViewCompat.setTransitionName(binding.tvNewsSource, item.source?.name + " " + item.publishedAt)
        itemView.setOnClickListener {
            onItemClick?.invoke(binding.ivNewsImg, binding.tvTitle, binding.tvNewsSource, item)
            viewModel?.checkIfSaved(item)
        }
    }

    fun setSelected(isActivated: Boolean) {
        binding.clNewsSaved.isActivated = isActivated
    }

    fun getItemDetails(): ItemDetailsLookup.ItemDetails<Articles> = object : ItemDetailsLookup.ItemDetails<Articles>() {
        override fun getSelectionKey() = item
        override fun getPosition() = adapterPosition
        override fun inSelectionHotspot(e: MotionEvent) = false
    }


    companion object {
        fun from(
            parent: ViewGroup,
            onItemClick: ((ImageView, TextView, TextView, Articles) -> Unit)? = null,
            viewModel: SavedNewsViewModel? = null
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