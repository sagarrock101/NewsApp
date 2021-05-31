package com.sagarock101.search.databinding;
import com.sagarock101.search.R;
import com.sagarock101.search.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSearchResultBindingImpl extends ItemSearchResultBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cl_news_saved, 4);
        sViewsWithIds.put(R.id.cv_img_container, 5);
        sViewsWithIds.put(R.id.iv_ripple, 6);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSearchResultBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemSearchResultBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivNewsImg.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvSource.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.searchResult == variableId) {
            setSearchResult((com.sagarock101.search.model.Results) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchResult(@Nullable com.sagarock101.search.model.Results SearchResult) {
        this.mSearchResult = SearchResult;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.searchResult);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.sagarock101.search.model.Results searchResult = mSearchResult;
        java.lang.String searchResultFieldsThumbnail = null;
        com.sagarock101.search.model.Fields searchResultFields = null;
        java.lang.String searchResultWebTitle = null;
        java.sql.Timestamp searchResultWebPublicationDate = null;
        java.lang.String searchResultSectionName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (searchResult != null) {
                    // read searchResult.fields
                    searchResultFields = searchResult.getFields();
                    // read searchResult.webTitle
                    searchResultWebTitle = searchResult.getWebTitle();
                    // read searchResult.webPublicationDate
                    searchResultWebPublicationDate = searchResult.getWebPublicationDate();
                    // read searchResult.sectionName
                    searchResultSectionName = searchResult.getSectionName();
                }


                if (searchResultFields != null) {
                    // read searchResult.fields.thumbnail
                    searchResultFieldsThumbnail = searchResultFields.getThumbnail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.sagarock101.search.ui.bindings.ViewExtensionsKt.setImage(this.ivNewsImg, searchResultFieldsThumbnail);
            com.sagarock101.search.ui.bindings.ViewExtensionsKt.bindSourceAndTime(this.tvSource, searchResultSectionName, searchResultWebPublicationDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, searchResultWebTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchResult
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}