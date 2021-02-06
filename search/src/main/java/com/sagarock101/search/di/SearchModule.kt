package com.sagarock101.search.di

import com.sagarock101.core.di.CoreDataModule
import com.sagarock101.search.data.remote.SearchRemoteSource
import com.sagarock101.search.data.remote.SearchRepo
import com.sagarock101.search.data.remote.SearchService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [CoreDataModule::class])
class SearchModule {

    @Singleton
    @Provides
    fun provideSearchService(retrofit: Retrofit): SearchService {
        return retrofit.create<SearchService>(SearchService::class.java)
    }

    @Singleton
    @Provides
    fun provideSearchRepo(searchRemoteSource: SearchRemoteSource): SearchRepo {
        return SearchRepo(searchRemoteSource)
    }

    @Singleton
    @Provides
    fun provideSearchDataSource(searchService: SearchService) : SearchRemoteSource {
        return SearchRemoteSource(searchService)
    }

}