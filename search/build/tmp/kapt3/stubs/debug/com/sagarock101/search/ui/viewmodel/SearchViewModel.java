package com.sagarock101.search.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u001bJ\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/sagarock101/search/ui/viewmodel/SearchViewModel;", "Lcom/sagarock101/core/viewmodel/CoroutineViewModel;", "()V", "_isSaved", "Landroidx/lifecycle/MutableLiveData;", "", "newsDatabaseRepo", "Lcom/sagarock101/database/NewsDatabaseRepo;", "getNewsDatabaseRepo", "()Lcom/sagarock101/database/NewsDatabaseRepo;", "setNewsDatabaseRepo", "(Lcom/sagarock101/database/NewsDatabaseRepo;)V", "savedLiveData", "Landroidx/lifecycle/LiveData;", "getSavedLiveData", "()Landroidx/lifecycle/LiveData;", "searchRepo", "Lcom/sagarock101/search/data/remote/SearchRepo;", "getSearchRepo", "()Lcom/sagarock101/search/data/remote/SearchRepo;", "setSearchRepo", "(Lcom/sagarock101/search/data/remote/SearchRepo;)V", "searchResultsLiveData", "Lcom/sagarock101/core/data/DataWrapper;", "Lcom/sagarock101/search/model/SearchResponse;", "getSearchResultsLiveData", "searchResultsMutableLiveData", "", "checkIfNewsExists", "Lkotlinx/coroutines/Job;", "title", "checkIfSaved", "", "articles", "Lcom/sagarock101/database/model/Articles;", "deleteNews", "getSearchResults", "query", "insertNews", "search_debug"})
public final class SearchViewModel extends com.sagarock101.core.viewmodel.CoroutineViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.search.data.remote.SearchRepo searchRepo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.database.NewsDatabaseRepo newsDatabaseRepo;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isSaved = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> savedLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.String> searchResultsMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.search.model.SearchResponse>> searchResultsLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.search.data.remote.SearchRepo getSearchRepo() {
        return null;
    }
    
    public final void setSearchRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.search.data.remote.SearchRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.database.NewsDatabaseRepo getNewsDatabaseRepo() {
        return null;
    }
    
    public final void setNewsDatabaseRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.NewsDatabaseRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSavedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.search.model.SearchResponse>> getSearchResultsLiveData() {
        return null;
    }
    
    public final void getSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertNews(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchViewModel() {
        super(null);
    }
}