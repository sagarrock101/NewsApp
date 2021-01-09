package com.sagarock101.core.utilities

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.Toast

object Utils {

    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

}