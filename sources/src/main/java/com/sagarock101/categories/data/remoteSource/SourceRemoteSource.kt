package com.sagarock101.categories.data.remoteSource

import com.sagarock101.categories.data.SourceService
import com.sagarock101.core.utils.BaseDataSource
import javax.inject.Inject

class SourceRemoteSource @Inject constructor(private val sourceService: SourceService) :
    BaseDataSource() {

    suspend fun getSources() = execute {
        sourceService.getSources()
    }
}