// Generated by Dagger (https://dagger.dev).
package com.sagarock101.database.di;

import android.app.Application;
import com.sagarock101.database.NewsDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideNewsDatabaseFactory implements Factory<NewsDatabase> {
  private final DatabaseModule module;

  private final Provider<Application> applicationProvider;

  public DatabaseModule_ProvideNewsDatabaseFactory(DatabaseModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public NewsDatabase get() {
    return provideNewsDatabase(module, applicationProvider.get());
  }

  public static DatabaseModule_ProvideNewsDatabaseFactory create(DatabaseModule module,
      Provider<Application> applicationProvider) {
    return new DatabaseModule_ProvideNewsDatabaseFactory(module, applicationProvider);
  }

  public static NewsDatabase provideNewsDatabase(DatabaseModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideNewsDatabase(application));
  }
}
