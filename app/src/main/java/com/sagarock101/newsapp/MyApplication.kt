package com.sagarock101.newsapp

import android.content.Context
import androidx.multidex.MultiDex
import com.facebook.stetho.Stetho
import com.sagarock101.newsapp.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MyApplication: DaggerApplication() {

//    @Inject
//    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>
//
//    override fun androidInjector() = dispatchingAndroidInjector


    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        AppInjector.init(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return null
    }


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }


}