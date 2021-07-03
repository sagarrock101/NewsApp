package com.sagarock101.newsapp

import android.content.Context
import androidx.multidex.MultiDex
import com.facebook.stetho.Stetho
import com.sagarock101.common.AppConstants
import com.sagarock101.core.utils.PreferenceHelper
import com.sagarock101.newsapp.di.AppInjector
import com.sagarock101.newsapp.di.DaggerApplicationComponent
import com.sagarock101.newsapp.ui.activities.LIGHT_THEME
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyApplication: DaggerApplication(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector() = dispatchingAndroidInjector


    override fun onCreate() {
        super.onCreate()
        val preferenceHelper = PreferenceHelper(this).getStringToPreferences(AppConstants.UI_THEME_KEY, LIGHT_THEME)
        if(preferenceHelper == LIGHT_THEME)
            setTheme(R.style.WindowSplashLight)
        else setTheme(R.style.WindowSplashDark)
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