package com.sagarock101.newsheadlines.data.remote

import com.sagarock101.core.utilities.BaseDataSource
import javax.inject.Inject

class NewsHeadLinesRemoteSource @Inject constructor(private val newsHeadlinesService: NewsHeadlinesService):
    BaseDataSource() {

   suspend fun getNewsHeadLines(country: String) =
       execute {
           newsHeadlinesService.getTopHeadlines(country)
       }

}