package com.sagarock101.saved.ui.itemSelection

import android.view.MotionEvent
import androidx.recyclerview.selection.ItemDetailsLookup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.sagarock101.database.model.Articles
import com.sagarock101.saved.ui.viewholder.SavedNewsViewHolder


class MyItemDetailsLookup(
    private val recyclerView: RecyclerView
): ItemDetailsLookup<Articles>() {


    override fun getItemDetails(e: MotionEvent): ItemDetails<Articles>? {
        val view = recyclerView.findChildViewUnder(e.x, e.y)
        if (view != null) {
            val holder: ViewHolder = recyclerView.getChildViewHolder(view)
            if (holder is SavedNewsViewHolder) {
                return holder.getItemDetails()
            }
        }
        return null
    }
}