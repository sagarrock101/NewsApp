package com.sagarock101.newsapp.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.newsapp.NotificationUtils
import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo
import timber.log.Timber

class NewsRequestWorker(var appContext: Context, params: WorkerParameters): CoroutineWorker(appContext, params) {

    lateinit var newsHeadlinesRepo: NewsHeadlinesRepo


    override suspend fun doWork(): Result {
        val result = newsHeadlinesRepo.provideTopBreadkingNews()
        when(result.status) {
            DataWrapper.Status.ERROR -> {
                Timber.v("worker failed")
                return Result.failure()
            }

            DataWrapper.Status.SUCCESS -> {
                Timber.v("worker succeeded")
                var i = 0
                result.data?.articles?.forEach {
                    it.description?.let { it1 ->
                        NotificationUtils.createNotification(i++, it.title,
                            it1, appContext)
                    }
                }
                return Result.success()
            }
        }


        Timber.v("worker retry")


        return Result.retry()
    }

}