package com.sagarock101.newsheadlines.databinding;
import com.sagarock101.newsheadlines.R;
import com.sagarock101.newsheadlines.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNewsHeadlinesBindingImpl extends FragmentNewsHeadlinesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(31);
        sIncludes.setIncludes(0, 
            new String[] {"layout_no_network"},
            new int[] {18},
            new int[] {com.sagarock101.stylekit.R.layout.layout_no_network});
        sIncludes.setIncludes(1, 
            new String[] {"shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card", "shimmer_layout_news_card"},
            new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17},
            new int[] {com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card,
                com.sagarock101.newsheadlines.R.layout.shimmer_layout_news_card});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.horizontal_chip_group, 19);
        sViewsWithIds.put(R.id.chip_group, 20);
        sViewsWithIds.put(R.id.chip_all, 21);
        sViewsWithIds.put(R.id.chip_business, 22);
        sViewsWithIds.put(R.id.chip_sports, 23);
        sViewsWithIds.put(R.id.chip_health, 24);
        sViewsWithIds.put(R.id.chip_entertainment, 25);
        sViewsWithIds.put(R.id.chip_technology, 26);
        sViewsWithIds.put(R.id.chip_science, 27);
        sViewsWithIds.put(R.id.shimmer, 28);
        sViewsWithIds.put(R.id.rv_news, 29);
        sViewsWithIds.put(R.id.indicator, 30);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView11;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView110;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView111;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView112;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView113;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView114;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView115;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView116;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView12;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView13;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView14;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView15;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView16;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView17;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView18;
    @Nullable
    private final com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding mboundView19;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNewsHeadlinesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentNewsHeadlinesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.chip.Chip) bindings[21]
            , (com.google.android.material.chip.Chip) bindings[22]
            , (com.google.android.material.chip.Chip) bindings[25]
            , (com.google.android.material.chip.ChipGroup) bindings[20]
            , (com.google.android.material.chip.Chip) bindings[24]
            , (com.google.android.material.chip.Chip) bindings[27]
            , (com.google.android.material.chip.Chip) bindings[23]
            , (com.google.android.material.chip.Chip) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.HorizontalScrollView) bindings[19]
            , (ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator) bindings[30]
            , (com.sagarock101.stylekit.databinding.LayoutNoNetworkBinding) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[29]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[28]
            );
        this.clNewsHeadlines.setTag(null);
        setContainedBinding(this.layoutNoNetwork);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[2];
        setContainedBinding(this.mboundView11);
        this.mboundView110 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[11];
        setContainedBinding(this.mboundView110);
        this.mboundView111 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[12];
        setContainedBinding(this.mboundView111);
        this.mboundView112 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[13];
        setContainedBinding(this.mboundView112);
        this.mboundView113 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[14];
        setContainedBinding(this.mboundView113);
        this.mboundView114 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[15];
        setContainedBinding(this.mboundView114);
        this.mboundView115 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[16];
        setContainedBinding(this.mboundView115);
        this.mboundView116 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[17];
        setContainedBinding(this.mboundView116);
        this.mboundView12 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[3];
        setContainedBinding(this.mboundView12);
        this.mboundView13 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[4];
        setContainedBinding(this.mboundView13);
        this.mboundView14 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[5];
        setContainedBinding(this.mboundView14);
        this.mboundView15 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[6];
        setContainedBinding(this.mboundView15);
        this.mboundView16 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[7];
        setContainedBinding(this.mboundView16);
        this.mboundView17 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[8];
        setContainedBinding(this.mboundView17);
        this.mboundView18 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[9];
        setContainedBinding(this.mboundView18);
        this.mboundView19 = (com.sagarock101.newsheadlines.databinding.ShimmerLayoutNewsCardBinding) bindings[10];
        setContainedBinding(this.mboundView19);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        mboundView13.invalidateAll();
        mboundView14.invalidateAll();
        mboundView15.invalidateAll();
        mboundView16.invalidateAll();
        mboundView17.invalidateAll();
        mboundView18.invalidateAll();
        mboundView19.invalidateAll();
        mboundView110.invalidateAll();
        mboundView111.invalidateAll();
        mboundView112.invalidateAll();
        mboundView113.invalidateAll();
        mboundView114.invalidateAll();
        mboundView115.invalidateAll();
        mboundView116.invalidateAll();
        layoutNoNetwork.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView12.hasPendingBindings()) {
            return true;
        }
        if (mboundView13.hasPendingBindings()) {
            return true;
        }
        if (mboundView14.hasPendingBindings()) {
            return true;
        }
        if (mboundView15.hasPendingBindings()) {
            return true;
        }
        if (mboundView16.hasPendingBindings()) {
            return true;
        }
        if (mboundView17.hasPendingBindings()) {
            return true;
        }
        if (mboundView18.hasPendingBindings()) {
            return true;
        }
        if (mboundView19.hasPendingBindings()) {
            return true;
        }
        if (mboundView110.hasPendingBindings()) {
            return true;
        }
        if (mboundView111.hasPendingBindings()) {
            return true;
        }
        if (mboundView112.hasPendingBindings()) {
            return true;
        }
        if (mboundView113.hasPendingBindings()) {
            return true;
        }
        if (mboundView114.hasPendingBindings()) {
            return true;
        }
        if (mboundView115.hasPendingBindings()) {
            return true;
        }
        if (mboundView116.hasPendingBindings()) {
            return true;
        }
        if (layoutNoNetwork.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.newsHeadLines == variableId) {
            setNewsHeadLines((com.sagarock101.database.model.NewsHeadLines) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNewsHeadLines(@Nullable com.sagarock101.database.model.NewsHeadLines NewsHeadLines) {
        this.mNewsHeadLines = NewsHeadLines;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.newsHeadLines);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
        mboundView13.setLifecycleOwner(lifecycleOwner);
        mboundView14.setLifecycleOwner(lifecycleOwner);
        mboundView15.setLifecycleOwner(lifecycleOwner);
        mboundView16.setLifecycleOwner(lifecycleOwner);
        mboundView17.setLifecycleOwner(lifecycleOwner);
        mboundView18.setLifecycleOwner(lifecycleOwner);
        mboundView19.setLifecycleOwner(lifecycleOwner);
        mboundView110.setLifecycleOwner(lifecycleOwner);
        mboundView111.setLifecycleOwner(lifecycleOwner);
        mboundView112.setLifecycleOwner(lifecycleOwner);
        mboundView113.setLifecycleOwner(lifecycleOwner);
        mboundView114.setLifecycleOwner(lifecycleOwner);
        mboundView115.setLifecycleOwner(lifecycleOwner);
        mboundView116.setLifecycleOwner(lifecycleOwner);
        layoutNoNetwork.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLayoutNoNetwork((com.sagarock101.stylekit.databinding.LayoutNoNetworkBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLayoutNoNetwork(com.sagarock101.stylekit.databinding.LayoutNoNetworkBinding LayoutNoNetwork, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.sagarock101.database.model.NewsHeadLines newsHeadLines = mNewsHeadLines;
        int newsHeadLinesTotalResults = 0;

        if ((dirtyFlags & 0x6L) != 0) {



                if (newsHeadLines != null) {
                    // read newsHeadLines.totalResults
                    newsHeadLinesTotalResults = newsHeadLines.getTotalResults();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.layoutNoNetwork.setListSize(newsHeadLinesTotalResults);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
        executeBindingsOn(mboundView13);
        executeBindingsOn(mboundView14);
        executeBindingsOn(mboundView15);
        executeBindingsOn(mboundView16);
        executeBindingsOn(mboundView17);
        executeBindingsOn(mboundView18);
        executeBindingsOn(mboundView19);
        executeBindingsOn(mboundView110);
        executeBindingsOn(mboundView111);
        executeBindingsOn(mboundView112);
        executeBindingsOn(mboundView113);
        executeBindingsOn(mboundView114);
        executeBindingsOn(mboundView115);
        executeBindingsOn(mboundView116);
        executeBindingsOn(layoutNoNetwork);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutNoNetwork
        flag 1 (0x2L): newsHeadLines
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}