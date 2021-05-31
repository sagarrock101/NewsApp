package com.sagarock101.search.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/sagarock101/search/di/SearchModule;", "", "()V", "provideSearchDataSource", "Lcom/sagarock101/search/data/remote/SearchRemoteSource;", "searchService", "Lcom/sagarock101/search/data/remote/SearchService;", "provideSearchRepo", "Lcom/sagarock101/search/data/remote/SearchRepo;", "searchRemoteSource", "provideSearchService", "retrofit", "Lretrofit2/Retrofit;", "search_release"})
@dagger.Module(includes = {com.sagarock101.core.di.CoreDataModule.class})
public final class SearchModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.search.data.remote.SearchService provideSearchService(@org.jetbrains.annotations.NotNull()
    @com.sagarock101.core.qualifiers.RetrofitForTheGuardianApi()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.search.data.remote.SearchRepo provideSearchRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.search.data.remote.SearchRemoteSource searchRemoteSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.search.data.remote.SearchRemoteSource provideSearchDataSource(@org.jetbrains.annotations.NotNull()
    com.sagarock101.search.data.remote.SearchService searchService) {
        return null;
    }
    
    public SearchModule() {
        super();
    }
}