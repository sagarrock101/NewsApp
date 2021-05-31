package com.sagarock101.newsapp.di;

import com.sagarock101.categories.di.SourcesFragmentBuildersModule;
import com.sagarock101.newsapp.ui.activities.MainActivity;
import com.sagarock101.saved.di.SavedFragmentsBuildersModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeMainActivity {
  private ActivityBuildersModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(
    modules = {
      FragmentBuildersModule.class,
      com.sagarock101.newsheadlines.di.FragmentBuildersModule.class,
      SavedFragmentsBuildersModule.class,
      SourcesFragmentBuildersModule.class
    }
  )
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
