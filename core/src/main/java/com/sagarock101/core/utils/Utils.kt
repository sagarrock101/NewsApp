package com.sagarock101.core.utils

import android.content.Context
import android.view.View
import android.widget.Toast
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





}