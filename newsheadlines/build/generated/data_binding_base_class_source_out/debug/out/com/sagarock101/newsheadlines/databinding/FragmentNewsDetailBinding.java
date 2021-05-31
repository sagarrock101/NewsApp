// Generated by data binding compiler. Do not edit!
package com.sagarock101.newsheadlines.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sagarock101.database.model.Articles;
import com.sagarock101.newsheadlines.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNewsDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final Button btnReadFullStory;

  @NonNull
  public final CoordinatorLayout colParent;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final CardView cvContent;

  @NonNull
  public final FloatingActionButton fabAdd;

  @NonNull
  public final FloatingActionButton fabSave;

  @NonNull
  public final FloatingActionButton fabShare;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final ImageView ivGradient;

  @NonNull
  public final ImageView ivNewsImg;

  @NonNull
  public final LinearLayout llFab;

  @NonNull
  public final NestedScrollView nsvContainer;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final TextView tvContent;

  @NonNull
  public final TextView tvDesc;

  @NonNull
  public final TextView tvPublishedDate;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected String mImgUrl;

  @Bindable
  protected Articles mArticle;

  protected FragmentNewsDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBar, Button btnReadFullStory, CoordinatorLayout colParent,
      CollapsingToolbarLayout collapsingToolbar, CardView cvContent, FloatingActionButton fabAdd,
      FloatingActionButton fabSave, FloatingActionButton fabShare, ImageView ivBack,
      ImageView ivGradient, ImageView ivNewsImg, LinearLayout llFab, NestedScrollView nsvContainer,
      MaterialToolbar toolbar, TextView tvContent, TextView tvDesc, TextView tvPublishedDate,
      TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBar = appBar;
    this.btnReadFullStory = btnReadFullStory;
    this.colParent = colParent;
    this.collapsingToolbar = collapsingToolbar;
    this.cvContent = cvContent;
    this.fabAdd = fabAdd;
    this.fabSave = fabSave;
    this.fabShare = fabShare;
    this.ivBack = ivBack;
    this.ivGradient = ivGradient;
    this.ivNewsImg = ivNewsImg;
    this.llFab = llFab;
    this.nsvContainer = nsvContainer;
    this.toolbar = toolbar;
    this.tvContent = tvContent;
    this.tvDesc = tvDesc;
    this.tvPublishedDate = tvPublishedDate;
    this.tvTitle = tvTitle;
  }

  public abstract void setImgUrl(@Nullable String imgUrl);

  @Nullable
  public String getImgUrl() {
    return mImgUrl;
  }

  public abstract void setArticle(@Nullable Articles article);

  @Nullable
  public Articles getArticle() {
    return mArticle;
  }

  @NonNull
  public static FragmentNewsDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_news_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNewsDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNewsDetailBinding>inflateInternal(inflater, R.layout.fragment_news_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNewsDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_news_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNewsDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNewsDetailBinding>inflateInternal(inflater, R.layout.fragment_news_detail, null, false, component);
  }

  public static FragmentNewsDetailBinding bind(@NonNull View view) {
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
  public static FragmentNewsDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentNewsDetailBinding)bind(component, view, R.layout.fragment_news_detail);
  }
}
