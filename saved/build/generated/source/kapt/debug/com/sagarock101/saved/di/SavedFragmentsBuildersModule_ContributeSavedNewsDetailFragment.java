package com.sagarock101.saved.di;

import com.sagarock101.saved.ui.fragment.SavedNewsDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SavedFragmentsBuildersModule_ContributeSavedNewsDetailFragment
          .SavedNewsDetailFragmentSubcomponent.class
)
public abstract class SavedFragmentsBuildersModule_ContributeSavedNewsDetailFragment {
  private SavedFragmentsBuildersModule_ContributeSavedNewsDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SavedNewsDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SavedNewsDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SavedNewsDetailFragmentSubcomponent
      extends AndroidInjector<SavedNewsDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SavedNewsDetailFragment> {}
  }
}
