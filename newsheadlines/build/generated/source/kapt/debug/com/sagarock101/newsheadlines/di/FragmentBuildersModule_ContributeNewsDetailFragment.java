package com.sagarock101.newsheadlines.di;

import com.sagarock101.newsheadlines.ui.fragments.NewsDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeNewsDetailFragment.NewsDetailFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeNewsDetailFragment {
  private FragmentBuildersModule_ContributeNewsDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NewsDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NewsDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface NewsDetailFragmentSubcomponent extends AndroidInjector<NewsDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NewsDetailFragment> {}
  }
}
