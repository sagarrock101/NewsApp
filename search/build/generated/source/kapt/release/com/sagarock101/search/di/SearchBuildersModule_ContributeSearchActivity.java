package com.sagarock101.search.di;

import com.sagarock101.search.ui.activity.SearchActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = SearchBuildersModule_ContributeSearchActivity.SearchActivitySubcomponent.class
)
public abstract class SearchBuildersModule_ContributeSearchActivity {
  private SearchBuildersModule_ContributeSearchActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SearchActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchActivitySubcomponent.Factory builder);

  @Subcomponent(modules = SearchFragmentBuildersModule.class)
  public interface SearchActivitySubcomponent extends AndroidInjector<SearchActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SearchActivity> {}
  }
}
