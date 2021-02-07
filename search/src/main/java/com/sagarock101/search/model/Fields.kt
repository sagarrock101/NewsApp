package com.sagarock101.search.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Fields (

	@SerializedName("body") val body : String,
	@SerializedName("thumbnail") val thumbnail : String

) : Parcelable