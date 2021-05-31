package com.sagarock101.categories.di

import androidx.lifecycle.ViewModel
import com.sagarock101.categories.viewmodel.SourceViewModel
import com.sagarock101.core.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SourceViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SourceViewModel::class)
    abstract fun bindNewsHeadlinesViewModel(viewModel: SourceViewModel): ViewModel
}