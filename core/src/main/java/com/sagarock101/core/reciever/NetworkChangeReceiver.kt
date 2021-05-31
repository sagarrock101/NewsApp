package com.sagarock101.core.reciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager

class NetworkChangeReceiver : BroadcastReceiver() {
     var networkChangeListener: NetworkChangeListener? = null

    interface NetworkChangeListener {
       fun isNetworkActive(isActive: Boolean)
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        context?.let { isNetworkAvailable(it) }?.let {
            networkChangeListener?.isNetworkActive(
                it
            )
        }
    }

    private fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return if (connectivityManager != null) {
            val networkInfo = connectivityManager.activeNetworkInfo
            networkInfo != null && networkInfo.isConnected
        } else {
            false
        }
    }


}