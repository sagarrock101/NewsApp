package com.sagarock101.saved.di;

import com.sagarock101.saved.ui.fragment.SavedFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SavedFragmentsBuildersModule_ContributeSavedFragment.SavedFragmentSubcomponent.class
)
public abstract class SavedFragmentsBuildersModule_ContributeSavedFragment {
  private SavedFragmentsBuildersModule_ContributeSavedFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SavedFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SavedFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SavedFragmentSubcomponent extends AndroidInjector<SavedFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SavedFragment> {}
  }
}
