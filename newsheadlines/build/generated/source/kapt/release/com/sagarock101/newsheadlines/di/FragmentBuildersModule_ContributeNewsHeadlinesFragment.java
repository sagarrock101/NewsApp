package com.sagarock101.newsheadlines.di;

import com.sagarock101.newsheadlines.ui.fragments.NewsHeadlinesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeNewsHeadlinesFragment.NewsHeadlinesFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeNewsHeadlinesFragment {
  private FragmentBuildersModule_ContributeNewsHeadlinesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NewsHeadlinesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NewsHeadlinesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface NewsHeadlinesFragmentSubcomponent
      extends AndroidInjector<NewsHeadlinesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NewsHeadlinesFragment> {}
  }
}
