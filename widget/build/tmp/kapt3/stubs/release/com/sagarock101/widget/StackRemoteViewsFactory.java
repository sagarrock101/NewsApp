package com.sagarock101.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0013H\u0017J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/sagarock101/widget/StackRemoteViewsFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "newsDatabaseRepo", "Lcom/sagarock101/database/NewsDatabaseRepo;", "(Landroid/content/Context;Landroid/content/Intent;Lcom/sagarock101/database/NewsDatabaseRepo;)V", "listOfArticles", "Ljava/util/ArrayList;", "Lcom/sagarock101/database/model/Articles;", "Lkotlin/collections/ArrayList;", "getNewsDatabaseRepo", "()Lcom/sagarock101/database/NewsDatabaseRepo;", "appendSavedOnWithTimeLeftcount", "", "elapsedTime", "getCount", "", "getItemId", "", "position", "getLoadingView", "", "getSourceNameAndElapsedTimeAfterSavingTheArticleToReadLater", "", "name", "publishedAt", "Ljava/sql/Timestamp;", "getViewAt", "Landroid/widget/RemoteViews;", "getViewTypeCount", "hasStableIds", "", "onCreate", "", "onDataSetChanged", "onDestroy", "widget_release"})
public final class StackRemoteViewsFactory implements android.widget.RemoteViewsService.RemoteViewsFactory {
    private java.util.ArrayList<com.sagarock101.database.model.Articles> listOfArticles;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sagarock101.database.NewsDatabaseRepo newsDatabaseRepo = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void getLoadingView() {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public void onDataSetChanged() {
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public android.widget.RemoteViews getViewAt(int position) {
        return null;
    }
    
    private final java.lang.CharSequence getSourceNameAndElapsedTimeAfterSavingTheArticleToReadLater(java.lang.String name, java.sql.Timestamp publishedAt) {
        return null;
    }
    
    private final java.lang.String appendSavedOnWithTimeLeftcount(java.lang.String elapsedTime) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getViewTypeCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.database.NewsDatabaseRepo getNewsDatabaseRepo() {
        return null;
    }
    
    public StackRemoteViewsFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent, @org.jetbrains.annotations.NotNull()
    com.sagarock101.database.NewsDatabaseRepo newsDatabaseRepo) {
        super();
    }
}