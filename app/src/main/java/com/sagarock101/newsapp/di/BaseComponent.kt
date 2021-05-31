package com.sagarock101.newsapp.di

import com.sagarock101.core.di.CoreDataModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CoreDataModule::class])
interface BaseComponent {
}