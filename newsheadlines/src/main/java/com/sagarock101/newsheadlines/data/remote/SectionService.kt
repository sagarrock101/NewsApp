package com.sagarock101.newsheadlines.data.remote

import com.sagarock101.database.model.SectionResponse
import com.sagarock101.newsheadlines.SectionQueryParams
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SectionService {

    @GET("search")
    suspend fun getSectionByType(
        @Query("section") sectionType: String,
        @Query("page-size") pageSize: Int,
        @Query("show-fields") fieldsToBeShown: String = SectionQueryParams.SHOW_FIELDS_PARAM,
        @Query("order-by") orderBy: String = SectionQueryParams.ORDER_BY_PARAM
    ): Response<SectionResponse>

}