package com.sagarock101.saved.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.sagarock101.database.model.Articles
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class SavedNewsDetailFragmentArgs(
  public val articles: Articles? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Articles::class.java)) {
      result.putParcelable("articles", this.articles as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Articles::class.java)) {
      result.putSerializable("articles", this.articles as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SavedNewsDetailFragmentArgs {
      bundle.setClassLoader(SavedNewsDetailFragmentArgs::class.java.classLoader)
      val __articles : Articles?
      if (bundle.containsKey("articles")) {
        if (Parcelable::class.java.isAssignableFrom(Articles::class.java) ||
            Serializable::class.java.isAssignableFrom(Articles::class.java)) {
          __articles = bundle.get("articles") as Articles?
        } else {
          throw UnsupportedOperationException(Articles::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __articles = null
      }
      return SavedNewsDetailFragmentArgs(__articles)
    }
  }
}
