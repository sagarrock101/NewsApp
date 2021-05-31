package com.sagarock101.database.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sagarock101.database.model.Source
import java.lang.reflect.Type

class TypeConverterForSource  {

    @TypeConverter
    fun fromSource(source: Source?): String? {
        if (source == null)
            return null
        val gson = Gson()
        val type = object : TypeToken<Source>() {}.type
        return gson.toJson(source, type)
    }

    @TypeConverter
    fun toSource(source: String?): Source? {
        if (source.isNullOrEmpty())
            return null
        val type: Type = object : TypeToken<Source>() {}.type
        val gson = Gson()
        return gson.fromJson(source, type)
    }


}