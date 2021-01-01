package com.sagarock101.newsapp.di

import com.sagarock101.newsapp.ui.activities.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}