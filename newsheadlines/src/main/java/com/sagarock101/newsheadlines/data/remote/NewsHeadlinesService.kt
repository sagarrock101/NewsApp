package com.sagarock101.newsheadlines.data.remote

import com.sagarock101.database.model.NewsHeadLines
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsHeadlinesService {

    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String
    ): Response<NewsHeadLines>

    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String,
        @Query("category") category: String
    ): Response<NewsHeadLines>
}