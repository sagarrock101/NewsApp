package com.sagarock101.saved;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sagarock101.saved.databinding.FragmentSavedBindingImpl;
import com.sagarock101.saved.databinding.FragmentSavedNewsDetailBindingImpl;
import com.sagarock101.saved.databinding.ItemSavedBindingImpl;
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
  private static final int LAYOUT_FRAGMENTSAVED = 1;

  private static final int LAYOUT_FRAGMENTSAVEDNEWSDETAIL = 2;

  private static final int LAYOUT_ITEMSAVED = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.saved.R.layout.fragment_saved, LAYOUT_FRAGMENTSAVED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.saved.R.layout.fragment_saved_news_detail, LAYOUT_FRAGMENTSAVEDNEWSDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.saved.R.layout.item_saved, LAYOUT_ITEMSAVED);
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
        case  LAYOUT_FRAGMENTSAVED: {
          if ("layout/fragment_saved_0".equals(tag)) {
            return new FragmentSavedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_saved is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSAVEDNEWSDETAIL: {
          if ("layout/fragment_saved_news_detail_0".equals(tag)) {
            return new FragmentSavedNewsDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_saved_news_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSAVED: {
          if ("layout/item_saved_0".equals(tag)) {
            return new ItemSavedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_saved is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "article");
      sKeys.put(2, "imgUrl");
      sKeys.put(3, "listSize");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_saved_0", com.sagarock101.saved.R.layout.fragment_saved);
      sKeys.put("layout/fragment_saved_news_detail_0", com.sagarock101.saved.R.layout.fragment_saved_news_detail);
      sKeys.put("layout/item_saved_0", com.sagarock101.saved.R.layout.item_saved);
    }
  }
}
