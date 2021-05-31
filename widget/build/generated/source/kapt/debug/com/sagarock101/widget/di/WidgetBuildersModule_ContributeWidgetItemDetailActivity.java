package com.sagarock101.widget.di;

import com.sagarock101.widget.WidgetItemDetailActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      WidgetBuildersModule_ContributeWidgetItemDetailActivity.WidgetItemDetailActivitySubcomponent
          .class
)
public abstract class WidgetBuildersModule_ContributeWidgetItemDetailActivity {
  private WidgetBuildersModule_ContributeWidgetItemDetailActivity() {}

  @Binds
  @IntoMap
  @ClassKey(WidgetItemDetailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WidgetItemDetailActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface WidgetItemDetailActivitySubcomponent
      extends AndroidInjector<WidgetItemDetailActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WidgetItemDetailActivity> {}
  }
}
