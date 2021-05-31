package com.sagarock101.newsheadlines.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002J\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/sagarock101/newsheadlines/data/NewsHeadlinesRepo;", "", "remoteSource", "Lcom/sagarock101/newsheadlines/data/remote/NewsHeadLinesRemoteSource;", "sectionRemoteSource", "Lcom/sagarock101/newsheadlines/data/remote/SectionRemoteSource;", "(Lcom/sagarock101/newsheadlines/data/remote/NewsHeadLinesRemoteSource;Lcom/sagarock101/newsheadlines/data/remote/SectionRemoteSource;)V", "convertSectionResultsToListOfArticles", "", "Lcom/sagarock101/database/model/Articles;", "sectionResults", "", "Lcom/sagarock101/database/model/Results;", "getNewsHeadlines", "Landroidx/lifecycle/LiveData;", "Lcom/sagarock101/core/data/DataWrapper;", "Lcom/sagarock101/database/model/NewsHeadLines;", "country", "", "category", "mergeBothDataToHeadlines", "newsHeadlinesReponse", "sectionResponse", "Lcom/sagarock101/database/model/SectionResponse;", "newsheadlines_release"})
@javax.inject.Singleton()
public final class NewsHeadlinesRepo {
    private final com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource remoteSource = null;
    private final com.sagarock101.newsheadlines.data.remote.SectionRemoteSource sectionRemoteSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.database.model.NewsHeadLines>> getNewsHeadlines(@org.jetbrains.annotations.NotNull()
    java.lang.String country) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.database.model.NewsHeadLines>> getNewsHeadlines(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    private final com.sagarock101.core.data.DataWrapper<com.sagarock101.database.model.NewsHeadLines> mergeBothDataToHeadlines(com.sagarock101.core.data.DataWrapper<com.sagarock101.database.model.NewsHeadLines> newsHeadlinesReponse, com.sagarock101.core.data.DataWrapper<com.sagarock101.database.model.SectionResponse> sectionResponse) {
        return null;
    }
    
    private final java.util.Collection<com.sagarock101.database.model.Articles> convertSectionResultsToListOfArticles(java.util.List<com.sagarock101.database.model.Results> sectionResults) {
        return null;
    }
    
    @javax.inject.Inject()
    public NewsHeadlinesRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource remoteSource, @org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.remote.SectionRemoteSource sectionRemoteSource) {
        super();
    }
}