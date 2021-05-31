package com.sagarock101.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J \u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\bH\u0007J\"\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\bH\u0007J\b\u0010\u001a\u001a\u00020\rH\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/sagarock101/core/di/CoreDataModule;", "", "()V", "provideApiInterceptor", "Lcom/sagarock101/core/utils/InterceptorWithApiKey;", "provideGson", "Lcom/google/gson/Gson;", "provideGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "gson", "provideOkHttpClientForGuardianApi", "Lokhttp3/OkHttpClient;", "apiKeyInterceptor", "Lcom/sagarock101/core/utils/GuardianApiKeyInterceptor;", "provideOkhttpClient", "interceptorWithApiKey", "providePreferenceHelper", "Lcom/sagarock101/core/utils/PreferenceHelper;", "context", "Landroid/app/Application;", "provideRetrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "okhttpClient", "converterFactory", "provideRetrofitForGuardianApi", "provideTheGuardianApiInterceptor", "core_debug"})
@dagger.Module()
public final class CoreDataModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonConverterFactory(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okhttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.sagarock101.core.utils.InterceptorWithApiKey provideApiInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkhttpClient(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.utils.InterceptorWithApiKey interceptorWithApiKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.sagarock101.core.utils.PreferenceHelper providePreferenceHelper(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.sagarock101.core.utils.GuardianApiKeyInterceptor provideTheGuardianApiInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.sagarock101.core.qualifiers.OkHttpWithGuardianApiKeyInterceptor()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClientForGuardianApi(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.utils.GuardianApiKeyInterceptor apiKeyInterceptor) {
        return null;
    }
    
    @com.sagarock101.core.qualifiers.RetrofitForTheGuardianApi()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofitForGuardianApi(@org.jetbrains.annotations.NotNull()
    @com.sagarock101.core.qualifiers.OkHttpWithGuardianApiKeyInterceptor()
    okhttp3.OkHttpClient okhttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    public CoreDataModule() {
        super();
    }
}