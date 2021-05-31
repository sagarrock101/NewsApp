package com.sagarock101.newsheadlines;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailBindingImpl;
import com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBindingImpl;
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBindingH480dpImpl;
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBindingH500dpImpl;
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBindingH720dpImpl;
import com.sagarock101.newsheadlines.databinding.ItemNewsCardBindingImpl;
import com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBindingH480dpImpl;
import com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBindingH500dpImpl;
import com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBindingH720dpImpl;
import com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBindingImpl;
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
  private static final int LAYOUT_FRAGMENTNEWSDETAIL = 1;

  private static final int LAYOUT_FRAGMENTNEWSHEADLINES = 2;

  private static final int LAYOUT_ITEMNEWSCARD = 3;

  private static final int LAYOUT_SHIMMERLAYOUTNEWSCARD = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.newsheadlines.R.layout.fragment_news_detail, LAYOUT_FRAGMENTNEWSDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.newsheadlines.R.layout.fragment_news_headlines, LAYOUT_FRAGMENTNEWSHEADLINES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.newsheadlines.R.layout.item_news_card, LAYOUT_ITEMNEWSCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card, LAYOUT_SHIMMERLAYOUTNEWSCARD);
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
        case  LAYOUT_FRAGMENTNEWSDETAIL: {
          if ("layout/fragment_news_detail_0".equals(tag)) {
            return new FragmentNewsDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_news_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWSHEADLINES: {
          if ("layout/fragment_news_headlines_0".equals(tag)) {
            return new FragmentNewsHeadlinesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_news_headlines is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEWSCARD: {
          if ("layout-h720dp/item_news_card_0".equals(tag)) {
            return new ItemNewsCardBindingH720dpImpl(component, view);
          }
          if ("layout-h480dp/item_news_card_0".equals(tag)) {
            return new ItemNewsCardBindingH480dpImpl(component, view);
          }
          if ("layout/item_news_card_0".equals(tag)) {
            return new ItemNewsCardBindingImpl(component, view);
          }
          if ("layout-h500dp/item_news_card_0".equals(tag)) {
            return new ItemNewsCardBindingH500dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_news_card is invalid. Received: " + tag);
        }
        case  LAYOUT_SHIMMERLAYOUTNEWSCARD: {
          if ("layout-h720dp/shimmer_layout_news_card_0".equals(tag)) {
            return new ShimmerLayoutNewsCardBindingH720dpImpl(component, view);
          }
          if ("layout-h500dp/shimmer_layout_news_card_0".equals(tag)) {
            return new ShimmerLayoutNewsCardBindingH500dpImpl(component, view);
          }
          if ("layout/shimmer_layout_news_card_0".equals(tag)) {
            return new ShimmerLayoutNewsCardBindingImpl(component, view);
          }
          if ("layout-h480dp/shimmer_layout_news_card_0".equals(tag)) {
            return new ShimmerLayoutNewsCardBindingH480dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for shimmer_layout_news_card is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "article");
      sKeys.put(2, "imgUrl");
      sKeys.put(3, "listSize");
      sKeys.put(4, "newsHeadLines");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/fragment_news_detail_0", com.sagarock101.newsheadlines.R.layout.fragment_news_detail);
      sKeys.put("layout/fragment_news_headlines_0", com.sagarock101.newsheadlines.R.layout.fragment_news_headlines);
      sKeys.put("layout-h720dp/item_news_card_0", com.sagarock101.newsheadlines.R.layout.item_news_card);
      sKeys.put("layout-h480dp/item_news_card_0", com.sagarock101.newsheadlines.R.layout.item_news_card);
      sKeys.put("layout/item_news_card_0", com.sagarock101.newsheadlines.R.layout.item_news_card);
      sKeys.put("layout-h500dp/item_news_card_0", com.sagarock101.newsheadlines.R.layout.item_news_card);
      sKeys.put("layout-h720dp/shimmer_layout_news_card_0", com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card);
      sKeys.put("layout-h500dp/shimmer_layout_news_card_0", com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card);
      sKeys.put("layout/shimmer_layout_news_card_0", com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card);
      sKeys.put("layout-h480dp/shimmer_layout_news_card_0", com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card);
    }
  }
}
