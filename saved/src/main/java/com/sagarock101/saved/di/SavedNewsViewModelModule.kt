package com.sagarock101.saved.di

import androidx.lifecycle.ViewModel
import com.sagarock101.core.di.ViewModelKey
import com.sagarock101.saved.viewmodel.SavedNewsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SavedNewsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SavedNewsViewModel::class)
    abstract fun bindNewsHeadlinesViewModel(viewModel: SavedNewsViewModel): ViewModel

}