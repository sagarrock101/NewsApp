package com.sagarock101.saved.ui.adapter

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.selection.SelectionTracker
import androidx.recyclerview.widget.RecyclerView
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
    var tracker: SelectionTracker<Articles>? = null

    override fun getLayoutId(position: Int, obj: Articles) = R.layout.item_saved

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = listItems[position]
        val savedNewsViewHolder = holder as SavedNewsViewHolder
        savedNewsViewHolder.bind(item)
        tracker?.let {
            holder.setSelected(it.isSelected(item))
        }
    }

    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Articles> {
        return SavedNewsViewHolder.from(parent, onItemClick, viewModel)
    }

    fun getSavedNewsAt(position: Int): Articles {
        return listItems[position]
    }

    fun removeItem(position: Int) {
        listItems.removeAt(position)
        notifyItemRemoved(position)
    }

    fun restoreItem(item: Articles?, position: Int) {
        if (item != null) {
            listItems.add(position, item)
        }
        notifyItemInserted(position)
    }

}