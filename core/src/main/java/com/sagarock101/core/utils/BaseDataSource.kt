package com.sagarock101.core.utils

import com.sagarock101.core.data.DataWrapper
import retrofit2.HttpException
import retrofit2.Response
import java.net.HttpURLConnection
import java.net.UnknownHostException
import javax.net.ssl.HttpsURLConnection

abstract class BaseDataSource {

    protected suspend fun <T> execute(call: suspend () -> Response<T>): DataWrapper<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) return DataWrapper.success(body)
            }

            response.errorBody()?.let {
                when (response.code()) {
                    HttpsURLConnection.HTTP_UNAUTHORIZED -> {
                        return error(response.code(), "Access Denied")
                    }
                    else -> {

                    }
                }
            }
            return error(response.code(), response.message())
        }catch (e: HttpException) {
            return error(HttpURLConnection.HTTP_SERVER_ERROR,e.message ?: e.toString())
        }catch (e: UnknownHostException){
            return error(HttpURLConnection.HTTP_GATEWAY_TIMEOUT,e.message ?: e.toString())
        } catch (e: Exception) {
            return error(HttpURLConnection.HTTP_SERVER_ERROR,e.message ?: e.toString())
        }
    }

    private fun <T> error(statusCode: Int, message: String): DataWrapper<T> {
        return DataWrapper.error(statusCode, message)
    }

}

