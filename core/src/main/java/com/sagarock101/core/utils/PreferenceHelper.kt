package com.sagarock101.core.utils

import android.content.Context
import android.content.SharedPreferences
import java.lang.UnsupportedOperationException

@Suppress("UNCHECKED_CAST")
class PreferenceHelper(val context: Context) {

    private var preferences =
        context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    fun getPreferences(): SharedPreferences = preferences

    fun saveToPreferences(key: String, value: Any) {
        if (preferences == null)
            preferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
        when (value) {
            is String -> getPreferences().edit().putString(key, value).apply()
            is Int -> getPreferences().edit().putInt(key, value).apply()
            is Boolean -> getPreferences().edit().putBoolean(key, value).apply()
            is Float -> getPreferences().edit().putFloat(key, value).apply()
            is Long -> getPreferences().edit().putLong(key, value).apply()
        }
    }

    fun <T> getStringToPreferences(key: String, defaultValue: T? = null): T {
        if (preferences == null) {
            preferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
        }
       return when (defaultValue) {
            is String, null -> preferences?.getString(key, defaultValue as? String) as T
            is Int -> preferences?.getInt(key, defaultValue as? Int ?: -1) as T
            is Boolean -> preferences?.getBoolean(key, defaultValue as? Boolean ?: false) as T
            is Float -> preferences?.getFloat(key, defaultValue as? Float ?: -1f) as T
            is Long -> preferences?.getLong(key, defaultValue as? Long ?: -1) as T
           else -> throw UnsupportedOperationException("")
        }
    }
}