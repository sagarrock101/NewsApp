// Generated by Dagger (https://dagger.dev).
package com.sagarock101.widget.di;

import android.app.Application;
import android.content.ComponentName;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WidgetServiceModule_ProvideStackWidgetServiceFactory implements Factory<ComponentName> {
  private final WidgetServiceModule module;

  private final Provider<Application> applicationProvider;

  public WidgetServiceModule_ProvideStackWidgetServiceFactory(WidgetServiceModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public ComponentName get() {
    return provideStackWidgetService(module, applicationProvider.get());
  }

  public static WidgetServiceModule_ProvideStackWidgetServiceFactory create(
      WidgetServiceModule module, Provider<Application> applicationProvider) {
    return new WidgetServiceModule_ProvideStackWidgetServiceFactory(module, applicationProvider);
  }

  public static ComponentName provideStackWidgetService(WidgetServiceModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideStackWidgetService(application));
  }
}
