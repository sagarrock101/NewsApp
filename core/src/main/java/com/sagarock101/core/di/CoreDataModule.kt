package com.sagarock101.core.di

import com.facebook.stetho.Stetho
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.google.gson.Gson
import com.sagarock101.common.BuildConfig
import com.sagarock101.core.utils.InterceptorWithApiKey
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class CoreDataModule {

    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()

    @Provides
    @Singleton
    fun provideGsonConverterFactory(gson: Gson): GsonConverterFactory =
        GsonConverterFactory.create(gson)

    @Provides
    @Singleton
    fun provideRetrofit(
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory
    ) = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(okhttpClient)
        .addConverterFactory(converterFactory)
        .build()


    @Provides
    fun provideApiInterceptor(): InterceptorWithApiKey {
        return InterceptorWithApiKey(BuildConfig.NEWS_API_KEY)
    }

    @Provides
    fun provideOkhttpClient(interceptorWithApiKey: InterceptorWithApiKey): OkHttpClient {
        return OkHttpClient().newBuilder().addInterceptor(interceptorWithApiKey).addNetworkInterceptor(StethoInterceptor()).build()
    }

}

