package com.sagarock101.widget.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/sagarock101/widget/service/StackWidgetService;", "Landroid/widget/RemoteViewsService;", "()V", "newsDatabase", "Lcom/sagarock101/database/NewsDatabase;", "newsDatabaseDao", "Lcom/sagarock101/database/NewsDao;", "newsDatabaseRepo", "Lcom/sagarock101/database/NewsDatabaseRepo;", "onCreate", "", "onGetViewFactory", "Lcom/sagarock101/widget/StackRemoteViewsFactory;", "intent", "Landroid/content/Intent;", "widget_debug"})
public final class StackWidgetService extends android.widget.RemoteViewsService {
    private com.sagarock101.database.NewsDatabase newsDatabase;
    private com.sagarock101.database.NewsDao newsDatabaseDao;
    private com.sagarock101.database.NewsDatabaseRepo newsDatabaseRepo;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.sagarock101.widget.StackRemoteViewsFactory onGetViewFactory(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    public StackWidgetService() {
        super();
    }
}