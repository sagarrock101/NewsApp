package com.sagarock101.newsapp.di

import androidx.work.WorkerFactory
import com.sagarock101.newsapp.work.DataWorkerFactory
import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo
import com.sagarock101.newsheadlines.di.NewsHeadlinesModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
    NewsHeadlinesModule::class
    ]
)
class AppModule {
    @Singleton
    @Provides
    fun provideWorkerFactory(newsHeadlinesRepo: NewsHeadlinesRepo): WorkerFactory {
        return DataWorkerFactory(newsHeadlinesRepo)
    }
}