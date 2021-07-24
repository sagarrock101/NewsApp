package com.sagarock101.newsapp

import android.content.Context
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.multidex.MultiDex
import androidx.work.Configuration
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.facebook.stetho.Stetho
import com.sagarock101.newsapp.di.AppInjector
import com.sagarock101.newsapp.di.DaggerApplicationComponent
import com.sagarock101.newsapp.work.DataWorkerFactory
import com.sagarock101.newsapp.work.NewsRequestWorker
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import java.time.Duration
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class MyApplication: DaggerApplication(), HasAndroidInjector, Configuration.Provider {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var workerFactory: DataWorkerFactory

    override fun androidInjector() = dispatchingAndroidInjector

    private val applicationScope = CoroutineScope(Dispatchers.Default)

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
        AppInjector.init(this)
        delayedInit()
        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O)
            initNotificationChannel(this)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initNotificationChannel(myApplication: MyApplication) {
        NotificationUtils.initializeChannel(myApplication)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return DaggerApplicationComponent.builder().application(this).build()
    }


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    private fun delayedInit() {
        applicationScope.launch {
            Timber.plant(Timber.DebugTree())
            startWorker()
        }
    }

    private fun startWorker() {
        val requestWorker = PeriodicWorkRequestBuilder<NewsRequestWorker>(1, TimeUnit.DAYS).build()
        WorkManager.getInstance(applicationContext).enqueueUniquePeriodicWork(
            "newsWorker",
            ExistingPeriodicWorkPolicy.KEEP,
            requestWorker
        )
    }

    override fun getWorkManagerConfiguration(): Configuration {
        Timber.i("worker $workerFactory")
        Log.i(this.javaClass.simpleName, "worker $workerFactory")
        return Configuration.Builder()
            .setMinimumLoggingLevel(android.util.Log.INFO)
            .setWorkerFactory(workerFactory)
            .build()
    }


}