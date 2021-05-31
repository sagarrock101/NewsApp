package com.sagarock101.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/sagarock101/database/NewsDao;", "", "deleteNews", "", "articles", "Lcom/sagarock101/database/model/Articles;", "(Lcom/sagarock101/database/model/Articles;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSavedNews", "Landroidx/lifecycle/LiveData;", "", "getAllSavedNewsSynchronously", "insertNews", "isRowExists", "", "title", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "database_release"})
public abstract interface NewsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from Articles")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.sagarock101.database.model.Articles>> getAllSavedNews();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertNews(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteNews(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select exists(select * from Articles where title = :title)")
    public abstract java.lang.Object isRowExists(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from Articles")
    public abstract java.util.List<com.sagarock101.database.model.Articles> getAllSavedNewsSynchronously();
}