package com.sagarock101.saved.ui.itemSelection

import android.content.Context
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.selection.SelectionTracker
import com.sagarock101.core.utils.Utils
import com.sagarock101.database.model.Articles
import com.sagarock101.saved.R

class ActionModeController(
    private val context: Context,
    private val selectionTracker: SelectionTracker<Articles>?
) : ActionMode.Callback {

    override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {
        item?.let {
            Utils.showToast(context, "Delete")
            return true
        }

        return false
    }

    override fun onCreateActionMode(mode: ActionMode?, menu: Menu?) = false

    override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?) = false

    override fun onDestroyActionMode(mode: ActionMode?) {
        selectionTracker?.clearSelection()
    }
}