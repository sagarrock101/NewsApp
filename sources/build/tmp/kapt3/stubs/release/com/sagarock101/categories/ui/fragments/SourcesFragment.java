package com.sagarock101.categories.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/sagarock101/categories/ui/fragments/SourcesFragment;", "Lcom/sagarock101/core/view/BaseViewModelFragment;", "Lcom/sagarock101/categories/databinding/FragmentSourcesBinding;", "Lcom/sagarock101/categories/viewmodel/SourceViewModel;", "()V", "adapter", "Lcom/sagarock101/categories/ui/adapter/SourcesAdapter;", "getAdapter", "()Lcom/sagarock101/categories/ui/adapter/SourcesAdapter;", "setAdapter", "(Lcom/sagarock101/categories/ui/adapter/SourcesAdapter;)V", "btmNavHeight", "", "viewModelFactory", "Lcom/sagarock101/core/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/sagarock101/core/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/sagarock101/core/di/ViewModelFactory;)V", "getLayout", "initView", "", "view", "Landroid/view/View;", "isNetworkActive", "isActive", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sources_release"})
public final class SourcesFragment extends com.sagarock101.core.view.BaseViewModelFragment<com.sagarock101.categories.databinding.FragmentSourcesBinding, com.sagarock101.categories.viewmodel.SourceViewModel> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.core.di.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public com.sagarock101.categories.ui.adapter.SourcesAdapter adapter;
    private int btmNavHeight = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.core.di.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.categories.ui.adapter.SourcesAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.sagarock101.categories.ui.adapter.SourcesAdapter p0) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void isNetworkActive(boolean isActive) {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public SourcesFragment() {
        super();
    }
}