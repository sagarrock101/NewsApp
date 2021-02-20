package com.sagarock101.widget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.net.Uri
import android.widget.RemoteViews
import android.widget.Toast
import com.sagarock101.database.model.Articles
import com.sagarock101.database.model.Source
import com.sagarock101.widget.service.StackWidgetService
import timber.log.Timber

const val NAVIGATE_TO_DETAIL = "com.sagarock101.widget.detailActivity"
const val EXTRA_ITEM = "com.sagarock101.widget.EXTRA_ITEM"
const val ARTICLE_ITEM = "com.sagarock101.database.model.articles"
const val ARTICLE_ITEM_ID = "com.sagarock101.database.model.articles.source.id"
const val ARTICLE_ITEM_NAME = "com.sagarock101.database.model.articles.source.name"
const val ARTICLE_ITEM_AUTHOR = "com.sagarock101.database.model.articles.author"
const val ARTICLE_ITEM_TITLE = "com.sagarock101.database.model.articles.title"
const val ARTICLE_ITEM_DESCRIPTION = "com.sagarock101.database.model.articles.description"
const val ARTICLE_ITEM_URL = "com.sagarock101.database.model.articles.url"
const val ARTICLE_ITEM_URL_TO_IMG = "com.sagarock101.database.model.articles.urlToImage"
const val ARTICLE_ITEM_PUBLISHED_AT = "com.sagarock101.database.model.articles.publishedAt"
const val ARTICLE_ITEM_CONTENT = "com.sagarock101.database.model.articles.content"

class MyAppWidgetProvider : AppWidgetProvider() {


    override fun onReceive(context: Context?, intent: Intent?) {
        val mgr: AppWidgetManager = AppWidgetManager.getInstance(context)
        if (intent?.action == NAVIGATE_TO_DETAIL) {
            val appWidgetId: Int = intent.getIntExtra(
                AppWidgetManager.EXTRA_APPWIDGET_ID,
                AppWidgetManager.INVALID_APPWIDGET_ID
            )
            val viewIndex: Int = intent.getIntExtra(EXTRA_ITEM, 0)
            val id: String? = intent.getStringExtra(ARTICLE_ITEM_ID)
            val name: String? = intent.getStringExtra(ARTICLE_ITEM_NAME)
            val author: String? = intent.getStringExtra(ARTICLE_ITEM_AUTHOR)
            val title: String? = intent.getStringExtra(ARTICLE_ITEM_TITLE)
            val desc: String? = intent.getStringExtra(ARTICLE_ITEM_DESCRIPTION)
            val url: String? = intent.getStringExtra(ARTICLE_ITEM_URL)
            val urlToImg: String? = intent.getStringExtra(ARTICLE_ITEM_URL_TO_IMG)
            val publishedAt: String? = intent.getStringExtra(ARTICLE_ITEM_PUBLISHED_AT)
            val content: String? = intent.getStringExtra(ARTICLE_ITEM_CONTENT)

            navigateToWidgetDetailActivity(context, Articles(Source(id, name), author, title!!, desc, url, urlToImg, publishedAt, content))
        }
        super.onReceive(context, intent)
    }

    private fun navigateToWidgetDetailActivity(
        context: Context?,
        articles: Articles
    ) {
        val widgetItemDetailIntent = Intent(context, WidgetItemDetailActivity::class.java)
            .apply {
                putExtra(ARTICLE_ITEM, articles)
                addFlags(FLAG_ACTIVITY_NEW_TASK)
            }
        context?.startActivity(widgetItemDetailIntent)
    }

    override fun onUpdate(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        appWidgetIds?.forEach { appWidgetId ->
            val intent = Intent(context, StackWidgetService::class.java).apply {
                putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId)
                data = Uri.parse(toUri(Intent.URI_INTENT_SCHEME))
            }

            val rv = RemoteViews(context?.packageName, R.layout.widget_news_layout).apply {
                setRemoteAdapter(R.id.stack_view, intent)
                setEmptyView(R.id.stack_view, R.id.empty_view)
            }

            val toastPendingIntent: PendingIntent = Intent(
                context,
                MyAppWidgetProvider::class.java
            ).run {

                action = NAVIGATE_TO_DETAIL
                putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId)
                data = Uri.parse(toUri(Intent.URI_INTENT_SCHEME))
                PendingIntent.getBroadcast(context, 0, this, PendingIntent.FLAG_UPDATE_CURRENT)
            }
            rv.setPendingIntentTemplate(R.id.stack_view, toastPendingIntent)
            appWidgetManager?.updateAppWidget(appWidgetId, rv)
        }
        super.onUpdate(context, appWidgetManager, appWidgetIds)
    }

}