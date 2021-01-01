package com.sagarock101.newsheadlines.data

import androidx.lifecycle.LiveData
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.data.resultLiveData
import com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource
import com.sagarock101.newsheadlines.model.NewsHeadLines
import javax.inject.Inject

class  NewsHeadlinesRepo @Inject constructor(private val remoteSource: NewsHeadLinesRemoteSource) {

    fun getNewsHeadlines(country: String): LiveData<DataWrapper<NewsHeadLines>> {
        return resultLiveData {
            remoteSource.getNewsHeadLines(country)
        }
    }
}