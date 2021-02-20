package com.sagarock101.widget

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import android.widget.RemoteViewsService
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.sagarock101.database.NewsDatabaseRepo
import com.sagarock101.database.model.Articles
import timber.log.Timber

class StackRemoteViewsFactory(
    private val context: Context,
    intent: Intent,
    val newsDatabaseRepo: NewsDatabaseRepo
) : RemoteViewsService.RemoteViewsFactory {

    private var listOfArticles: ArrayList<Articles>? = null

    override fun onCreate() {

    }

    override fun getLoadingView() = null

    override fun getItemId(position: Int) = position.toLong()

    override fun onDataSetChanged() {
        listOfArticles = newsDatabaseRepo.getSynchronouslySavedNews() as ArrayList<Articles>
    }

    override fun hasStableIds() = true

    @SuppressLint("CheckResult")
    override fun getViewAt(position: Int) = RemoteViews(context.packageName, R.layout.widget_item).apply {
        setTextViewText(R.id.tv_news_title, listOfArticles?.get(position)?.title)
        try {
            val requestOptions = RequestOptions()
            requestOptions.transform(CenterCrop(), RoundedCorners(10))
            val bitmap = Glide.with(context).asBitmap()
                .load(listOfArticles?.get(position)?.urlToImage)
                .apply(requestOptions)
                .submit().get()
            setImageViewBitmap(R.id.iv_image, bitmap)
        } catch (e: Exception) {
            Timber.e("Exception: ${e.message}")
        }
    }

    override fun getCount() = listOfArticles?.size ?: 0

    override fun getViewTypeCount() = 1

    override fun onDestroy() {
        listOfArticles?.clear()
    }
}