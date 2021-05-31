package com.sagarock101.search.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R4\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/sagarock101/search/ui/adapters/SearchResultsAdapter;", "Lcom/sagarock101/core/adapter/BaseAdapter;", "Lcom/sagarock101/search/model/Results;", "()V", "onItemClick", "Lkotlin/Function3;", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function3;", "setOnItemClick", "(Lkotlin/jvm/functions/Function3;)V", "getLayoutId", "", "position", "obj", "getViewHolder", "Lcom/sagarock101/core/viewholder/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "search_release"})
public final class SearchResultsAdapter extends com.sagarock101.core.adapter.BaseAdapter<com.sagarock101.search.model.Results> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super android.widget.ImageView, ? super android.widget.TextView, ? super com.sagarock101.search.model.Results, kotlin.Unit> onItemClick;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<android.widget.ImageView, android.widget.TextView, com.sagarock101.search.model.Results, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super android.widget.ImageView, ? super android.widget.TextView, ? super com.sagarock101.search.model.Results, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutId(int position, @org.jetbrains.annotations.NotNull()
    com.sagarock101.search.model.Results obj) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sagarock101.core.viewholder.BaseViewHolder<com.sagarock101.search.model.Results> getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public SearchResultsAdapter() {
        super(null);
    }
}