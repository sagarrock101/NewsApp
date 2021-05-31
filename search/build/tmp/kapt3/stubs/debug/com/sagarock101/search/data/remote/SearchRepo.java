package com.sagarock101.search.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/sagarock101/search/data/remote/SearchRepo;", "Lcom/sagarock101/core/utils/BaseDataSource;", "searchRemoteSource", "Lcom/sagarock101/search/data/remote/SearchRemoteSource;", "(Lcom/sagarock101/search/data/remote/SearchRemoteSource;)V", "getSearchResults", "Landroidx/lifecycle/LiveData;", "Lcom/sagarock101/core/data/DataWrapper;", "Lcom/sagarock101/search/model/SearchResponse;", "searchQuery", "", "search_debug"})
public final class SearchRepo extends com.sagarock101.core.utils.BaseDataSource {
    private final com.sagarock101.search.data.remote.SearchRemoteSource searchRemoteSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.search.model.SearchResponse>> getSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.search.data.remote.SearchRemoteSource searchRemoteSource) {
        super();
    }
}