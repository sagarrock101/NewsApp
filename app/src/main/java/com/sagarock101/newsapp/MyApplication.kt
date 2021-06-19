package com.sagarock101.newsapp

import android.content.Context
import androidx.multidex.MultiDex
import com.facebook.stetho.Stetho
import com.sagarock101.newsapp.di.AppInjector
import com.sagarock101.newsapp.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import leakcanary.LeakCanary
import javax.inject.Inject

class MyApplication: DaggerApplication(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>
//
    override fun androidInjector() = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
        AppInjector.init(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return DaggerApplicationComponent.builder().application(this).build()
    }


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }



}