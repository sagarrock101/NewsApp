package com.sagarock101.search.data.remote

import com.sagarock101.search.model.SearchResponse
import com.sagarock101.search.model.SearchResults
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchService {

    @GET("search")
    suspend fun getEverything(
        @Query("q") queryOrPhrase: String,
        @Query("show-fields") fieldsToBeShown: String,
        @Query("order-by") orderBy: String
    ): Response<SearchResponse>

}