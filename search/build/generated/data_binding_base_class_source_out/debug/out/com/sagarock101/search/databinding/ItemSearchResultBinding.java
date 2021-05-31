// Generated by data binding compiler. Do not edit!
package com.sagarock101.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sagarock101.search.R;
import com.sagarock101.search.model.Results;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSearchResultBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clNewsSaved;

  @NonNull
  public final CardView cvImgContainer;

  @NonNull
  public final ImageView ivNewsImg;

  @NonNull
  public final ImageView ivRipple;

  @NonNull
  public final TextView tvSource;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected Results mSearchResult;

  protected ItemSearchResultBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clNewsSaved, CardView cvImgContainer, ImageView ivNewsImg,
      ImageView ivRipple, TextView tvSource, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clNewsSaved = clNewsSaved;
    this.cvImgContainer = cvImgContainer;
    this.ivNewsImg = ivNewsImg;
    this.ivRipple = ivRipple;
    this.tvSource = tvSource;
    this.tvTitle = tvTitle;
  }

  public abstract void setSearchResult(@Nullable Results searchResult);

  @Nullable
  public Results getSearchResult() {
    return mSearchResult;
  }

  @NonNull
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_search_result, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSearchResultBinding>inflateInternal(inflater, R.layout.item_search_result, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_search_result, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSearchResultBinding>inflateInternal(inflater, R.layout.item_search_result, null, false, component);
  }

  public static ItemSearchResultBinding bind(@NonNull View view) {
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
  public static ItemSearchResultBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSearchResultBinding)bind(component, view, R.layout.item_search_result);
  }
}
