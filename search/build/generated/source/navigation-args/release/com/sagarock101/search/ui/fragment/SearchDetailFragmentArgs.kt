package com.sagarock101.search.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.sagarock101.search.model.Results
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class SearchDetailFragmentArgs(
  public val searchedResult: Results
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Results::class.java)) {
      result.putParcelable("searchedResult", this.searchedResult as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Results::class.java)) {
      result.putSerializable("searchedResult", this.searchedResult as Serializable)
    } else {
      throw UnsupportedOperationException(Results::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SearchDetailFragmentArgs {
      bundle.setClassLoader(SearchDetailFragmentArgs::class.java.classLoader)
      val __searchedResult : Results?
      if (bundle.containsKey("searchedResult")) {
        if (Parcelable::class.java.isAssignableFrom(Results::class.java) ||
            Serializable::class.java.isAssignableFrom(Results::class.java)) {
          __searchedResult = bundle.get("searchedResult") as Results?
        } else {
          throw UnsupportedOperationException(Results::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__searchedResult == null) {
          throw IllegalArgumentException("Argument \"searchedResult\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"searchedResult\" is missing and does not have an android:defaultValue")
      }
      return SearchDetailFragmentArgs(__searchedResult)
    }
  }
}
