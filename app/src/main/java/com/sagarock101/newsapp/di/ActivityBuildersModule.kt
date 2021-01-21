package com.sagarock101.newsapp.di

import com.sagarock101.categories.di.SourcesFragmentBuildersModule
import com.sagarock101.newsapp.ui.activities.MainActivity
import com.sagarock101.newsheadlines.di.FragmentBuildersModule
import com.sagarock101.saved.di.SavedFragmentsBuildersModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [com.sagarock101.newsapp.di.FragmentBuildersModule::class,
        FragmentBuildersModule::class, SavedFragmentsBuildersModule::class,
        SourcesFragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity

}