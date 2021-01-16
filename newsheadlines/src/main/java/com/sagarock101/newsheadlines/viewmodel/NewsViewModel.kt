package com.sagarock101.newsheadlines.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.switchMap
import com.sagarock101.core.viewmodel.CoroutineViewModel
import com.sagarock101.database.NewsDatabaseRepo
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo
import com.sagarock101.database.model.ArticleRequest
import com.sagarock101.database.model.Articles
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.Main
import javax.inject.Inject

class NewsViewModel @Inject constructor() : CoroutineViewModel(Main) {

    @Inject
    lateinit var newsHeadlinesRepo: NewsHeadlinesRepo

    @Inject
    lateinit var newsDatabaseRepo: NewsDatabaseRepo

    @Inject
    lateinit var application: Application


    private val newsHeadLinesMLD = MutableLiveData<ArticleRequest>()

    private val _isSaved = MutableLiveData<Boolean>()
    val savedLiveData: LiveData<Boolean> = _isSaved

    val newsHeadLinesLD = newsHeadLinesMLD.switchMap {
        if (it.category.isEmpty())
            newsHeadlinesRepo.getNewsHeadlines(it.country)
        else newsHeadlinesRepo.getNewsHeadlines(it.country, it.category)
    }

    fun getNewsHeadLines(type: String = "") {
        if (type.isEmpty()) {
            newsHeadLinesMLD.postValue(
                ArticleRequest(
                    application.applicationContext.getString(R.string.india),
                    ""
                )
            )
        } else {
            newsHeadLinesMLD.postValue(
                ArticleRequest(
                    application.applicationContext.getString(R.string.india),
                    category = type
                )
            )
        }

    }

    fun insertNews(articles: Articles) = launch{
        newsDatabaseRepo.insertNews(articles)
        checkIfSaved(articles)
    }

    fun getSavedNewsArticles() = launch {
        newsDatabaseRepo.getAllSavedNews()
    }

    private fun checkIfNewsExists(title: String) = launch {
        _isSaved.value = newsDatabaseRepo.checkIfNewsExists(title)
    }

    fun checkIfSaved(articles: Articles) {
        articles.title?.let { checkIfNewsExists(it) }
    }

    fun deleteNews(articles: Articles) = launch {
        newsDatabaseRepo.deleteNews(articles)
        checkIfSaved(articles)
    }

    fun clearViewModelMLDs() {
        _isSaved.value = false
    }

    fun getAllSavedNews(): LiveData<List<Articles>> {
        return newsDatabaseRepo.getAllSavedNews()
    }
}