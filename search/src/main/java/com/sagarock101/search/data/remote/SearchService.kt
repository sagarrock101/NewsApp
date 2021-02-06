package com.sagarock101.search.data.remote

import com.sagarock101.search.model.SearchResults
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchService {

    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q") queryOrPhrase: String
    ): Response<SearchResults>

}