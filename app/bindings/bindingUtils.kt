package com.sagarock101.app.bindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sagarock101.core.adapter.BaseAdapter

@BindingAdapter("app:items")
fun setItems(listView: RecyclerView, items: List<Any>?) {
    items?.let {
//        (listView.adapter as BaseAdapter<Any>).setItems(items as MutableList<Any>)
    }
}