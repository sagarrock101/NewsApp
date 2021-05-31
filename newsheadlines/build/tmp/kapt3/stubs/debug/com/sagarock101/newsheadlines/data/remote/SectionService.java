package com.sagarock101.newsheadlines.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/sagarock101/newsheadlines/data/remote/SectionService;", "", "getSectionByType", "Lretrofit2/Response;", "Lcom/sagarock101/database/model/SectionResponse;", "sectionType", "", "pageSize", "", "fieldsToBeShown", "orderBy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newsheadlines_debug"})
public abstract interface SectionService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search")
    public abstract java.lang.Object getSectionByType(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "section")
    java.lang.String sectionType, @retrofit2.http.Query(value = "page-size")
    int pageSize, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "show-fields")
    java.lang.String fieldsToBeShown, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "order-by")
    java.lang.String orderBy, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.sagarock101.database.model.SectionResponse>> p4);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}