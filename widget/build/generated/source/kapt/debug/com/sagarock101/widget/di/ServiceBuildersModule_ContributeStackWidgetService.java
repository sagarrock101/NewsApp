package com.sagarock101.widget.di;

import com.sagarock101.widget.service.StackWidgetService;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ServiceBuildersModule_ContributeStackWidgetService.StackWidgetServiceSubcomponent.class
)
public abstract class ServiceBuildersModule_ContributeStackWidgetService {
  private ServiceBuildersModule_ContributeStackWidgetService() {}

  @Binds
  @IntoMap
  @ClassKey(StackWidgetService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StackWidgetServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface StackWidgetServiceSubcomponent extends AndroidInjector<StackWidgetService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StackWidgetService> {}
  }
}
