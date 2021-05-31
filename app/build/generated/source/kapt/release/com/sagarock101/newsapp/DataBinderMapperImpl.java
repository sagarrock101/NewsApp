package com.sagarock101.newsapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sagarock101.newsapp.databinding.ActivityMainBindingImpl;
import com.sagarock101.newsapp.databinding.FragmentBtmNavBindingImpl;
import com.sagarock101.newsapp.databinding.FragmentSplashBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTBTMNAV = 2;

  private static final int LAYOUT_FRAGMENTSPLASH = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.newsapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.newsapp.R.layout.fragment_btm_nav, LAYOUT_FRAGMENTBTMNAV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.newsapp.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBTMNAV: {
          if ("layout/fragment_btm_nav_0".equals(tag)) {
            return new FragmentBtmNavBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_btm_nav is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(9);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.sagarock101.categories.DataBinderMapperImpl());
    result.add(new com.sagarock101.common.DataBinderMapperImpl());
    result.add(new com.sagarock101.core.DataBinderMapperImpl());
    result.add(new com.sagarock101.newsheadlines.DataBinderMapperImpl());
    result.add(new com.sagarock101.saved.DataBinderMapperImpl());
    result.add(new com.sagarock101.search.DataBinderMapperImpl());
    result.add(new com.sagarock101.stylekit.DataBinderMapperImpl());
    result.add(new com.sagarock101.widget.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "article");
      sKeys.put(2, "imgUrl");
      sKeys.put(3, "listSize");
      sKeys.put(4, "newsHeadLines");
      sKeys.put(5, "result");
      sKeys.put(6, "searchResult");
      sKeys.put(7, "source");
      sKeys.put(8, "viewModel");
      sKeys.put(9, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_main_0", com.sagarock101.newsapp.R.layout.activity_main);
      sKeys.put("layout/fragment_btm_nav_0", com.sagarock101.newsapp.R.layout.fragment_btm_nav);
      sKeys.put("layout/fragment_splash_0", com.sagarock101.newsapp.R.layout.fragment_splash);
    }
  }
}
