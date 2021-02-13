package com.sagarock101.search.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.switchMap
import androidx.room.RoomDatabase
import com.sagarock101.core.viewmodel.CoroutineViewModel
import com.sagarock101.database.NewsDatabaseRepo
import com.sagarock101.database.model.Articles
import com.sagarock101.search.data.remote.SearchRepo
import com.sagarock101.search.model.Results
import kotlinx.coroutines.Dispatchers.Main
import javax.inject.Inject

class SearchViewModel @Inject constructor() : CoroutineViewModel(Main) {

    @Inject
    lateinit var searchRepo: SearchRepo

    @Inject
    lateinit var newsDatabaseRepo: NewsDatabaseRepo

    private val _isSaved = MutableLiveData<Boolean>()
    val savedLiveData: LiveData<Boolean> = _isSaved

    private var searchResultsMutableLiveData = MutableLiveData<String>()
    val searchResultsLiveData = searchResultsMutableLiveData.switchMap {
        searchRepo.getSearchResults(it)
    }

    fun getSearchResults(query: String) {
        searchResultsMutableLiveData.postValue(query)
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

    fun insertNews(articles: Articles) = launch{
        newsDatabaseRepo.insertNews(articles)
        checkIfSaved(articles)
    }
}