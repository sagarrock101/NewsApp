package com.sagarock101.categories.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/sagarock101/categories/viewmodel/SourceViewModel;", "Lcom/sagarock101/core/viewmodel/CoroutineViewModel;", "()V", "sourceRepo", "Lcom/sagarock101/categories/data/SourceRepo;", "getSourceRepo", "()Lcom/sagarock101/categories/data/SourceRepo;", "setSourceRepo", "(Lcom/sagarock101/categories/data/SourceRepo;)V", "getSources", "Landroidx/lifecycle/LiveData;", "Lcom/sagarock101/core/data/DataWrapper;", "Lcom/sagarock101/categories/model/Sources;", "sources_release"})
public final class SourceViewModel extends com.sagarock101.core.viewmodel.CoroutineViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.categories.data.SourceRepo sourceRepo;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.categories.data.SourceRepo getSourceRepo() {
        return null;
    }
    
    public final void setSourceRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.categories.data.SourceRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.categories.model.Sources>> getSources() {
        return null;
    }
    
    @javax.inject.Inject()
    public SourceViewModel() {
        super(null);
    }
}