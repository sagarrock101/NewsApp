package com.sagarock101.categories.di

import com.sagarock101.categories.data.SourceRepo
import com.sagarock101.categories.data.SourceService
import com.sagarock101.categories.data.remoteSource.SourceRemoteSource
import com.sagarock101.core.di.CoreDataModule
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [CoreDataModule::class])
class SourceDataModule {

    @Singleton
    @Provides
    fun provideSourceService(retrofit: Retrofit): SourceService {
        return retrofit.create<SourceService>(SourceService::class.java)
    }

    @Singleton
    @Provides
    fun provideSourceRepo(sourceRemoteSource: SourceRemoteSource): SourceRepo {
        return SourceRepo(sourceRemoteSource)
    }

    @Singleton
    @Provides
    fun provideSourceRemoteSource(sourceService: SourceService) : SourceRemoteSource {
       return SourceRemoteSource(sourceService)
    }

}