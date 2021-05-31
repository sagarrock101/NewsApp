package com.sagarock101.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u0010J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\u0019\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/sagarock101/database/NewsDatabaseRepo;", "", "dao", "Lcom/sagarock101/database/NewsDao;", "(Lcom/sagarock101/database/NewsDao;)V", "checkIfNewsExists", "", "title", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNews", "", "articles", "Lcom/sagarock101/database/model/Articles;", "(Lcom/sagarock101/database/model/Articles;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSavedNews", "Landroidx/lifecycle/LiveData;", "", "getSynchronouslySavedNews", "insertNews", "database_debug"})
public final class NewsDatabaseRepo {
    private final com.sagarock101.database.NewsDao dao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sagarock101.database.model.Articles>> getAllSavedNews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertNews(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteNews(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkIfNewsExists(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sagarock101.database.model.Articles> getSynchronouslySavedNews() {
        return null;
    }
    
    @javax.inject.Inject()
    public NewsDatabaseRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.NewsDao dao) {
        super();
    }
}