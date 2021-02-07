package com.sagarock101.core.utils

import com.sagarock101.common.AppConstants
import com.sagarock101.common.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class GuardianApiKeyInterceptor constructor(val apiKey: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val newUrl = chain.request().url
            .newBuilder()
            .addQueryParameter(AppConstants.guardian_news_api_key, apiKey)
            .build()
        val newRequest = chain.request()
            .newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(newRequest)
    }

}