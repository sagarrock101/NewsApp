package com.sagarock101.core.di

import android.app.Application
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.google.gson.Gson
import com.sagarock101.common.BuildConfig
import com.sagarock101.core.utils.InterceptorWithApiKey
import com.sagarock101.core.utils.PreferenceHelper
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class CoreDataModule {

    @Singleton
    @Provides
    fun provideGson(): Gson = Gson()

    @Singleton
    @Provides
    fun provideGsonConverterFactory(gson: Gson): GsonConverterFactory =
        GsonConverterFactory.create(gson)

    @Singleton
    @Provides
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

    @Provides
    fun providePreferenceHelper(context: Application) = PreferenceHelper(context)

}

