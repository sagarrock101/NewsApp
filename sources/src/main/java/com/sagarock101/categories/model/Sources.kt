package com.sagarock101.categories.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Sources (
	@SerializedName("status") val status : String,
	@SerializedName("sources") val sources : List<Source>
)