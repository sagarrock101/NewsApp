package com.sagarock101.newsheadlines.ui.adapter

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sagarock101.core.adapter.BaseAdapter
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.newsheadlines.R
import com.sagarock101.database.model.Articles
import com.sagarock101.newsheadlines.ui.viewholder.TopHeadlineViewHolder
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel

class TopHeadlinesAdapter() :
    BaseAdapter<Articles>() {

    var onItemClick: ((ImageView, TextView, Articles) -> Unit)? = null
    var viewModel: NewsHeadlinesViewModel? = null

    override fun getLayoutId(position: Int, obj: Articles) = R.layout.item_news_card

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        val topHeadlineViewHolder = holder as TopHeadlineViewHolder
        if (!payloads.isNullOrEmpty()) {
            if (payloads[0] is Boolean) {
                val canChangeAlpha = payloads[0] as Boolean
                if (canChangeAlpha)
                    topHeadlineViewHolder.decreaseAlpha()
                else topHeadlineViewHolder.increaseAlpha()
            }
        }
        super.onBindViewHolder(holder, position, payloads)
    }

    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Articles> {
        return TopHeadlineViewHolder.from(parent, onItemClick, viewModel)
    }

    fun notifyChange(position: Int, canChangeAlpha: Boolean) {
        notifyItemChanged(position, canChangeAlpha)
    }
}