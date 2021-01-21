package com.sagarock101.categories.di

import com.sagarock101.categories.ui.SourcesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SourcesFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeSourceFragment(): SourcesFragment

}