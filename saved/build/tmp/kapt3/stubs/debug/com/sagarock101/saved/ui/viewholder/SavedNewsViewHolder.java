package com.sagarock101.saved.ui.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR4\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006!"}, d2 = {"Lcom/sagarock101/saved/ui/viewholder/SavedNewsViewHolder;", "Lcom/sagarock101/core/viewholder/BaseViewHolder;", "Lcom/sagarock101/database/model/Articles;", "binding", "Lcom/sagarock101/saved/databinding/ItemSavedBinding;", "(Lcom/sagarock101/saved/databinding/ItemSavedBinding;)V", "item", "getItem", "()Lcom/sagarock101/database/model/Articles;", "setItem", "(Lcom/sagarock101/database/model/Articles;)V", "onItemClick", "Lkotlin/Function3;", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function3;", "setOnItemClick", "(Lkotlin/jvm/functions/Function3;)V", "viewModel", "Lcom/sagarock101/saved/viewmodel/SavedNewsViewModel;", "getViewModel", "()Lcom/sagarock101/saved/viewmodel/SavedNewsViewModel;", "setViewModel", "(Lcom/sagarock101/saved/viewmodel/SavedNewsViewModel;)V", "bind", "getItemDetails", "Landroidx/recyclerview/selection/ItemDetailsLookup$ItemDetails;", "setSelected", "isActivated", "", "Companion", "saved_debug"})
public final class SavedNewsViewHolder extends com.sagarock101.core.viewholder.BaseViewHolder<com.sagarock101.database.model.Articles> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super android.widget.ImageView, ? super android.widget.TextView, ? super com.sagarock101.database.model.Articles, kotlin.Unit> onItemClick;
    @org.jetbrains.annotations.Nullable()
    private com.sagarock101.saved.viewmodel.SavedNewsViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private com.sagarock101.database.model.Articles item;
    private final com.sagarock101.saved.databinding.ItemSavedBinding binding = null;
    public static final com.sagarock101.saved.ui.viewholder.SavedNewsViewHolder.Companion Companion = null;
    
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
    public final com.sagarock101.database.model.Articles getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.Nullable()
    com.sagarock101.database.model.Articles p0) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles item) {
    }
    
    public final void setSelected(boolean isActivated) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.selection.ItemDetailsLookup.ItemDetails<com.sagarock101.database.model.Articles> getItemDetails() {
        return null;
    }
    
    public SavedNewsViewHolder(@org.jetbrains.annotations.NotNull()
    com.sagarock101.saved.databinding.ItemSavedBinding binding) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/sagarock101/saved/ui/viewholder/SavedNewsViewHolder$Companion;", "", "()V", "from", "Lcom/sagarock101/core/viewholder/BaseViewHolder;", "Lcom/sagarock101/database/model/Articles;", "parent", "Landroid/view/ViewGroup;", "onItemClick", "Lkotlin/Function3;", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "", "viewModel", "Lcom/sagarock101/saved/viewmodel/SavedNewsViewModel;", "saved_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.sagarock101.core.viewholder.BaseViewHolder<com.sagarock101.database.model.Articles> from(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function3<? super android.widget.ImageView, ? super android.widget.TextView, ? super com.sagarock101.database.model.Articles, kotlin.Unit> onItemClick, @org.jetbrains.annotations.Nullable()
        com.sagarock101.saved.viewmodel.SavedNewsViewModel viewModel) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}