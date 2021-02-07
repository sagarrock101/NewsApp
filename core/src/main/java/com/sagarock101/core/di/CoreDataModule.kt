package com.sagarock101.core.di

import android.app.Application
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.google.gson.Gson
import com.sagarock101.common.BuildConfig
import com.sagarock101.core.qualifiers.OkHttpWithGuardianApiKeyInterceptor
import com.sagarock101.core.qualifiers.RetrofitForTheGuardianApi
import com.sagarock101.core.utils.GuardianApiKeyInterceptor
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
    //TODO: need to migrate whole app to guardian api

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
        return OkHttpClient().newBuilder().addInterceptor(interceptorWithApiKey)
            .addNetworkInterceptor(StethoInterceptor()).build()
    }

    @Provides
    fun providePreferenceHelper(context: Application) = PreferenceHelper(context)

    @Provides
    fun provideTheGuardianApiInterceptor(): GuardianApiKeyInterceptor {
        return GuardianApiKeyInterceptor(BuildConfig.THE_GUARDIAN_NEWS_API_KEY)
    }

    @Provides
    @OkHttpWithGuardianApiKeyInterceptor
    fun provideOkHttpClientForGuardianApi(apiKeyInterceptor: GuardianApiKeyInterceptor): OkHttpClient {
        return OkHttpClient().newBuilder().addInterceptor(apiKeyInterceptor)
            .addNetworkInterceptor(StethoInterceptor()).build()
    }

    @Provides
    @RetrofitForTheGuardianApi
    fun provideRetrofitForGuardianApi(
        @OkHttpWithGuardianApiKeyInterceptor
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory
    ) = Retrofit.Builder()
        .baseUrl(BuildConfig.GUARDIAN_BASE_URL)
        .client(okhttpClient)
        .addConverterFactory(converterFactory)
        .build()




}

