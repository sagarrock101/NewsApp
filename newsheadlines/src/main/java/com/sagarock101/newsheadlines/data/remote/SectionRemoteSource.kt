package com.sagarock101.newsheadlines.data.remote

import com.sagarock101.core.utils.BaseDataSource
import javax.inject.Inject

class SectionRemoteSource @Inject constructor(
    private val sectionService: SectionService
) :
    BaseDataSource() {

    suspend fun getSectionByType(category: String)  =
        execute {
            sectionService.getSectionByType(category, 20)
        }

}