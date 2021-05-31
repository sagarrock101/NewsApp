package com.sagarock101.newsheadlines.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0014\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/sagarock101/newsheadlines/di/NewsHeadlinesModule;", "", "()V", "provideNewsHeadlinesRepo", "Lcom/sagarock101/newsheadlines/data/NewsHeadlinesRepo;", "newsHeadLinesRemoteSource", "Lcom/sagarock101/newsheadlines/data/remote/NewsHeadLinesRemoteSource;", "sectionRemoteSource", "Lcom/sagarock101/newsheadlines/data/remote/SectionRemoteSource;", "provideNewsHeadlinesService", "Lcom/sagarock101/newsheadlines/data/remote/NewsHeadlinesService;", "retrofit", "Lretrofit2/Retrofit;", "provideNewsRemoteDataSource", "newsHeadlinesService", "provideSectionRemoteDataSource", "sectionService", "Lcom/sagarock101/newsheadlines/data/remote/SectionService;", "provideSectionRepo", "Lcom/sagarock101/newsheadlines/data/SectionRepo;", "provideSectionService", "newsheadlines_release"})
@dagger.Module(includes = {com.sagarock101.core.di.CoreDataModule.class})
public final class NewsHeadlinesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.newsheadlines.data.remote.NewsHeadlinesService provideNewsHeadlinesService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.newsheadlines.data.NewsHeadlinesRepo provideNewsHeadlinesRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource newsHeadLinesRemoteSource, @org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.remote.SectionRemoteSource sectionRemoteSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource provideNewsRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.remote.NewsHeadlinesService newsHeadlinesService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.newsheadlines.data.remote.SectionService provideSectionService(@org.jetbrains.annotations.NotNull()
    @com.sagarock101.core.qualifiers.RetrofitForTheGuardianApi()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.newsheadlines.data.SectionRepo provideSectionRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.remote.SectionRemoteSource sectionRemoteSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.newsheadlines.data.remote.SectionRemoteSource provideSectionRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.remote.SectionService sectionService) {
        return null;
    }
    
    public NewsHeadlinesModule() {
        super();
    }
}