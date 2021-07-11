package com.sagarock101.newsapp.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.utils.Utils
import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo
import timber.log.Timber
import javax.inject.Inject

class NewsRequestWorker(appContext: Context, params: WorkerParameters): CoroutineWorker(appContext, params) {

    lateinit var newsHeadlinesRepo: NewsHeadlinesRepo


    override suspend fun doWork(): Result {
        val result = newsHeadlinesRepo.provideTopBreadkingNews()
        when(result.status) {
            DataWrapper.Status.ERROR -> {
                Timber.e("worker failed")
//                Utils.showToast(applicationContext, "failed")
                return Result.failure()
            }

            DataWrapper.Status.SUCCESS -> {
                Timber.e("worker succeeded")
//                Utils.showToast(applicationContext, "succeeded")

                return Result.success()
            }
        }

        Timber.e("worker retry")
//        Utils.showToast(applicationContext, "retry")


        return Result.retry()
    }

}