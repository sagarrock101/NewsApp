package com.sagarock101.newsheadlines.di

import com.sagarock101.core.di.CoreDataModule
import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo
import com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource
import com.sagarock101.newsheadlines.data.remote.NewsHeadlinesService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [CoreDataModule::class])
class NewsHeadlinesModule {

    @Singleton
    @Provides
    fun provideNewsHeadlinesService(retrofit: Retrofit): NewsHeadlinesService {
        return retrofit.create<NewsHeadlinesService>(NewsHeadlinesService::class.java)
    }

    @Singleton
    @Provides
    fun provideNewsHeadlinesRepo(newsHeadLinesRemoteSource: NewsHeadLinesRemoteSource): NewsHeadlinesRepo {
        return NewsHeadlinesRepo(newsHeadLinesRemoteSource)
    }

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsHeadlinesService: NewsHeadlinesService) : NewsHeadLinesRemoteSource {
       return NewsHeadLinesRemoteSource(newsHeadlinesService)
    }

    @Provides
    fun getString() = "s"

}