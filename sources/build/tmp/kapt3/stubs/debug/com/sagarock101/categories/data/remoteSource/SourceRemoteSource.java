package com.sagarock101.categories.data.remoteSource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/sagarock101/categories/data/remoteSource/SourceRemoteSource;", "Lcom/sagarock101/core/utils/BaseDataSource;", "sourceService", "Lcom/sagarock101/categories/data/SourceService;", "(Lcom/sagarock101/categories/data/SourceService;)V", "getSources", "Lcom/sagarock101/core/data/DataWrapper;", "Lcom/sagarock101/categories/model/Sources;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sources_debug"})
public final class SourceRemoteSource extends com.sagarock101.core.utils.BaseDataSource {
    private final com.sagarock101.categories.data.SourceService sourceService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSources(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.sagarock101.core.data.DataWrapper<com.sagarock101.categories.model.Sources>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public SourceRemoteSource(@org.jetbrains.annotations.NotNull()
    com.sagarock101.categories.data.SourceService sourceService) {
        super();
    }
}