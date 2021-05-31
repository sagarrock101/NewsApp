package com.sagarock101.newsheadlines.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000203J\u0014\u00107\u001a\u0002032\f\u00108\u001a\b\u0012\u0004\u0012\u00020509J\u000e\u0010:\u001a\u00020/2\u0006\u00104\u001a\u000205J\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050<0\u0019J\u0010\u0010=\u001a\u0002032\b\b\u0002\u0010>\u001a\u000201J\u0006\u0010?\u001a\u00020/J\u000e\u0010@\u001a\u00020/2\u0006\u00104\u001a\u000205R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u00a8\u0006A"}, d2 = {"Lcom/sagarock101/newsheadlines/viewmodel/NewsViewModel;", "Lcom/sagarock101/core/viewmodel/CoroutineViewModel;", "()V", "_isSaved", "Landroidx/lifecycle/MutableLiveData;", "", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "lastSelectedChipId", "", "getLastSelectedChipId", "()I", "setLastSelectedChipId", "(I)V", "newsDatabaseRepo", "Lcom/sagarock101/database/NewsDatabaseRepo;", "getNewsDatabaseRepo", "()Lcom/sagarock101/database/NewsDatabaseRepo;", "setNewsDatabaseRepo", "(Lcom/sagarock101/database/NewsDatabaseRepo;)V", "newsHeadLinesLD", "Landroidx/lifecycle/LiveData;", "Lcom/sagarock101/core/data/DataWrapper;", "Lcom/sagarock101/database/model/NewsHeadLines;", "getNewsHeadLinesLD", "()Landroidx/lifecycle/LiveData;", "newsHeadLinesMLD", "Lcom/sagarock101/database/model/ArticleRequest;", "newsHeadlinesRepo", "Lcom/sagarock101/newsheadlines/data/NewsHeadlinesRepo;", "getNewsHeadlinesRepo", "()Lcom/sagarock101/newsheadlines/data/NewsHeadlinesRepo;", "setNewsHeadlinesRepo", "(Lcom/sagarock101/newsheadlines/data/NewsHeadlinesRepo;)V", "savedLiveData", "getSavedLiveData", "sectionRepo", "Lcom/sagarock101/newsheadlines/data/SectionRepo;", "getSectionRepo", "()Lcom/sagarock101/newsheadlines/data/SectionRepo;", "setSectionRepo", "(Lcom/sagarock101/newsheadlines/data/SectionRepo;)V", "checkIfNewsExists", "Lkotlinx/coroutines/Job;", "title", "", "checkIfSaved", "", "articles", "Lcom/sagarock101/database/model/Articles;", "clearViewModelMLDs", "deleteListOfNews", "list", "", "deleteNews", "getAllSavedNews", "", "getNewsHeadLines", "type", "getSavedNewsArticles", "insertNews", "newsheadlines_release"})
public final class NewsViewModel extends com.sagarock101.core.viewmodel.CoroutineViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.newsheadlines.data.NewsHeadlinesRepo newsHeadlinesRepo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.newsheadlines.data.SectionRepo sectionRepo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.database.NewsDatabaseRepo newsDatabaseRepo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.app.Application application;
    private final androidx.lifecycle.MutableLiveData<com.sagarock101.database.model.ArticleRequest> newsHeadLinesMLD = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isSaved = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> savedLiveData = null;
    private int lastSelectedChipId = -1;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.database.model.NewsHeadLines>> newsHeadLinesLD = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.newsheadlines.data.NewsHeadlinesRepo getNewsHeadlinesRepo() {
        return null;
    }
    
    public final void setNewsHeadlinesRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.NewsHeadlinesRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.newsheadlines.data.SectionRepo getSectionRepo() {
        return null;
    }
    
    public final void setSectionRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.SectionRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.database.NewsDatabaseRepo getNewsDatabaseRepo() {
        return null;
    }
    
    public final void setNewsDatabaseRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.NewsDatabaseRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSavedLiveData() {
        return null;
    }
    
    public final int getLastSelectedChipId() {
        return 0;
    }
    
    public final void setLastSelectedChipId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.database.model.NewsHeadLines>> getNewsHeadLinesLD() {
        return null;
    }
    
    public final void getNewsHeadLines(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertNews(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getSavedNewsArticles() {
        return null;
    }
    
    private final kotlinx.coroutines.Job checkIfNewsExists(java.lang.String title) {
        return null;
    }
    
    public final void checkIfSaved(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteNews(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles) {
        return null;
    }
    
    public final void clearViewModelMLDs() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sagarock101.database.model.Articles>> getAllSavedNews() {
        return null;
    }
    
    public final void deleteListOfNews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sagarock101.database.model.Articles> list) {
    }
    
    @javax.inject.Inject()
    public NewsViewModel() {
        super(null);
    }
}