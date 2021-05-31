package com.sagarock101.widget.di

import androidx.lifecycle.ViewModel
import com.sagarock101.core.di.ViewModelKey
import com.sagarock101.widget.WidgetViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class WidgetViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(WidgetViewModel::class)
    abstract fun bindWidgetViewModel(viewModel: WidgetViewModel): ViewModel

}