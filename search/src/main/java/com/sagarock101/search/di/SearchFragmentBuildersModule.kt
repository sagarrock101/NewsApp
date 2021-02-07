package com.sagarock101.search.di

import com.sagarock101.search.ui.fragment.SearchDetailFragment
import com.sagarock101.search.ui.fragment.SearchResultsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SearchFragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeSearchResultsFragment(): SearchResultsFragment

    @ContributesAndroidInjector
    abstract fun contributeSearchResultDetailFragment(): SearchDetailFragment
}