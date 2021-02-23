package com.sagarock101.newsheadlines.data

import androidx.lifecycle.LiveData
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.data.resultLiveData
import com.sagarock101.database.model.*
import com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource
import com.sagarock101.newsheadlines.data.remote.SectionRemoteSource
import kotlinx.coroutines.async
import kotlinx.coroutines.supervisorScope
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsHeadlinesRepo @Inject constructor(
    private val remoteSource: NewsHeadLinesRemoteSource,
    private val sectionRemoteSource: SectionRemoteSource
) {

    fun getNewsHeadlines(country: String): LiveData<DataWrapper<NewsHeadLines>> {
        return resultLiveData {
            remoteSource.getNewsHeadLines(country)
        }
    }

    fun getNewsHeadlines(country: String, category: String): LiveData<DataWrapper<NewsHeadLines>> {
        return resultLiveData {
            supervisorScope {
                var newsHeadlinesReponse: DataWrapper<NewsHeadLines>? = null
                var sectionResponse: DataWrapper<SectionResponse>? = null

                val newsApiHeadlines = async { remoteSource.getNewsHeadLines(country, category) }
                val guardianNewsSections = async { sectionRemoteSource.getSectionByType(category) }

                newsHeadlinesReponse = try {
                    newsApiHeadlines.await()
                } catch (e: Exception) {
                    null
                }

                sectionResponse = try {
                    guardianNewsSections.await()
                } catch (e: Exception) {
                    null
                }

                mergeBothDataToHeadlines(
                  newsHeadlinesReponse, sectionResponse
                )
            }
        }
    }

    private fun mergeBothDataToHeadlines(newsHeadlinesReponse: DataWrapper<NewsHeadLines>?, sectionResponse: DataWrapper<SectionResponse>?): DataWrapper<NewsHeadLines> {
         newsHeadlinesReponse?.data?.articles?.addAll(convertSectionResultsToListOfArticles(sectionResponse?.data?.response?.results))
        return newsHeadlinesReponse!!
    }
//TODO: add author using guardian api show-tags parameters key and value contributor
    private fun convertSectionResultsToListOfArticles(sectionResults: List<Results>?): Collection<Articles> {
        val mergedList = ArrayList<Articles>()
        sectionResults?.forEachIndexed { index, sectionResult ->
            mergedList.add(Articles(Source(
                sectionResult.id,
                sectionResult.sectionName
            ), "", sectionResult.webTitle, sectionResult.fields?.bodyText, sectionResult.webUrl, sectionResult.fields?.thumbnail, sectionResult.webPublicationDate) )
        }
        return mergedList
    }
}