package com.sagarock101.search.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class SearchResponse (

	@SerializedName("response") val response : Response

)