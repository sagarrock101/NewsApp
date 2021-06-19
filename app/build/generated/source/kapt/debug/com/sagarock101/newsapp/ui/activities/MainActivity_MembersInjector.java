// Generated by Dagger (https://dagger.dev).
package com.sagarock101.newsapp.ui.activities;

import com.sagarock101.core.utils.PreferenceHelper;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<PreferenceHelper> preferenceHelperProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<PreferenceHelper> preferenceHelperProvider) {
    return new MainActivity_MembersInjector(androidInjectorProvider, preferenceHelperProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectPreferenceHelper(instance, preferenceHelperProvider.get());
  }

  @InjectedFieldSignature("com.sagarock101.newsapp.ui.activities.MainActivity.preferenceHelper")
  public static void injectPreferenceHelper(MainActivity instance,
      PreferenceHelper preferenceHelper) {
    instance.preferenceHelper = preferenceHelper;
  }
}