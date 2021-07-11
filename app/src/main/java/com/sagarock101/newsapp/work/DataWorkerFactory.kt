package com.sagarock101.newsapp.work

import android.content.Context
import android.util.Log
import androidx.work.ListenableWorker
import androidx.work.WorkerFactory
import androidx.work.WorkerParameters
import com.sagarock101.core.utils.Utils
import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo
import timber.log.Timber
import javax.inject.Inject

class DataWorkerFactory @Inject constructor(private val repo: NewsHeadlinesRepo) : WorkerFactory() {

    override fun createWorker(
        appContext: Context,
        workerClassName: String,
        workerParameters: WorkerParameters
    ): ListenableWorker? {
        Log.i("factory", "createWorker")
        val workerKlass = Class.forName(workerClassName).asSubclass(NewsRequestWorker::class.java)
        val constructor =
            workerKlass.getDeclaredConstructor(Context::class.java, WorkerParameters::class.java)
        val instance = constructor.newInstance(appContext, workerParameters)

        when (instance) {
            is NewsRequestWorker -> {
                Timber.i("added repo")
                instance.newsHeadlinesRepo = repo
            }
            else -> Timber.i("no repo")

        }

        return instance
    }
}