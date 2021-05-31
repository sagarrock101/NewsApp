package com.sagarock101.newsheadlines.di

import com.sagarock101.newsheadlines.ui.fragments.NewsDetailFragment
import com.sagarock101.newsheadlines.ui.fragments.NewsHeadlinesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeNewsDetailFragment(): NewsDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeNewsHeadlinesFragment(): NewsHeadlinesFragment

}