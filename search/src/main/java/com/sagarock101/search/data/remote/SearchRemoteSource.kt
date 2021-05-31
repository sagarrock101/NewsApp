package com.sagarock101.search.data.remote

import com.sagarock101.core.utils.BaseDataSource
import com.sagarock101.search.SearchQueryParams
import javax.inject.Inject

class SearchRemoteSource @Inject constructor(private val searchService: SearchService) :
    BaseDataSource() {

    suspend fun getSearchResults(searchQuery: String) = execute {
        searchService.getEverything(
            searchQuery,
            SearchQueryParams.SHOW_FIELDS_PARAM,
            SearchQueryParams.ORDER_BY_PARAM
        )
    }

}