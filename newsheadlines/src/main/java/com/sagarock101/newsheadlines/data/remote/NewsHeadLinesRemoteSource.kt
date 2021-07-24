package com.sagarock101.newsheadlines.data.remote

import com.sagarock101.core.utils.BaseDataSource
import com.sagarock101.database.model.NewsHeadLines
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NewsHeadLinesRemoteSource @Inject constructor(private val newsHeadlinesService: NewsHeadlinesService):
    BaseDataSource() {

   suspend fun getNewsHeadLines(country: String): Flow<NewsHeadLines> {
       return flow {
           emit(newsHeadlinesService.getTopHeadlines(country))
       }.flowOn(Dispatchers.IO)
   }


    suspend fun getNewsHeadLines(country: String, category: String) = execute { newsHeadlinesService.getTopHeadlines(country, category) }

}