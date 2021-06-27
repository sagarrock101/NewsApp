package com.sagarock101.search.ui.adapters

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sagarock101.core.adapter.BaseAdapter
import com.sagarock101.core.viewholder.BaseViewHolder
import com.sagarock101.search.R
import com.sagarock101.search.model.Articles
import com.sagarock101.search.model.Results
import com.sagarock101.search.ui.viewholder.SearchResultsViewHolder


class SearchResultsAdapter() :
    BaseAdapter<Results>() {

    var onItemClick: ((ImageView, TextView, TextView, Results) -> Unit)? = null

    override fun getLayoutId(position: Int, obj: Results) = R.layout.item_search_result

    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Results> {
        return SearchResultsViewHolder.from(parent, onItemClick)
    }

}