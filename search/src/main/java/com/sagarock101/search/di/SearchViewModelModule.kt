package com.sagarock101.search.di

import androidx.lifecycle.ViewModel
import com.sagarock101.core.di.ViewModelKey
import com.sagarock101.search.ui.viewmodel.SearchViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SearchViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel::class)
    abstract fun bindNewsHeadlinesViewModel(viewModel: SearchViewModel): ViewModel
}