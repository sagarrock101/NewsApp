package com.sagarock101.core.view

import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatDelegate
import com.sagarock101.core.R
import com.sagarock101.core.reciever.NetworkChangeReceiver
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity(), NetworkChangeReceiver.NetworkChangeListener {

    private lateinit var networkChangeReceiver: NetworkChangeReceiver
    internal lateinit var progressBar: ProgressBar

    abstract val layout: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!shouldUseDataBinding()) {
            setContentView(R.layout.activity_base)
            progressBar = findViewById(R.id.base_progress_bar)
        }
        networkChangeReceiver = NetworkChangeReceiver().apply {
            networkChangeListener = this@BaseActivity
        }
    }


    /**
     * @return true if child activity should use data binding instead of [.setContentView]
     */
    protected open fun shouldUseDataBinding(): Boolean {
        return false
    }

    companion object {
        //Explicit Enabling of Vector Drawable Support for API-20 and bellow.
        init {
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        }
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(
            networkChangeReceiver,
            IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        )
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(networkChangeReceiver)
    }

}

