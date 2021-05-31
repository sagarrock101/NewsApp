package com.sagarock101.categories.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sagarock101/categories/data/SourceRepo;", "", "sourceRemoteSource", "Lcom/sagarock101/categories/data/remoteSource/SourceRemoteSource;", "(Lcom/sagarock101/categories/data/remoteSource/SourceRemoteSource;)V", "getSource", "Landroidx/lifecycle/LiveData;", "Lcom/sagarock101/core/data/DataWrapper;", "Lcom/sagarock101/categories/model/Sources;", "sources_debug"})
@javax.inject.Singleton()
public final class SourceRepo {
    private final com.sagarock101.categories.data.remoteSource.SourceRemoteSource sourceRemoteSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.categories.model.Sources>> getSource() {
        return null;
    }
    
    @javax.inject.Inject()
    public SourceRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.categories.data.remoteSource.SourceRemoteSource sourceRemoteSource) {
        super();
    }
}