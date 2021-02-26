package com.sagarock101.core.utils

import java.sql.Timestamp

object BindingUtils {
    /**
     * @param utcTimeString Time in UTC:+00 - Example: 2018-05-10T10:13:00Z
     * @return Formatted String of time elapsed by now in min/hrs/days
     */
    @JvmStatic
    fun getElapsedTime(utcTimeString: Long): String {
        var timeElapsedInSeconds =
            (System.currentTimeMillis() - utcTimeString) / 1000
        return if (timeElapsedInSeconds < 60) {
            "less than 1 m"
        } else if (timeElapsedInSeconds < 3600) {
            timeElapsedInSeconds = timeElapsedInSeconds / 60
            timeElapsedInSeconds.toString() + " m"
        } else if (timeElapsedInSeconds < 86400) {
            timeElapsedInSeconds = timeElapsedInSeconds / 3600
            timeElapsedInSeconds.toString() + " h"
        } else {
            timeElapsedInSeconds = timeElapsedInSeconds / 86400
            timeElapsedInSeconds.toString() + " d"
        }
    }

    /**
     * Utility method for fetching formatted News Source and Time
     *
     * @param sourceName Article source name
     * @param date       Publish date of article
     * @return Formatted outputted Example: **CNN • 7h**
     */
    @JvmStatic
    fun getSourceAndTime(sourceName: String, date: Timestamp): String {
        return sourceName + " | " + getElapsedTime(date.time)
    }

}