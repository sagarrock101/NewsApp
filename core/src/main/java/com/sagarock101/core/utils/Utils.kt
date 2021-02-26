package com.sagarock101.core.utils

import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.icu.text.SimpleDateFormat
import android.os.Build
import android.text.format.DateUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.sql.Timestamp
import java.text.DateFormat
import java.text.ParseException
import java.util.*
import java.util.concurrent.atomic.AtomicBoolean


object Utils {

    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    @JvmStatic
    fun truncateExtra(content: String?): String? {
        return content?.replace("(\\[\\+\\d+ chars])".toRegex(), "") ?: ""
    }

    fun View.setOnSingleClickListener(clickListener: View.OnClickListener?, interval: Long = 1000) {
        clickListener?.also {
            setOnClickListener(OnSingleClickListener(it, interval))
        } ?: setOnClickListener(null)
    }

    class OnSingleClickListener(
        private val clickListener: View.OnClickListener,
        private val intervalMs: Long = 1000
    ) : View.OnClickListener {
        private var canClick = AtomicBoolean(true)

        override fun onClick(v: View?) {
            v?.toString()
            if (canClick.getAndSet(false)) {
                v?.run {
                    postDelayed({
                        canClick.set(true)
                    }, intervalMs)
                    clickListener?.onClick(v)
                }
            }
        }
    }

    fun refreshWidget(context: Context, className: String, collectionId: Int) {
        val appWidgetManager =
            AppWidgetManager.getInstance(context)
        val thisAppWidget = ComponentName(
            context.packageName,
            className
        )
        val appWidgetIds = appWidgetManager.getAppWidgetIds(thisAppWidget)
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, collectionId)
    }


}