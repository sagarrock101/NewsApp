package com.sagarock101.newsheadlines.ui.adapter

import android.view.ViewGroup
import android.widget.ImageView
import com.sagarock101.core.adapter.BaseAdapter
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.interfaces.OnClickRvItemListener
import com.sagarock101.newsheadlines.model.Articles
import com.sagarock101.newsheadlines.ui.viewholder.TopHeadlineViewHolder

class TopHeadlinesAdapter(var onItemClick: (ImageView, Articles) -> Unit) : BaseAdapter<Articles>() {

    override fun getLayoutId(position: Int, obj: Articles) = R.layout.item_news_card

    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Articles> {
        return TopHeadlineViewHolder.from(parent, onItemClick)
    }

}