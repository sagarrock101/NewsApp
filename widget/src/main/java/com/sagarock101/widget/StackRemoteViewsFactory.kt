package com.sagarock101.widget

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.RemoteViews
import android.widget.RemoteViewsService
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.sagarock101.core.utils.BindingUtils
import com.sagarock101.database.NewsDatabaseRepo
import com.sagarock101.database.model.Articles
import timber.log.Timber
import java.sql.Timestamp

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
    override fun getViewAt(position: Int) =
        RemoteViews(context.packageName, R.layout.widget_item).apply {
            setTextViewText(R.id.tv_news_title, listOfArticles?.get(position)?.title)
            setTextViewText(
                R.id.tv_source,
                getSourceNameAndElapsedTimeAfterSavingTheArticleToReadLater(
                    listOfArticles?.get(position)?.source?.name,
                    listOfArticles?.get(position)?.publishedAt
                )
            )
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

            val articleAtThisPosition = listOfArticles?.get(position)
            val fillInIntent = Intent().apply {

                Bundle().also { extras ->
                    extras.putInt(EXTRA_ITEM, position)
                    extras.putString(ARTICLE_ITEM_ID, articleAtThisPosition?.source?.id)
                    extras.putString(ARTICLE_ITEM_NAME, articleAtThisPosition?.source?.name)
                    extras.putString(ARTICLE_ITEM_AUTHOR, articleAtThisPosition?.author)
                    extras.putString(ARTICLE_ITEM_TITLE, articleAtThisPosition?.title)
                    extras.putString(ARTICLE_ITEM_DESCRIPTION, articleAtThisPosition?.description)
                    extras.putString(ARTICLE_ITEM_URL, articleAtThisPosition?.url)
                    extras.putString(ARTICLE_ITEM_URL_TO_IMG, articleAtThisPosition?.urlToImage)
                    articleAtThisPosition?.publishedAt?.time?.let {
                        extras.putLong(
                            ARTICLE_ITEM_PUBLISHED_AT,
                            it
                        )
                    }
                    extras.putString(ARTICLE_ITEM_CONTENT, articleAtThisPosition?.content)
                    putExtras(extras)
                }
            }
            setOnClickFillInIntent(R.id.rl_parent, fillInIntent)
        }

    private fun getSourceNameAndElapsedTimeAfterSavingTheArticleToReadLater(
        name: String?,
        publishedAt: Timestamp?
    ): CharSequence? {
        Timber.e(
            "$name + \" | \" + ${appendSavedOnWithTimeLeftcount(
                BindingUtils.getElapsedTime(
                    publishedAt?.time!!
                )
            )}"
        )
        return name + " | " + appendSavedOnWithTimeLeftcount(BindingUtils.getElapsedTime(publishedAt?.time!!)) + " ago"

    }

    private fun appendSavedOnWithTimeLeftcount(elapsedTime: String): String {
        if (elapsedTime == "less than 1m")
            return "Saved $elapsedTime"
        val timeElapsedChar = elapsedTime.toCharArray()
        return when (timeElapsedChar.last()) {
            'd' -> {
                if (timeElapsedChar[timeElapsedChar.size - 2] != '1')
                    "Saved " + elapsedTime + "ays"
                else "Saved " + elapsedTime + "ay"
            }
            'm' -> "Saved " + elapsedTime + "inutes"
            'h' -> {
                if (timeElapsedChar[timeElapsedChar.size - 2] != '1')
                    "Saved " + elapsedTime + "ours"
                else "Saved " + elapsedTime + "our"
            }
            else -> elapsedTime
        }
    }

    override fun getCount() = listOfArticles?.size ?: 0

    override fun getViewTypeCount() = 1

    override fun onDestroy() {
        listOfArticles?.clear()
    }


}