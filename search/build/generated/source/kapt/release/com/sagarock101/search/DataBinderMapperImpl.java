package com.sagarock101.search;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sagarock101.search.databinding.ActivitySearchBindingImpl;
import com.sagarock101.search.databinding.FragmentDialogSearchBindingImpl;
import com.sagarock101.search.databinding.FragmentSearchBindingImpl;
import com.sagarock101.search.databinding.FragmentSearchItemDetailBindingImpl;
import com.sagarock101.search.databinding.ItemSearchResultBindingImpl;
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
  private static final int LAYOUT_ACTIVITYSEARCH = 1;

  private static final int LAYOUT_FRAGMENTDIALOGSEARCH = 2;

  private static final int LAYOUT_FRAGMENTSEARCH = 3;

  private static final int LAYOUT_FRAGMENTSEARCHITEMDETAIL = 4;

  private static final int LAYOUT_ITEMSEARCHRESULT = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.search.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.search.R.layout.fragment_dialog_search, LAYOUT_FRAGMENTDIALOGSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.search.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.search.R.layout.fragment_search_item_detail, LAYOUT_FRAGMENTSEARCHITEMDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.search.R.layout.item_search_result, LAYOUT_ITEMSEARCHRESULT);
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
        case  LAYOUT_ACTIVITYSEARCH: {
          if ("layout/activity_search_0".equals(tag)) {
            return new ActivitySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDIALOGSEARCH: {
          if ("layout/fragment_dialog_search_0".equals(tag)) {
            return new FragmentDialogSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dialog_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCHITEMDETAIL: {
          if ("layout/fragment_search_item_detail_0".equals(tag)) {
            return new FragmentSearchItemDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search_item_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCHRESULT: {
          if ("layout/item_search_result_0".equals(tag)) {
            return new ItemSearchResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search_result is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(5);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.sagarock101.common.DataBinderMapperImpl());
    result.add(new com.sagarock101.core.DataBinderMapperImpl());
    result.add(new com.sagarock101.stylekit.DataBinderMapperImpl());
    result.add(new com.sagarock101.widget.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "article");
      sKeys.put(2, "imgUrl");
      sKeys.put(3, "listSize");
      sKeys.put(4, "result");
      sKeys.put(5, "searchResult");
      sKeys.put(6, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_search_0", com.sagarock101.search.R.layout.activity_search);
      sKeys.put("layout/fragment_dialog_search_0", com.sagarock101.search.R.layout.fragment_dialog_search);
      sKeys.put("layout/fragment_search_0", com.sagarock101.search.R.layout.fragment_search);
      sKeys.put("layout/fragment_search_item_detail_0", com.sagarock101.search.R.layout.fragment_search_item_detail);
      sKeys.put("layout/item_search_result_0", com.sagarock101.search.R.layout.item_search_result);
    }
  }
}
