package com.sagarock101.saved.ui.itemSelection

import androidx.recyclerview.selection.ItemKeyProvider
import com.sagarock101.database.model.Articles

class MyItemKeyProvider(private val listItems: List<Articles>) : ItemKeyProvider<Articles>(SCOPE_MAPPED) {
    override fun getKey(position: Int): Articles? {
        return listItems[position]
    }

    override fun getPosition(key: Articles): Int {
        return listItems.indexOf(key)
    }

}