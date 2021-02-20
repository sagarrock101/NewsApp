package com.sagarock101.widget.di

import android.app.Application
import android.content.ComponentName
import com.sagarock101.database.NewsDatabaseRepo
import com.sagarock101.database.di.DatabaseModule
import com.sagarock101.widget.service.StackWidgetService
import dagger.Module
import dagger.Provides

@Module(includes = [DatabaseModule::class])
class WidgetServiceModule {

    @Provides
    fun provideStackWidgetService(application: Application): ComponentName {
        return ComponentName(application, StackWidgetService::class.java)
    }
}