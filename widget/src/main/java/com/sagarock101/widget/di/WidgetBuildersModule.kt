package com.sagarock101.widget.di

import com.sagarock101.widget.WidgetItemDetailActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class WidgetBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeWidgetItemDetailActivity(): WidgetItemDetailActivity

}