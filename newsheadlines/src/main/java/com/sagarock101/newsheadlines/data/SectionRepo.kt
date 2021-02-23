package com.sagarock101.newsheadlines.data

import androidx.lifecycle.LiveData
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.data.resultLiveData
import com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource
import com.sagarock101.database.model.NewsHeadLines
import com.sagarock101.database.model.SectionResponse
import com.sagarock101.newsheadlines.data.remote.SectionRemoteSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SectionRepo @Inject constructor(private val remoteSource: SectionRemoteSource) {

    fun getNewsHeadlines(category: String): LiveData<DataWrapper<SectionResponse>> {
        return resultLiveData {
            remoteSource.getSectionByType(category)
        }
    }

}