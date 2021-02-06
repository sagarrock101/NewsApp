package com.sagarock101.newsapp.di

import android.app.Application
import com.sagarock101.categories.di.SourceDataModule
import com.sagarock101.categories.di.SourceViewModelModule
import com.sagarock101.core.di.CoreDataModule
import com.sagarock101.database.di.DatabaseModule
import com.sagarock101.newsapp.MyApplication
import com.sagarock101.newsapp.ui.activities.MainActivity
import com.sagarock101.newsheadlines.di.FragmentBuildersModule
import com.sagarock101.newsheadlines.di.NewsHeadlinesModule
import com.sagarock101.newsheadlines.di.NewsViewModelModule
import com.sagarock101.search.di.SearchModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class,
        NewsHeadlinesModule::class,
        SourceDataModule::class,
        ViewModelModule::class ,
        DatabaseModule ::class,
        NewsViewModelModule::class,
        SearchModule::class,
        SourceViewModelModule::class
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