package com.sagarock101.core.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData

fun <T> resultLiveData(networkCall: suspend () -> DataWrapper<T>): LiveData<DataWrapper<T>> =
    liveData {
        emit(DataWrapper.loading<T>())
        val responseStatus = networkCall.invoke()
        if (responseStatus.status == DataWrapper.Status.SUCCESS) {
            emit(DataWrapper.success<T>(responseStatus.data!!))
        } else if (responseStatus.status == DataWrapper.Status.ERROR) {
            emit(DataWrapper.error<T>(responseStatus.statusCode,responseStatus.message!!))
        }
    }
