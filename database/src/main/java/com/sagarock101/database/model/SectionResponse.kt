package com.sagarock101.database.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class SectionResponse (

	@SerializedName("response") val response : Response

)