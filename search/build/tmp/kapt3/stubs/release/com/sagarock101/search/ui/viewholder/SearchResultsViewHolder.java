package com.sagarock101.search.ui.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR4\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lcom/sagarock101/search/ui/viewholder/SearchResultsViewHolder;", "Lcom/sagarock101/core/viewholder/BaseViewHolder;", "Lcom/sagarock101/search/model/Results;", "binding", "Lcom/sagarock101/search/databinding/ItemSearchResultBinding;", "(Lcom/sagarock101/search/databinding/ItemSearchResultBinding;)V", "item", "getItem", "()Lcom/sagarock101/search/model/Results;", "setItem", "(Lcom/sagarock101/search/model/Results;)V", "onItemClick", "Lkotlin/Function3;", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function3;", "setOnItemClick", "(Lkotlin/jvm/functions/Function3;)V", "bind", "Companion", "search_release"})
public final class SearchResultsViewHolder extends com.sagarock101.core.viewholder.BaseViewHolder<com.sagarock101.search.model.Results> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super android.widget.ImageView, ? super android.widget.TextView, ? super com.sagarock101.search.model.Results, kotlin.Unit> onItemClick;
    @org.jetbrains.annotations.Nullable()
    private com.sagarock101.search.model.Results item;
    private final com.sagarock101.search.databinding.ItemSearchResultBinding binding = null;
    public static final com.sagarock101.search.ui.viewholder.SearchResultsViewHolder.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<android.widget.ImageView, android.widget.TextView, com.sagarock101.search.model.Results, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super android.widget.ImageView, ? super android.widget.TextView, ? super com.sagarock101.search.model.Results, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sagarock101.search.model.Results getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.Nullable()
    com.sagarock101.search.model.Results p0) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.sagarock101.search.model.Results item) {
    }
    
    public SearchResultsViewHolder(@org.jetbrains.annotations.NotNull()
    com.sagarock101.search.databinding.ItemSearchResultBinding binding) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u00a8\u0006\r"}, d2 = {"Lcom/sagarock101/search/ui/viewholder/SearchResultsViewHolder$Companion;", "", "()V", "from", "Lcom/sagarock101/core/viewholder/BaseViewHolder;", "Lcom/sagarock101/search/model/Results;", "parent", "Landroid/view/ViewGroup;", "onItemClick", "Lkotlin/Function3;", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "", "search_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.sagarock101.core.viewholder.BaseViewHolder<com.sagarock101.search.model.Results> from(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function3<? super android.widget.ImageView, ? super android.widget.TextView, ? super com.sagarock101.search.model.Results, kotlin.Unit> onItemClick) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}