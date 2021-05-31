package com.sagarock101.core.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0015\u00a8\u0006\u0011"}, d2 = {"Lcom/sagarock101/core/viewmodel/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "error", "Lcom/sagarock101/core/data/DataWrapper;", "T", "statusCode", "", "message", "", "execute", "response", "Lretrofit2/Response;", "onCleared", "", "core_debug"})
public class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.sagarock101.core.data.DataWrapper<T> execute(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response) {
        return null;
    }
    
    private final <T extends java.lang.Object>com.sagarock101.core.data.DataWrapper<T> error(int statusCode, java.lang.String message) {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}