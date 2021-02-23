package com.sagarock101.newsheadlines.di

import com.sagarock101.core.di.CoreDataModule
import com.sagarock101.core.qualifiers.RetrofitForTheGuardianApi
import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo
import com.sagarock101.newsheadlines.data.SectionRepo
import com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource
import com.sagarock101.newsheadlines.data.remote.NewsHeadlinesService
import com.sagarock101.newsheadlines.data.remote.SectionRemoteSource
import com.sagarock101.newsheadlines.data.remote.SectionService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [CoreDataModule::class])
class NewsHeadlinesModule {

    @Singleton
    @Provides
    fun provideNewsHeadlinesService(
        retrofit: Retrofit
    ): NewsHeadlinesService {
        return retrofit.create<NewsHeadlinesService>(NewsHeadlinesService::class.java)
    }

    @Singleton
    @Provides
    fun provideNewsHeadlinesRepo(newsHeadLinesRemoteSource: NewsHeadLinesRemoteSource, sectionRemoteSource: SectionRemoteSource): NewsHeadlinesRepo {
        return NewsHeadlinesRepo(newsHeadLinesRemoteSource, sectionRemoteSource)
    }

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsHeadlinesService: NewsHeadlinesService): NewsHeadLinesRemoteSource {
        return NewsHeadLinesRemoteSource(newsHeadlinesService)
    }

    @Singleton
    @Provides
    fun provideSectionService(
        @RetrofitForTheGuardianApi
        retrofit: Retrofit
    ): SectionService {
        return retrofit.create<SectionService>(SectionService::class.java)
    }

    @Singleton
    @Provides
    fun provideSectionRepo(sectionRemoteSource: SectionRemoteSource): SectionRepo {
        return SectionRepo(sectionRemoteSource)
    }

    @Singleton
    @Provides
    fun provideSectionRemoteDataSource(sectionService: SectionService): SectionRemoteSource {
        return SectionRemoteSource(sectionService)
    }


}