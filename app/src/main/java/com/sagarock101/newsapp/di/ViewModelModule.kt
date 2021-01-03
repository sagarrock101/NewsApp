package com.sagarock101.newsapp.di

import androidx.lifecycle.ViewModelProvider
import com.sagarock101.core.di.ViewModelFactory
import com.sagarock101.newsheadlines.di.NewsViewModelModule
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import dagger.Binds
import dagger.Module


@Module(includes = [NewsViewModelModule::class])
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}