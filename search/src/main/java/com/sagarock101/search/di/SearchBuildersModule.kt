package com.sagarock101.search.di

import com.sagarock101.search.ui.activity.SearchActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SearchBuildersModule {

    @ContributesAndroidInjector(modules = [SearchFragmentBuildersModule::class])
    abstract fun contributeSearchActivity(): SearchActivity

}