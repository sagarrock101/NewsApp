package com.sagarock101.stylekit;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sagarock101.stylekit.databinding.CustomAppBarBindingImpl;
import com.sagarock101.stylekit.databinding.FragmentAboutDialogBindingImpl;
import com.sagarock101.stylekit.databinding.FragmentDialogThemeBindingImpl;
import com.sagarock101.stylekit.databinding.LayoutNoNetworkBindingImpl;
import com.sagarock101.stylekit.databinding.LayoutNoSavedItemBindingImpl;
import com.sagarock101.stylekit.databinding.WidgetNewsLayoutBindingImpl;
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
  private static final int LAYOUT_CUSTOMAPPBAR = 1;

  private static final int LAYOUT_FRAGMENTABOUTDIALOG = 2;

  private static final int LAYOUT_FRAGMENTDIALOGTHEME = 3;

  private static final int LAYOUT_LAYOUTNONETWORK = 4;

  private static final int LAYOUT_LAYOUTNOSAVEDITEM = 5;

  private static final int LAYOUT_WIDGETNEWSLAYOUT = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.stylekit.R.layout.custom_app_bar, LAYOUT_CUSTOMAPPBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.stylekit.R.layout.fragment_about_dialog, LAYOUT_FRAGMENTABOUTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.stylekit.R.layout.fragment_dialog_theme, LAYOUT_FRAGMENTDIALOGTHEME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.stylekit.R.layout.layout_no_network, LAYOUT_LAYOUTNONETWORK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.stylekit.R.layout.layout_no_saved_item, LAYOUT_LAYOUTNOSAVEDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.stylekit.R.layout.widget_news_layout, LAYOUT_WIDGETNEWSLAYOUT);
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
        case  LAYOUT_CUSTOMAPPBAR: {
          if ("layout/custom_app_bar_0".equals(tag)) {
            return new CustomAppBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for custom_app_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTABOUTDIALOG: {
          if ("layout/fragment_about_dialog_0".equals(tag)) {
            return new FragmentAboutDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDIALOGTHEME: {
          if ("layout/fragment_dialog_theme_0".equals(tag)) {
            return new FragmentDialogThemeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dialog_theme is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTNONETWORK: {
          if ("layout/layout_no_network_0".equals(tag)) {
            return new LayoutNoNetworkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_no_network is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTNOSAVEDITEM: {
          if ("layout/layout_no_saved_item_0".equals(tag)) {
            return new LayoutNoSavedItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_no_saved_item is invalid. Received: " + tag);
        }
        case  LAYOUT_WIDGETNEWSLAYOUT: {
          if ("layout/widget_news_layout_0".equals(tag)) {
            return new WidgetNewsLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for widget_news_layout is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.sagarock101.common.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "listSize");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/custom_app_bar_0", com.sagarock101.stylekit.R.layout.custom_app_bar);
      sKeys.put("layout/fragment_about_dialog_0", com.sagarock101.stylekit.R.layout.fragment_about_dialog);
      sKeys.put("layout/fragment_dialog_theme_0", com.sagarock101.stylekit.R.layout.fragment_dialog_theme);
      sKeys.put("layout/layout_no_network_0", com.sagarock101.stylekit.R.layout.layout_no_network);
      sKeys.put("layout/layout_no_saved_item_0", com.sagarock101.stylekit.R.layout.layout_no_saved_item);
      sKeys.put("layout/widget_news_layout_0", com.sagarock101.stylekit.R.layout.widget_news_layout);
    }
  }
}
