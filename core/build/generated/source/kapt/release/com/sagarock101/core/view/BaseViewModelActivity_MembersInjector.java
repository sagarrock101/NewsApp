// Generated by Dagger (https://dagger.dev).
package com.sagarock101.core.view;

import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.sagarock101.core.viewmodel.BaseViewModel;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseViewModelActivity_MembersInjector<B extends ViewDataBinding, VM extends BaseViewModel> implements MembersInjector<BaseViewModelActivity<B, VM>> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  public BaseViewModelActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
  }

  public static <B extends ViewDataBinding, VM extends BaseViewModel> MembersInjector<BaseViewModelActivity<B, VM>> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider) {
    return new BaseViewModelActivity_MembersInjector<B, VM>(androidInjectorProvider, supportFragmentInjectorProvider);
  }

  @Override
  public void injectMembers(BaseViewModelActivity<B, VM> instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectSupportFragmentInjector(instance, supportFragmentInjectorProvider.get());
  }

  @InjectedFieldSignature("com.sagarock101.core.view.BaseViewModelActivity.supportFragmentInjector")
  public static <B extends ViewDataBinding, VM extends BaseViewModel> void injectSupportFragmentInjector(
      BaseViewModelActivity<B, VM> instance,
      DispatchingAndroidInjector<Fragment> supportFragmentInjector) {
    instance.supportFragmentInjector = supportFragmentInjector;
  }
}
