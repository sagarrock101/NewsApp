package com.sagarock101.database.converters

import androidx.room.TypeConverter
import java.sql.Timestamp

class TypeConverterForTimeStamp  {

    @TypeConverter
    fun toTimestamp(timestamp: Long?): Timestamp? {
        return timestamp?.let { Timestamp(it) }
    }

    @TypeConverter
    fun toDatabaseTimestamp(timestamp: Timestamp?): Long? {
        return timestamp?.time ?: Timestamp(System.currentTimeMillis())
            .time
    }


}