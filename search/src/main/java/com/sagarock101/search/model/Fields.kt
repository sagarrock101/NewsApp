package com.sagarock101.search.model

import com.google.gson.annotations.SerializedName

data class Fields (

	@SerializedName("body") val body : String,
	@SerializedName("thumbnail") val thumbnail : String

)