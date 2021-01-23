package com.sagarock101.core.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment

abstract class BaseFragment : DaggerFragment() {

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
        toggleHeader(false)
    }


    protected abstract fun bindView(inflater: LayoutInflater, container: ViewGroup?): View

    fun navigate(screenName: String, bundle: Bundle) {
        if (activity is BaseActivity) {
            (activity as BaseActivity).navigate(screenName, bundle)
        }
    }

    fun toggleHeader(showHeader: Boolean) {
        if (activity is BaseActivity) {
            (activity as BaseActivity).toggleHeader(showHeader)
        }
    }

     fun hideSearchIcon(iconVisible:Boolean){

         if(activity is BaseActivity){

             (activity as BaseActivity).hideSearchIcon(iconVisible)
         }
     }


    fun onScrollTop(index: Int) {
        if (index > 0) {
            toggleHeader(false)
        }
        else{
            toggleHeader(true)
        }
    }

    fun searchIcon(showIcon : Boolean) {
        if(activity is BaseActivity) {
            (activity as BaseActivity).searchIcon(showIcon)
        }
    }


}