package com.sagarock101.newsheadlines.data

import androidx.lifecycle.LiveData
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.data.resultLiveData
import com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource
import com.sagarock101.database.model.NewsHeadLines
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsHeadlinesRepo @Inject constructor(private val remoteSource: NewsHeadLinesRemoteSource) {

    fun getNewsHeadlines(country: String): LiveData<DataWrapper<NewsHeadLines>> {
        return resultLiveData {
            remoteSource.getNewsHeadLines(country)
        }
    }

    fun getNewsHeadlines(country: String, category: String): LiveData<DataWrapper<NewsHeadLines>> {
        return resultLiveData {
            remoteSource.getNewsHeadLines(country, category)
        }
    }
}