package com.sagarock101.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"ACTION_FORCE_UPDATE", "", "ACTION_NAVIGATE_TO_DETAIL", "ARTICLE_ITEM", "ARTICLE_ITEM_AUTHOR", "ARTICLE_ITEM_CONTENT", "ARTICLE_ITEM_DESCRIPTION", "ARTICLE_ITEM_ID", "ARTICLE_ITEM_NAME", "ARTICLE_ITEM_PUBLISHED_AT", "ARTICLE_ITEM_TITLE", "ARTICLE_ITEM_URL", "ARTICLE_ITEM_URL_TO_IMG", "EXTRA_ITEM", "widget_debug"})
public final class MyAppWidgetProviderKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_NAVIGATE_TO_DETAIL = "com.sagarock101.widget.detailActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ITEM = "com.sagarock101.widget.EXTRA_ITEM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM = "com.sagarock101.database.model.articles";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM_ID = "com.sagarock101.database.model.articles.source.id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM_NAME = "com.sagarock101.database.model.articles.source.name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM_AUTHOR = "com.sagarock101.database.model.articles.author";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM_TITLE = "com.sagarock101.database.model.articles.title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM_DESCRIPTION = "com.sagarock101.database.model.articles.description";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM_URL = "com.sagarock101.database.model.articles.url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM_URL_TO_IMG = "com.sagarock101.database.model.articles.urlToImage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM_PUBLISHED_AT = "com.sagarock101.database.model.articles.publishedAt";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM_CONTENT = "com.sagarock101.database.model.articles.content";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_FORCE_UPDATE = "update";
}