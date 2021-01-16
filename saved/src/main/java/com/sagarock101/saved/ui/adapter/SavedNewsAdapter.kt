package com.sagarock101.saved.ui.adapter

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.sagarock101.core.adapter.BaseAdapter
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.database.model.Articles
import com.sagarock101.newsheadlines.viewmodel.NewsViewModel
import com.sagarock101.saved.R
import com.sagarock101.saved.ui.viewholder.SavedNewsViewHolder

class SavedNewsAdapter() :
    BaseAdapter<Articles>() {

    var onItemClick: ((ImageView, TextView, Articles) -> Unit)? = null
    var viewModel: NewsViewModel? = null

    override fun getLayoutId(position: Int, obj: Articles) = R.layout.item_saved


    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Articles> {
        return SavedNewsViewHolder.from(parent, onItemClick, viewModel)
    }

    fun notifyChange(position: Int, canChangeAlpha: Boolean) {
        notifyItemChanged(position, canChangeAlpha)
    }
}