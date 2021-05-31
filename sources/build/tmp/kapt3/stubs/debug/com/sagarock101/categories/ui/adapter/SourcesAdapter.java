package com.sagarock101.categories.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/sagarock101/categories/ui/adapter/SourcesAdapter;", "Lcom/sagarock101/core/adapter/BaseAdapter;", "Lcom/sagarock101/categories/model/Source;", "()V", "lastSelectedPosition", "", "getLastSelectedPosition", "()I", "setLastSelectedPosition", "(I)V", "objectAnimator", "Landroid/animation/ObjectAnimator;", "selectedPosition", "getSelectedPosition", "setSelectedPosition", "getLayoutId", "position", "obj", "getViewHolder", "Lcom/sagarock101/core/viewholder/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "SourceViewHolder", "sources_debug"})
public final class SourcesAdapter extends com.sagarock101.core.adapter.BaseAdapter<com.sagarock101.categories.model.Source> {
    private int selectedPosition = -1;
    private int lastSelectedPosition = -1;
    private android.animation.ObjectAnimator objectAnimator;
    
    public final int getSelectedPosition() {
        return 0;
    }
    
    public final void setSelectedPosition(int p0) {
    }
    
    public final int getLastSelectedPosition() {
        return 0;
    }
    
    public final void setLastSelectedPosition(int p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutId(int position, @org.jetbrains.annotations.NotNull()
    com.sagarock101.categories.model.Source obj) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sagarock101.core.viewholder.BaseViewHolder<com.sagarock101.categories.model.Source> getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public SourcesAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0002J\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/sagarock101/categories/ui/adapter/SourcesAdapter$SourceViewHolder;", "Lcom/sagarock101/core/viewholder/BaseViewHolder;", "Lcom/sagarock101/categories/model/Source;", "Landroid/view/View$OnClickListener;", "binding", "Lcom/sagarock101/categories/databinding/ItemSourcesBinding;", "(Lcom/sagarock101/categories/ui/adapter/SourcesAdapter;Lcom/sagarock101/categories/databinding/ItemSourcesBinding;)V", "bind", "", "item", "clickEventLogic", "collapse", "expand", "hideShowDetails", "visibility", "", "onClick", "v", "Landroid/view/View;", "openBrowser", "rotateArrow", "shouldRotate", "", "rotatingObjectAnimator", "from", "", "to", "sources_debug"})
    public final class SourceViewHolder extends com.sagarock101.core.viewholder.BaseViewHolder<com.sagarock101.categories.model.Source> implements android.view.View.OnClickListener {
        private final com.sagarock101.categories.databinding.ItemSourcesBinding binding = null;
        
        @java.lang.Override()
        public void bind(@org.jetbrains.annotations.NotNull()
        com.sagarock101.categories.model.Source item) {
        }
        
        public final void expand() {
        }
        
        private final void rotateArrow(boolean shouldRotate) {
        }
        
        public final void collapse() {
        }
        
        private final void hideShowDetails(int visibility) {
        }
        
        private final void rotatingObjectAnimator(float from, float to) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        private final void openBrowser() {
        }
        
        private final void clickEventLogic() {
        }
        
        public SourceViewHolder(@org.jetbrains.annotations.NotNull()
        com.sagarock101.categories.databinding.ItemSourcesBinding binding) {
            super(null);
        }
    }
}