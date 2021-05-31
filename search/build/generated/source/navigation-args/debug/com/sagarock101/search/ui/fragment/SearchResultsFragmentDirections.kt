package com.sagarock101.search.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.sagarock101.search.R
import com.sagarock101.search.model.Results
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class SearchResultsFragmentDirections private constructor() {
  private data class ActionSearchResultsFragmentToSearchDetailFragment(
    public val searchedResult: Results
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_searchResultsFragment_to_searchDetailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionSearchResultsFragmentToSearchDetailFragment(searchedResult: Results):
        NavDirections = ActionSearchResultsFragmentToSearchDetailFragment(searchedResult)
  }
}
