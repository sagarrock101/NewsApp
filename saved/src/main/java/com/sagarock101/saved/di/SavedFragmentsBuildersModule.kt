package com.sagarock101.saved.di

import com.sagarock101.saved.ui.fragment.SavedFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SavedFragmentsBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeSavedFragment(): SavedFragment
}