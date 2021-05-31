package com.sagarock101.database

import android.app.Application
import androidx.room.*
import com.sagarock101.database.converters.TypeConverterForSource
import com.sagarock101.database.converters.TypeConverterForTimeStamp
import com.sagarock101.database.model.Articles

@Database(entities = [Articles::class], version = 6, exportSchema = false)
@TypeConverters(TypeConverterForSource::class, TypeConverterForTimeStamp::class)
abstract class NewsDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao

    companion object {

        @Volatile
        private var INSTANCE: NewsDatabase? = null

        fun getDatabase(context: Application): NewsDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    NewsDatabase::class.java,
                    "news_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}