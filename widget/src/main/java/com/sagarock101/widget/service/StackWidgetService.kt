package com.sagarock101.widget.service

import android.content.Intent
import android.widget.RemoteViewsService
import com.sagarock101.database.NewsDao
import com.sagarock101.database.NewsDatabase
import com.sagarock101.database.NewsDatabaseRepo
import com.sagarock101.widget.StackRemoteViewsFactory

class StackWidgetService : RemoteViewsService() {

    private var newsDatabase: NewsDatabase? = null

    private var newsDatabaseDao: NewsDao? = null

    private var newsDatabaseRepo: NewsDatabaseRepo? = null

    override fun onCreate() {
        super.onCreate()
        newsDatabase = NewsDatabase.getDatabase(this.application)
        newsDatabaseDao = newsDatabase?.newsDao()
        newsDatabaseRepo = newsDatabaseDao?.let { NewsDatabaseRepo(it) }
    }

    override fun onGetViewFactory(intent: Intent?) =
        intent?.let { newsDatabaseRepo?.let { it1 ->
            StackRemoteViewsFactory(this.applicationContext, it,
                it1
            )
        } }



}