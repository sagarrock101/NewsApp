package com.sagarock101.newsheadlines.di

import androidx.lifecycle.ViewModel
import com.sagarock101.core.di.ViewModelKey
import com.sagarock101.newsheadlines.viewmodel.NewsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class NewsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NewsViewModel::class)
    abstract fun bindNewsHeadlinesViewModel(viewModel: NewsViewModel): ViewModel
}