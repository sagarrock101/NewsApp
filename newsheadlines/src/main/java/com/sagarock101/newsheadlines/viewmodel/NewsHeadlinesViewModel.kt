package com.sagarock101.newsheadlines.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.switchMap
import com.sagarock101.core.viewmodel.CoroutineViewModel
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo
import com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource
import com.sagarock101.newsheadlines.data.remote.NewsHeadlinesService
import kotlinx.coroutines.Dispatchers.Main
import javax.inject.Inject

class NewsHeadlinesViewModel @Inject constructor() : CoroutineViewModel(Main) {

    @Inject
    lateinit var newsHeadlinesRepo: NewsHeadlinesRepo

    @Inject
    lateinit var application: Application

    private val newsHeadLinesMLD = MutableLiveData<String>()

    val newsHeadLinesLD = newsHeadLinesMLD.switchMap {
        newsHeadlinesRepo.getNewsHeadlines(it)
    }

    fun getNewsHeadLines() {
        newsHeadLinesMLD.postValue(application.applicationContext.getString(R.string.india))
    }

}