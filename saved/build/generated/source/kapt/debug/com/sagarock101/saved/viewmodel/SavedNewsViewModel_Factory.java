// Generated by Dagger (https://dagger.dev).
package com.sagarock101.saved.viewmodel;

import android.app.Application;
import com.sagarock101.database.NewsDatabaseRepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SavedNewsViewModel_Factory implements Factory<SavedNewsViewModel> {
  private final Provider<NewsDatabaseRepo> newsDatabaseRepoProvider;

  private final Provider<Application> applicationProvider;

  public SavedNewsViewModel_Factory(Provider<NewsDatabaseRepo> newsDatabaseRepoProvider,
      Provider<Application> applicationProvider) {
    this.newsDatabaseRepoProvider = newsDatabaseRepoProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SavedNewsViewModel get() {
    SavedNewsViewModel instance = newInstance();
    SavedNewsViewModel_MembersInjector.injectNewsDatabaseRepo(instance, newsDatabaseRepoProvider.get());
    SavedNewsViewModel_MembersInjector.injectApplication(instance, applicationProvider.get());
    return instance;
  }

  public static SavedNewsViewModel_Factory create(
      Provider<NewsDatabaseRepo> newsDatabaseRepoProvider,
      Provider<Application> applicationProvider) {
    return new SavedNewsViewModel_Factory(newsDatabaseRepoProvider, applicationProvider);
  }

  public static SavedNewsViewModel newInstance() {
    return new SavedNewsViewModel();
  }
}
