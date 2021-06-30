package com.sagarock101.search.model

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.annotation.NonNull
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class Articles(

    @SerializedName("source")
    val source: Source? = null,

    @SerializedName("author")
    val author: String? = null,

    @NonNull
    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("urlToImage")
    var urlToImage: String? = null,

    @SerializedName("publishedAt")
    val publishedAt: String? = null,

    @SerializedName("content")
    val content: String? = null
) : Parcelable