package com.sagarock101.widget.di

import com.sagarock101.widget.service.StackWidgetService
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ServiceBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeStackWidgetService(): StackWidgetService

}