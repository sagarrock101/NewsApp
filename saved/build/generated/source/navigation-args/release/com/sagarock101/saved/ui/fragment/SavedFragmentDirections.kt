package com.sagarock101.saved.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.sagarock101.database.model.Articles
import com.sagarock101.saved.R
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

public class SavedFragmentDirections private constructor() {
  private data class ActionSavedFragmentToSavedNewsDetailFragment(
    public val articles: Articles? = null
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_savedFragment_to_savedNewsDetailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Articles::class.java)) {
        result.putParcelable("articles", this.articles as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(Articles::class.java)) {
        result.putSerializable("articles", this.articles as Serializable?)
      }
      return result
    }
  }

  public companion object {
    public fun actionSavedFragmentToSavedNewsDetailFragment(articles: Articles? = null):
        NavDirections = ActionSavedFragmentToSavedNewsDetailFragment(articles)
  }
}
