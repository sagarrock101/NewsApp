package com.sagarock101.categories.data

import com.sagarock101.categories.model.Sources
import retrofit2.Response
import retrofit2.http.GET

interface SourceService {

    @GET("sources")
    suspend fun getSources(): Response<Sources>

}