package com.sagarock101.search.data.remote

import com.sagarock101.core.utils.BaseDataSource
import retrofit2.http.Query
import javax.inject.Inject

class SearchRemoteSource @Inject constructor(private val searchService: SearchService): BaseDataSource() {

    suspend fun getSearchResults(searchQuery: String) = execute {
        searchService.getEverything(searchQuery)
    }

}