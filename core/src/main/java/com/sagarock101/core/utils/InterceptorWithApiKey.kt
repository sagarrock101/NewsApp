package com.sagarock101.core.utils

import com.sagarock101.common.AppConstants
import okhttp3.Interceptor
import okhttp3.Response

class InterceptorWithApiKey constructor(val apiKey: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val newUrl = chain.request().url
            .newBuilder()
            .addQueryParameter(AppConstants.api_key, apiKey)
            .build()
        val newRequest = chain.request()
            .newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(newRequest)
    }

}