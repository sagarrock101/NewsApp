package com.sagarock101.newsheadlines.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.sagarock101.database.model.Articles
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class NewsDetailFragmentArgs(
  public val article: Articles?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Articles::class.java)) {
      result.putParcelable("article", this.article as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Articles::class.java)) {
      result.putSerializable("article", this.article as Serializable?)
    } else {
      throw UnsupportedOperationException(Articles::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): NewsDetailFragmentArgs {
      bundle.setClassLoader(NewsDetailFragmentArgs::class.java.classLoader)
      val __article : Articles?
      if (bundle.containsKey("article")) {
        if (Parcelable::class.java.isAssignableFrom(Articles::class.java) ||
            Serializable::class.java.isAssignableFrom(Articles::class.java)) {
          __article = bundle.get("article") as Articles?
        } else {
          throw UnsupportedOperationException(Articles::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"article\" is missing and does not have an android:defaultValue")
      }
      return NewsDetailFragmentArgs(__article)
    }
  }
}
