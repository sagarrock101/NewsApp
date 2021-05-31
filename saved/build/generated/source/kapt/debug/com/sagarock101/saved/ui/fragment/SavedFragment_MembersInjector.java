// Generated by Dagger (https://dagger.dev).
package com.sagarock101.saved.ui.fragment;

import com.sagarock101.core.di.ViewModelFactory;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SavedFragment_MembersInjector implements MembersInjector<SavedFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public SavedFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SavedFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new SavedFragment_MembersInjector(androidInjectorProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SavedFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.sagarock101.saved.ui.fragment.SavedFragment.viewModelFactory")
  public static void injectViewModelFactory(SavedFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
