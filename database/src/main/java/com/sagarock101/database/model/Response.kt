package com.sagarock101.database.model

import com.google.gson.annotations.SerializedName

data class Response (

	@SerializedName("status") val status : String,
	@SerializedName("userTier") val userTier : String,
	@SerializedName("total") val total : Int,
	@SerializedName("startIndex") val startIndex : Int,
	@SerializedName("pageSize") val pageSize : Int,
	@SerializedName("currentPage") val currentPage : Int,
	@SerializedName("pages") val pages : Int,
	@SerializedName("orderBy") val orderBy : String,
	@SerializedName("results") val results : List<Results>
)