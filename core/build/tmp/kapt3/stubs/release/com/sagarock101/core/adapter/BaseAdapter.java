package com.sagarock101.core.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u0015\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH&J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0014\u0010\u001b\u001a\u00020\u00182\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006\u00a8\u0006\u001d"}, d2 = {"Lcom/sagarock101/core/adapter/BaseAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listItems", "", "(Ljava/util/List;)V", "()V", "getListItems", "()Ljava/util/List;", "setListItems", "getItemCount", "", "getItemViewType", "position", "getLayoutId", "obj", "(ILjava/lang/Object;)I", "getViewHolder", "Lcom/sagarock101/core/viewholder/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "setItems", "Binder", "core_release"})
public abstract class BaseAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<T> listItems;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getListItems() {
        return null;
    }
    
    public final void setListItems(@org.jetbrains.annotations.NotNull()
    java.util.List<T> p0) {
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<T> listItems) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sagarock101.core.viewholder.BaseViewHolder<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    protected abstract int getLayoutId(int position, T obj);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sagarock101.core.viewholder.BaseViewHolder<T> getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType);
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<T> listItems) {
        super();
    }
    
    public BaseAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/sagarock101/core/adapter/BaseAdapter$Binder;", "T", "", "bind", "", "data", "(Ljava/lang/Object;)V", "core_release"})
    public static abstract interface Binder<T extends java.lang.Object> {
        
        public abstract void bind(T data);
    }
}