package com.sagarock101.core.utils

import timber.log.Timber
import java.util.*

object DateUtils {

    fun parseDate(dateString: String): String {
        val split = dateString.split(" ")
        val date = split[0]
        val dateSplit = date.split("-")
        var midOrEve: String = ""
        val splitPublishTime = split[1].split(":")[0]
        var newTime = ""
        if (splitPublishTime.toInt() >= 12) {
            newTime = (splitPublishTime.toInt().minus(12)).toString()
            midOrEve = "pm"
        } else {
            newTime = splitPublishTime
            midOrEve = "am"
        }
//        Timber.e(currentTime)
        var hour = ""
//        if(newTime.toInt() > 1)
//            hour = "hour"
//        else hour = "hours"
        return "Published on " + dateSplit[2] + "/" + dateSplit[1] + "/" + dateSplit[0] + " at " + newTime + ":" + split[1].split(":")[1] + " " + midOrEve
    }
}

