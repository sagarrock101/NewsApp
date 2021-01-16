package com.sagarock101.database

import com.sagarock101.database.model.Articles
import javax.inject.Inject

class NewsDatabaseRepo @Inject constructor(private val dao: NewsDao){

    fun getAllSavedNews() = dao.getAllSavedNews()

    suspend fun insertNews(articles: Articles) {
        dao.insertNews(articles)
    }

    suspend fun deleteNews(articles: Articles) {
        dao.deleteNews(articles)
    }

    suspend fun checkIfNewsExists(title: String) = dao.isRowExists(title)
}