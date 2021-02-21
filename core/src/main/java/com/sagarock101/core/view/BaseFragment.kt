package com.sagarock101.core.view

import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sagarock101.core.reciever.NetworkChangeReceiver
import dagger.android.support.DaggerFragment

abstract class BaseFragment : DaggerFragment(), NetworkChangeReceiver.NetworkChangeListener {

    lateinit var networkChangeReceiver: NetworkChangeReceiver

    companion object {
        var TAG = "com.sagarock101.core.view.BaseFragment"
    }

    protected val fragmentArguments: Bundle?
        get() = arguments


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        TAG = this.javaClass.simpleName
        return bindView(inflater, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        networkChangeReceiver = NetworkChangeReceiver().apply {
            networkChangeListener = this@BaseFragment
        }
    }


    protected abstract fun bindView(inflater: LayoutInflater, container: ViewGroup?): View


    fun searchIcon(showIcon : Boolean) {
        if(activity is BaseActivity) {
//            (activity as BaseActivity).searchIcon(showIcon)
        }
    }

    override fun onResume() {
        super.onResume()
        context?.registerReceiver(
            networkChangeReceiver,
            IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        )
    }

    override fun onPause() {
        super.onPause()
        context?.unregisterReceiver(networkChangeReceiver)
    }


}