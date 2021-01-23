package com.sagarock101.categories.data

import androidx.lifecycle.LiveData
import com.sagarock101.categories.data.remoteSource.SourceRemoteSource
import com.sagarock101.categories.model.Source
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.data.resultLiveData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SourceRepo @Inject constructor(private val sourceRemoteSource: SourceRemoteSource) {

    fun getSource() = resultLiveData { sourceRemoteSource.getSources() }
}