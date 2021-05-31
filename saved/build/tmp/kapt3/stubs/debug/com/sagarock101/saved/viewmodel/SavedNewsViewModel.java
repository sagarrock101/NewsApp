package com.sagarock101.saved.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJ\u0014\u0010!\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0&0\u0015J\u0010\u0010\'\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020\u001bJ\u0006\u0010)\u001a\u00020\u0019J\u000e\u0010*\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lcom/sagarock101/saved/viewmodel/SavedNewsViewModel;", "Lcom/sagarock101/core/viewmodel/CoroutineViewModel;", "()V", "_isSaved", "Landroidx/lifecycle/MutableLiveData;", "", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "newsDatabaseRepo", "Lcom/sagarock101/database/NewsDatabaseRepo;", "getNewsDatabaseRepo", "()Lcom/sagarock101/database/NewsDatabaseRepo;", "setNewsDatabaseRepo", "(Lcom/sagarock101/database/NewsDatabaseRepo;)V", "newsHeadLinesMLD", "Lcom/sagarock101/database/model/ArticleRequest;", "savedLiveData", "Landroidx/lifecycle/LiveData;", "getSavedLiveData", "()Landroidx/lifecycle/LiveData;", "checkIfNewsExists", "Lkotlinx/coroutines/Job;", "title", "", "checkIfSaved", "", "articles", "Lcom/sagarock101/database/model/Articles;", "clearViewModelMLDs", "deleteListOfNews", "list", "", "deleteNews", "getAllSavedNews", "", "getNewsHeadLines", "type", "getSavedNewsArticles", "insertNews", "saved_debug"})
public final class SavedNewsViewModel extends com.sagarock101.core.viewmodel.CoroutineViewModel {
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
    public SavedNewsViewModel() {
        super(null);
    }
}