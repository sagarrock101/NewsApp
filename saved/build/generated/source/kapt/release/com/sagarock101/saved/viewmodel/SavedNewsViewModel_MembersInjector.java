// Generated by Dagger (https://dagger.dev).
package com.sagarock101.saved.viewmodel;

import android.app.Application;
import com.sagarock101.database.NewsDatabaseRepo;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SavedNewsViewModel_MembersInjector implements MembersInjector<SavedNewsViewModel> {
  private final Provider<NewsDatabaseRepo> newsDatabaseRepoProvider;

  private final Provider<Application> applicationProvider;

  public SavedNewsViewModel_MembersInjector(Provider<NewsDatabaseRepo> newsDatabaseRepoProvider,
      Provider<Application> applicationProvider) {
    this.newsDatabaseRepoProvider = newsDatabaseRepoProvider;
    this.applicationProvider = applicationProvider;
  }

  public static MembersInjector<SavedNewsViewModel> create(
      Provider<NewsDatabaseRepo> newsDatabaseRepoProvider,
      Provider<Application> applicationProvider) {
    return new SavedNewsViewModel_MembersInjector(newsDatabaseRepoProvider, applicationProvider);
  }

  @Override
  public void injectMembers(SavedNewsViewModel instance) {
    injectNewsDatabaseRepo(instance, newsDatabaseRepoProvider.get());
    injectApplication(instance, applicationProvider.get());
  }

  @InjectedFieldSignature("com.sagarock101.saved.viewmodel.SavedNewsViewModel.newsDatabaseRepo")
  public static void injectNewsDatabaseRepo(SavedNewsViewModel instance,
      NewsDatabaseRepo newsDatabaseRepo) {
    instance.newsDatabaseRepo = newsDatabaseRepo;
  }

  @InjectedFieldSignature("com.sagarock101.saved.viewmodel.SavedNewsViewModel.application")
  public static void injectApplication(SavedNewsViewModel instance, Application application) {
    instance.application = application;
  }
}