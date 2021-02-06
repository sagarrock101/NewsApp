package com.sagarock101.search.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.switchMap
import com.sagarock101.core.viewmodel.CoroutineViewModel
import com.sagarock101.search.data.remote.SearchRepo
import kotlinx.coroutines.Dispatchers.Main
import javax.inject.Inject

class SearchViewModel @Inject constructor() : CoroutineViewModel(Main) {

    @Inject
    lateinit var searchRepo: SearchRepo

    private var searchResultsMutableLiveData = MutableLiveData<String>()
    val searchResultsLiveData = searchResultsMutableLiveData.switchMap {
        searchRepo.getSearchResults(it)
    }

    fun getSearchResults(query: String) {
        searchResultsMutableLiveData.postValue(query)
    }
}