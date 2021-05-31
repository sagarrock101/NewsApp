package com.sagarock101.search.di;

import com.sagarock101.search.ui.fragment.SearchResultsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SearchFragmentBuildersModule_ContributeSearchResultsFragment.SearchResultsFragmentSubcomponent
          .class
)
public abstract class SearchFragmentBuildersModule_ContributeSearchResultsFragment {
  private SearchFragmentBuildersModule_ContributeSearchResultsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SearchResultsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchResultsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SearchResultsFragmentSubcomponent
      extends AndroidInjector<SearchResultsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SearchResultsFragment> {}
  }
}
