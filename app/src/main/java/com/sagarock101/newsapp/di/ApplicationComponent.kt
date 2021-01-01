package com.sagarock101.newsapp.di

import android.app.Application
import com.sagarock101.core.di.CoreDataModule
import com.sagarock101.newsapp.MyApplication
import com.sagarock101.newsheadlines.di.NewsHeadlinesModule
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
    AndroidSupportInjectionModule::class,
    CoreDataModule::class,
    NewsHeadlinesModule::class,
    ActivityBuildersModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    override fun inject(application: MyApplication)
}