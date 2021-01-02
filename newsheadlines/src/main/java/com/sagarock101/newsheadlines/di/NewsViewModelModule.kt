package com.sagarock101.newsheadlines.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sagarock101.core.di.ViewModelFactory
import com.sagarock101.core.di.ViewModelKey
import com.sagarock101.newsheadlines.viewmodel.NewsHeadlinesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class NewsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NewsHeadlinesViewModel::class)
    abstract fun bindNewsHeadlinesViewModel(viewModel: NewsHeadlinesViewModel): ViewModel
}