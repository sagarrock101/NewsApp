package com.sagarock101.search.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.sql.Timestamp

@Parcelize
data class Results (

	@SerializedName("id") val id : String,
	@SerializedName("type") val type : String,
	@SerializedName("sectionId") val sectionId : String,
	@SerializedName("sectionName") val sectionName : String,
	@SerializedName("webPublicationDate") val webPublicationDate : Timestamp,
	@SerializedName("webTitle") val webTitle : String,
	@SerializedName("webUrl") val webUrl : String,
	@SerializedName("apiUrl") val apiUrl : String,
	@SerializedName("fields") val fields : Fields,
	@SerializedName("isHosted") val isHosted : Boolean,
	@SerializedName("pillarId") val pillarId : String,
	@SerializedName("pillarName") val pillarName : String
) : Parcelable