package com.sagarock101.categories.model

import com.google.gson.annotations.SerializedName

data class Sources (
	@SerializedName("status") val status : String,
	@SerializedName("sources") val sources : List<Source>
)