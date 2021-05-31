// Generated by data binding compiler. Do not edit!
package com.sagarock101.newsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sagarock101.newsapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBtmNavBinding extends ViewDataBinding {
  @NonNull
  public final BottomNavigationView btmNav;

  protected FragmentBtmNavBinding(Object _bindingComponent, View _root, int _localFieldCount,
      BottomNavigationView btmNav) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btmNav = btmNav;
  }

  @NonNull
  public static FragmentBtmNavBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_btm_nav, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBtmNavBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBtmNavBinding>inflateInternal(inflater, R.layout.fragment_btm_nav, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBtmNavBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_btm_nav, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBtmNavBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBtmNavBinding>inflateInternal(inflater, R.layout.fragment_btm_nav, null, false, component);
  }

  public static FragmentBtmNavBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentBtmNavBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBtmNavBinding)bind(component, view, R.layout.fragment_btm_nav);
  }
}
