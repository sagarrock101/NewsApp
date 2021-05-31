package com.sagarock101.saved.binding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0007\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0012\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0012\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0007\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0012\u001a \u0010\u001b\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d\u00a8\u0006\u001e"}, d2 = {"setItems", "", "listView", "Landroidx/recyclerview/widget/RecyclerView;", "items", "", "", "bindSourceAndTime", "Landroid/widget/TextView;", "source", "", "publishedAt", "Ljava/sql/Timestamp;", "bindTextLikeNewsText", "desc", "getFormattedDate", "unFormattedDate", "hideChildFabInitially", "Landroid/view/View;", "hideFab", "rotateFab", "", "rotate", "setImage", "Landroid/widget/ImageView;", "url", "showFab", "startTransitionAfterImageLoad", "onFinished", "Lkotlin/Function0;", "saved_release"})
public final class SavedNewsBindingKt {
    
    @androidx.databinding.BindingAdapter(value = {"app:items"})
    public static final void setItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView listView, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:imgSrc"})
    public static final void setImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setImage, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    public static final void startTransitionAfterImageLoad(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$startTransitionAfterImageLoad, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinished) {
    }
    
    public static final boolean rotateFab(@org.jetbrains.annotations.NotNull()
    android.view.View $this$rotateFab, boolean rotate) {
        return false;
    }
    
    public static final void showFab(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showFab) {
    }
    
    public static final void hideFab(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideFab) {
    }
    
    public static final void hideChildFabInitially(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideChildFabInitially) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:bindSource", "app:publishedAt"})
    public static final void bindSourceAndTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindSourceAndTime, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp publishedAt) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:formatDate"})
    public static final void getFormattedDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$getFormattedDate, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp unFormattedDate) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:textLikeNewsPaper"})
    public static final void bindTextLikeNewsText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindTextLikeNewsText, @org.jetbrains.annotations.Nullable()
    java.lang.String desc) {
    }
}