package com.sagarock101.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.sagarock101.database.model.Articles

@Dao
interface NewsDao {

    @Query("Select * from Articles")
    fun getAllSavedNews(): LiveData<List<Articles>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNews(articles: Articles)

    @Delete
    suspend fun deleteNews(articles: Articles)

    @Query("Select exists(select * from Articles where id = :id)")
    suspend fun isRowExists(id: Int): Boolean
}