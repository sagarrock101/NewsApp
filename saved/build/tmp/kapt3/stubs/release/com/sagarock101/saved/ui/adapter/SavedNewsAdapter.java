package com.sagarock101.saved.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002H\u0014J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0018\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u000e\u0010&\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0014\u0010\'\u001a\u00020\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)J\u0018\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u001aR4\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006,"}, d2 = {"Lcom/sagarock101/saved/ui/adapter/SavedNewsAdapter;", "Lcom/sagarock101/core/adapter/BaseAdapter;", "Lcom/sagarock101/database/model/Articles;", "()V", "onItemClick", "Lkotlin/Function3;", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function3;", "setOnItemClick", "(Lkotlin/jvm/functions/Function3;)V", "tracker", "Landroidx/recyclerview/selection/SelectionTracker;", "getTracker", "()Landroidx/recyclerview/selection/SelectionTracker;", "setTracker", "(Landroidx/recyclerview/selection/SelectionTracker;)V", "viewModel", "Lcom/sagarock101/saved/viewmodel/SavedNewsViewModel;", "getViewModel", "()Lcom/sagarock101/saved/viewmodel/SavedNewsViewModel;", "setViewModel", "(Lcom/sagarock101/saved/viewmodel/SavedNewsViewModel;)V", "getLayoutId", "", "position", "obj", "getSavedNewsAt", "getViewHolder", "Lcom/sagarock101/core/viewholder/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "removeItem", "removeItems", "items", "", "restoreItem", "item", "saved_release"})
public final class SavedNewsAdapter extends com.sagarock101.core.adapter.BaseAdapter<com.sagarock101.database.model.Articles> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super android.widget.ImageView, ? super android.widget.TextView, ? super com.sagarock101.database.model.Articles, kotlin.Unit> onItemClick;
    @org.jetbrains.annotations.Nullable()
    private com.sagarock101.saved.viewmodel.SavedNewsViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.selection.SelectionTracker<com.sagarock101.database.model.Articles> tracker;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<android.widget.ImageView, android.widget.TextView, com.sagarock101.database.model.Articles, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super android.widget.ImageView, ? super android.widget.TextView, ? super com.sagarock101.database.model.Articles, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sagarock101.saved.viewmodel.SavedNewsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.sagarock101.saved.viewmodel.SavedNewsViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.selection.SelectionTracker<com.sagarock101.database.model.Articles> getTracker() {
        return null;
    }
    
    public final void setTracker(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.selection.SelectionTracker<com.sagarock101.database.model.Articles> p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutId(int position, @org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles obj) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sagarock101.core.viewholder.BaseViewHolder<com.sagarock101.database.model.Articles> getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.database.model.Articles getSavedNewsAt(int position) {
        return null;
    }
    
    public final void removeItem(int position) {
    }
    
    public final void restoreItem(@org.jetbrains.annotations.Nullable()
    com.sagarock101.database.model.Articles item, int position) {
    }
    
    public final void removeItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sagarock101.database.model.Articles> items) {
    }
    
    public SavedNewsAdapter() {
        super(null);
    }
}