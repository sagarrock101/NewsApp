package com.sagarock101.newsapp.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sagarock101.newsheadlines.model.Articles

@BindingAdapter("app:items")
fun setItems(listView: RecyclerView, items: List<Articles>?) {
    items?.let {
//        (listView.adapter as TasksAdapter).submitList(items)
    }
}