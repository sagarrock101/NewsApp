package com.sagarock101.database.model

import androidx.annotation.Keep

@Keep
data class ArticleRequest(
    var country: String,
    var category: String
) {
}