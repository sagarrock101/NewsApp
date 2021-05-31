package com.sagarock101.search.model

import com.google.gson.annotations.SerializedName

data class SearchResults(
    @SerializedName("status") val status : String,
    @SerializedName("totalResults") val totalResults : Int,
    @SerializedName("articles") val articles : List<Articles>
) {
}