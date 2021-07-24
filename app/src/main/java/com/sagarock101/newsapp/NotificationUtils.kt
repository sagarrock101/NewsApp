package com.sagarock101.newsapp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat.getSystemService


const val CHANNEL_ID = "com.sagarrock101.newsapp"
object NotificationUtils {

    @RequiresApi(Build.VERSION_CODES.O)
    fun initializeChannel(context: Context) {
        val notificationManager = (context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, "My Channel", importance)
            channel.description = "Reminders"
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun getNotificationBuilder(context: Context): NotificationCompat.Builder {
        return NotificationCompat.Builder(context, CHANNEL_ID)

    }

    fun createNotification(
        nId: Int,
        title: String,
        body: String,
        context: Context
    ) {
        val mBuilder = getNotificationBuilder(context).setSmallIcon(R.mipmap.ic_launcher_round)
            .setBadgeIconType(NotificationCompat.BADGE_ICON_LARGE)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(NotificationCompat.BigTextStyle()
                .bigText(title))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setVibrate(LongArray(0))
        // mId allows you to update the notification later on.
        NotificationManagerCompat.from(context).notify(nId, mBuilder.build())
    }
}