package com.sagarock101.widget

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sagarock101.core.viewmodel.CoroutineViewModel
import com.sagarock101.database.NewsDatabaseRepo
import com.sagarock101.database.model.Articles
import kotlinx.coroutines.Dispatchers.Main
import javax.inject.Inject

class WidgetViewModel @Inject constructor() : CoroutineViewModel(Main) {

    @Inject
    lateinit var newsDatabaseRepo: NewsDatabaseRepo

    private val _isSaved = MutableLiveData<Boolean>()
    val savedLiveData: LiveData<Boolean> = _isSaved

    private fun checkIfNewsExists(title: String) = launch {
        _isSaved.value = newsDatabaseRepo.checkIfNewsExists(title)
    }

    fun checkIfSaved(articles: Articles) {
        articles.title.let { checkIfNewsExists(it) }
    }

    fun deleteNews(articles: Articles) = launch {
        newsDatabaseRepo.deleteNews(articles)
        checkIfSaved(articles)
    }

    fun insertNews(articles: Articles) = launch {
        newsDatabaseRepo.insertNews(articles)
        checkIfSaved(articles)
    }
}