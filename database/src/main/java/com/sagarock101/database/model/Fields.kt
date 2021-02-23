package com.sagarock101.database.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Fields (

	@SerializedName("body") val body : String,
	@SerializedName("thumbnail") val thumbnail : String,
	@SerializedName("bodyText") val bodyText: String = ""

) : Parcelable