package com.sagarock101.search.data.remote

import com.sagarock101.core.data.resultLiveData
import com.sagarock101.core.utils.BaseDataSource
import javax.inject.Inject

class SearchRepo @Inject constructor(private val searchRemoteSource: SearchRemoteSource) : BaseDataSource() {

    fun getSearchResults(searchQuery: String) =
        resultLiveData {
            searchRemoteSource.getSearchResults(searchQuery)
        }

}