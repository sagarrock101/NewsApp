package com.sagarock101.database.model

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.sql.Timestamp

/*
Copyright (c) 2020 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */

@Entity
@Parcelize
data class Articles(

    @ColumnInfo
    @SerializedName("source")
    val source: Source? = null,

    @ColumnInfo
    @SerializedName("author")
    val author: String? = null,

    @ColumnInfo
    @PrimaryKey
    @NonNull
    @SerializedName("title")
    val title: String,

    @ColumnInfo
    @SerializedName("description")
    val description: String? = null,

    @ColumnInfo
    @SerializedName("url")
    val url: String? = null,

    @ColumnInfo
    @SerializedName("urlToImage")
    var urlToImage: String? = null,

    @ColumnInfo
    @SerializedName("publishedAt")
    var publishedAt: Timestamp? = null,

    @ColumnInfo
    @SerializedName("content")
    val content: String? = null
) : Parcelable