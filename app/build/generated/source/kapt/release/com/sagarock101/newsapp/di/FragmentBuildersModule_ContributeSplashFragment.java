package com.sagarock101.newsapp.di;

import com.sagarock101.newsapp.ui.fragments.SplashFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeSplashFragment.SplashFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeSplashFragment {
  private FragmentBuildersModule_ContributeSplashFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SplashFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SplashFragmentSubcomponent extends AndroidInjector<SplashFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SplashFragment> {}
  }
}
