package com.sagarock101.core.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H&J\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aH&J&\u0010%\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\'\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010(\u001a\u00020\"H\u0004J\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+R\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006,"}, d2 = {"Lcom/sagarock101/core/view/BaseViewModelFragment;", "B", "Landroidx/databinding/ViewDataBinding;", "VM", "Lcom/sagarock101/core/viewmodel/CoroutineViewModel;", "Lcom/sagarock101/core/view/BaseFragment;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "viewModel", "getViewModel", "()Lcom/sagarock101/core/viewmodel/CoroutineViewModel;", "setViewModel", "(Lcom/sagarock101/core/viewmodel/CoroutineViewModel;)V", "Lcom/sagarock101/core/viewmodel/CoroutineViewModel;", "bindView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getLayout", "", "hideKeyboard", "", "initView", "view", "onCreateView", "savedInstanceState", "onViewCreated", "readBundle", "showToast", "msg", "", "core_debug"})
public abstract class BaseViewModelFragment<B extends androidx.databinding.ViewDataBinding, VM extends com.sagarock101.core.viewmodel.CoroutineViewModel> extends com.sagarock101.core.view.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    protected B binding;
    @org.jetbrains.annotations.NotNull()
    protected VM viewModel;
    @org.jetbrains.annotations.Nullable()
    private android.os.Bundle bundle;
    
    @org.jetbrains.annotations.NotNull()
    protected final B getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.os.Bundle getBundle() {
        return null;
    }
    
    protected final void setBundle(@org.jetbrains.annotations.Nullable()
    android.os.Bundle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View bindView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract int getLayout();
    
    public abstract void initView(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    protected final void readBundle() {
    }
    
    public final void hideKeyboard() {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public BaseViewModelFragment() {
        super();
    }
}