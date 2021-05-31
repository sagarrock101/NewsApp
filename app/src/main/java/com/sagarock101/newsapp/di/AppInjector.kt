package com.sagarock101.newsapp.di

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.sagarock101.core.interfaces.Injectable
import com.sagarock101.newsapp.MyApplication
import dagger.android.AndroidInjection
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerAppCompatActivity

/**
 * Helper class to automatically inject fragments if they implement [Injectable].
 */
object AppInjector {

    fun init(application: MyApplication) {
        DaggerApplicationComponent.builder().application(application)
            .build()
        application.registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
                override fun onActivityPaused(activity: Activity) {

                }

                override fun onActivityStarted(activity: Activity) {
                }

                override fun onActivityDestroyed(activity: Activity) {
                }

                override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                }

                override fun onActivityStopped(activity: Activity) {
                }

                override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                    handleActivity(activity)
                }

                override fun onActivityResumed(activity: Activity) {
                }

            })
    }

    private fun handleActivity(activity: Activity) {
        if (activity is HasAndroidInjector) {
//            AndroidInjection.inject(activity)
        }
        if (activity is DaggerAppCompatActivity) {
            activity.supportFragmentManager
                .registerFragmentLifecycleCallbacks(
                    object : FragmentManager.FragmentLifecycleCallbacks() {
                        override fun onFragmentCreated(
                            fm: FragmentManager,
                            f: Fragment,
                            savedInstanceState: Bundle?
                        ) {
                            if (f is Injectable) {
//                                AndroidSupportInjection.inject(f)
                            }
                        }
                    }, true
                )
        }
    }
}
