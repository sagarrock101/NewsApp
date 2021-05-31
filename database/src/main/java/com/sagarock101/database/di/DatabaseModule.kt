package com.sagarock101.database.di

import android.app.Application
import com.sagarock101.core.di.CoreDataModule
import com.sagarock101.database.NewsDao
import com.sagarock101.database.NewsDatabase
import com.sagarock101.database.NewsDatabaseRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [CoreDataModule::class])
class DatabaseModule {

    @Singleton
    @Provides
    fun provideNewsDatabase(application: Application) = NewsDatabase.getDatabase(application)

    @Singleton
    @Provides
    fun provideDao(newsDatabase: NewsDatabase) = newsDatabase.newsDao()

    @Singleton
    @Provides
    fun provideNewsDatabaseRepo(dao: NewsDao) = NewsDatabaseRepo(dao)



}