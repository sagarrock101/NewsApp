package com.sagarock101.categories.di;

import com.sagarock101.categories.ui.fragments.SourcesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SourcesFragmentBuildersModule_ContributeSourceFragment.SourcesFragmentSubcomponent.class
)
public abstract class SourcesFragmentBuildersModule_ContributeSourceFragment {
  private SourcesFragmentBuildersModule_ContributeSourceFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SourcesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SourcesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SourcesFragmentSubcomponent extends AndroidInjector<SourcesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SourcesFragment> {}
  }
}
