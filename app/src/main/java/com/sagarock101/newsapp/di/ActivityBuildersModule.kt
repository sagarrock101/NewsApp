package com.sagarock101.newsapp.di

import com.sagarock101.newsapp.ui.activities.MainActivity
import com.sagarock101.newsheadlines.di.FragmentBuildersModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [com.sagarock101.newsapp.di.FragmentBuildersModule::class, com.sagarock101.newsheadlines.di.FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity

}