package com.sagarock101.newsheadlines.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.sagarock101.database.model.Articles
import com.sagarock101.newsheadlines.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class NewsHeadlinesFragmentDirections private constructor() {
  private data class ActionNewsHeadlinesFragmentToNewsDetailFragment(
    public val article: Articles?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_newsHeadlinesFragment_to_newsDetailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionNewsHeadlinesFragmentToNewsDetailFragment(article: Articles?): NavDirections =
        ActionNewsHeadlinesFragmentToNewsDetailFragment(article)
  }
}
