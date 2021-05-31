package com.sagarock101.newsheadlines.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/sagarock101/newsheadlines/data/remote/SectionRemoteSource;", "Lcom/sagarock101/core/utils/BaseDataSource;", "sectionService", "Lcom/sagarock101/newsheadlines/data/remote/SectionService;", "(Lcom/sagarock101/newsheadlines/data/remote/SectionService;)V", "getSectionByType", "Lcom/sagarock101/core/data/DataWrapper;", "Lcom/sagarock101/database/model/SectionResponse;", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newsheadlines_release"})
public final class SectionRemoteSource extends com.sagarock101.core.utils.BaseDataSource {
    private final com.sagarock101.newsheadlines.data.remote.SectionService sectionService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSectionByType(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.sagarock101.core.data.DataWrapper<com.sagarock101.database.model.SectionResponse>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public SectionRemoteSource(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsheadlines.data.remote.SectionService sectionService) {
        super();
    }
}