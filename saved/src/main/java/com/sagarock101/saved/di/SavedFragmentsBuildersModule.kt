package com.sagarock101.saved.di

import com.sagarock101.saved.ui.fragment.SavedFragment
import com.sagarock101.saved.ui.fragment.SavedNewsDetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SavedFragmentsBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeSavedFragment(): SavedFragment

    @ContributesAndroidInjector
    abstract fun contributeSavedNewsDetailFragment(): SavedNewsDetailFragment
}