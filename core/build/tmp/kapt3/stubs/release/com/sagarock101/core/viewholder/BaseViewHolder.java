package com.sagarock101.core.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/sagarock101/core/viewholder/BaseViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "bind", "", "item", "(Ljava/lang/Object;)V", "core_release"})
public abstract class BaseViewHolder<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    
    public abstract void bind(T item);
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding binding) {
        super(null);
    }
}