package com.sagarock101.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/sagarock101/widget/MyAppWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "appWidgetId", "", "typeConverterForTimeStamp", "Lcom/sagarock101/database/converters/TypeConverterForTimeStamp;", "getTypeConverterForTimeStamp", "()Lcom/sagarock101/database/converters/TypeConverterForTimeStamp;", "navigateToWidgetDetailActivity", "", "context", "Landroid/content/Context;", "articles", "Lcom/sagarock101/database/model/Articles;", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "widget_release"})
public final class MyAppWidgetProvider extends android.appwidget.AppWidgetProvider {
    @org.jetbrains.annotations.NotNull()
    private final com.sagarock101.database.converters.TypeConverterForTimeStamp typeConverterForTimeStamp = null;
    private int appWidgetId = -1;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.database.converters.TypeConverterForTimeStamp getTypeConverterForTimeStamp() {
        return null;
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void navigateToWidgetDetailActivity(android.content.Context context, com.sagarock101.database.model.Articles articles) {
    }
    
    @java.lang.Override()
    public void onUpdate(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.Nullable()
    int[] appWidgetIds) {
    }
    
    public MyAppWidgetProvider() {
        super();
    }
}