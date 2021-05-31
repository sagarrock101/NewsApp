package com.sagarock101.search.di;

import com.sagarock101.search.ui.fragment.SearchDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SearchFragmentBuildersModule_ContributeSearchResultDetailFragment
          .SearchDetailFragmentSubcomponent.class
)
public abstract class SearchFragmentBuildersModule_ContributeSearchResultDetailFragment {
  private SearchFragmentBuildersModule_ContributeSearchResultDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SearchDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SearchDetailFragmentSubcomponent extends AndroidInjector<SearchDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SearchDetailFragment> {}
  }
}
