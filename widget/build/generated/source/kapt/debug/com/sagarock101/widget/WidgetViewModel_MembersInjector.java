// Generated by Dagger (https://dagger.dev).
package com.sagarock101.widget;

import com.sagarock101.database.NewsDatabaseRepo;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WidgetViewModel_MembersInjector implements MembersInjector<WidgetViewModel> {
  private final Provider<NewsDatabaseRepo> newsDatabaseRepoProvider;

  public WidgetViewModel_MembersInjector(Provider<NewsDatabaseRepo> newsDatabaseRepoProvider) {
    this.newsDatabaseRepoProvider = newsDatabaseRepoProvider;
  }

  public static MembersInjector<WidgetViewModel> create(
      Provider<NewsDatabaseRepo> newsDatabaseRepoProvider) {
    return new WidgetViewModel_MembersInjector(newsDatabaseRepoProvider);
  }

  @Override
  public void injectMembers(WidgetViewModel instance) {
    injectNewsDatabaseRepo(instance, newsDatabaseRepoProvider.get());
  }

  @InjectedFieldSignature("com.sagarock101.widget.WidgetViewModel.newsDatabaseRepo")
  public static void injectNewsDatabaseRepo(WidgetViewModel instance,
      NewsDatabaseRepo newsDatabaseRepo) {
    instance.newsDatabaseRepo = newsDatabaseRepo;
  }
}