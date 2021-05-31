package com.sagarock101.core.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010 \u001a\u00020!2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H$J\u0018\u0010%\u001a\u00020!2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0004J\b\u0010\'\u001a\u00020!H$J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020,H\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00018\u0001X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006-"}, d2 = {"Lcom/sagarock101/core/view/BaseViewModelActivity;", "B", "Landroidx/databinding/ViewDataBinding;", "VM", "Lcom/sagarock101/core/viewmodel/BaseViewModel;", "Lcom/sagarock101/core/view/BaseActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "supportFragmentInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroidx/fragment/app/Fragment;", "getSupportFragmentInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setSupportFragmentInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "viewModel", "getViewModel", "()Lcom/sagarock101/core/viewmodel/BaseViewModel;", "setViewModel", "(Lcom/sagarock101/core/viewmodel/BaseViewModel;)V", "Lcom/sagarock101/core/viewmodel/BaseViewModel;", "handleData", "", "dataWrapper", "Lcom/sagarock101/core/data/DataWrapper;", "", "handleState", "wrapper", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "shouldUseDataBinding", "", "core_release"})
public abstract class BaseViewModelActivity<B extends androidx.databinding.ViewDataBinding, VM extends com.sagarock101.core.viewmodel.BaseViewModel> extends com.sagarock101.core.view.BaseActivity {
    @org.jetbrains.annotations.Nullable()
    private VM viewModel;
    @org.jetbrains.annotations.NotNull()
    protected B binding;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String TAG;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector;
    
    @org.jetbrains.annotations.Nullable()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.Nullable()
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final B getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void setTAG(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> getSupportFragmentInjector() {
        return null;
    }
    
    public final void setSupportFragmentInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void initViews();
    
    @java.lang.Override()
    protected boolean shouldUseDataBinding() {
        return false;
    }
    
    /**
     * Default state handling, can be override
     * This method will be called when viewmodel returns the livedata
     *
     * @param wrapper
     */
    protected final void handleState(@org.jetbrains.annotations.Nullable()
    com.sagarock101.core.data.DataWrapper<? extends java.lang.Object> wrapper) {
    }
    
    protected abstract void handleData(@org.jetbrains.annotations.Nullable()
    com.sagarock101.core.data.DataWrapper<? extends java.lang.Object> dataWrapper);
    
    public BaseViewModelActivity() {
        super();
    }
}