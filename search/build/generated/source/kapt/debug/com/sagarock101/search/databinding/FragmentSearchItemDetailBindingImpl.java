package com.sagarock101.search.databinding;
import com.sagarock101.search.R;
import com.sagarock101.search.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchItemDetailBindingImpl extends FragmentSearchItemDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 4);
        sViewsWithIds.put(R.id.collapsing_toolbar, 5);
        sViewsWithIds.put(R.id.iv_news_img, 6);
        sViewsWithIds.put(R.id.iv_gradient, 7);
        sViewsWithIds.put(R.id.toolbar, 8);
        sViewsWithIds.put(R.id.iv_back, 9);
        sViewsWithIds.put(R.id.nsv_container, 10);
        sViewsWithIds.put(R.id.cv_content, 11);
        sViewsWithIds.put(R.id.tv_content, 12);
        sViewsWithIds.put(R.id.btn_read_full_story, 13);
        sViewsWithIds.put(R.id.ll_fab, 14);
        sViewsWithIds.put(R.id.fabSave, 15);
        sViewsWithIds.put(R.id.fabShare, 16);
        sViewsWithIds.put(R.id.fabAdd, 17);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchItemDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentSearchItemDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (android.widget.Button) bindings[13]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[17]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[15]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[16]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[14]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.colParent.setTag(null);
        this.tvDesc.setTag(null);
        this.tvPublishedDate.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.result == variableId) {
            setResult((com.sagarock101.search.model.Results) variable);
        }
        else if (BR.imgUrl == variableId) {
            setImgUrl((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setResult(@Nullable com.sagarock101.search.model.Results Result) {
        this.mResult = Result;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.result);
        super.requestRebind();
    }
    public void setImgUrl(@Nullable java.lang.String ImgUrl) {
        this.mImgUrl = ImgUrl;
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
        com.sagarock101.search.model.Results result = mResult;
        java.sql.Timestamp resultWebPublicationDate = null;
        java.lang.String resultWebTitle = null;
        com.sagarock101.search.model.Fields resultFields = null;
        java.lang.String resultFieldsBodyText = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (result != null) {
                    // read result.webPublicationDate
                    resultWebPublicationDate = result.getWebPublicationDate();
                    // read result.webTitle
                    resultWebTitle = result.getWebTitle();
                    // read result.fields
                    resultFields = result.getFields();
                }


                if (resultFields != null) {
                    // read result.fields.bodyText
                    resultFieldsBodyText = resultFields.getBodyText();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.sagarock101.search.ui.bindings.ViewExtensionsKt.bindTextLikeNewsText(this.tvDesc, resultFieldsBodyText);
            com.sagarock101.search.ui.bindings.ViewExtensionsKt.getFormattedDate(this.tvPublishedDate, resultWebPublicationDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, resultWebTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): result
        flag 1 (0x2L): imgUrl
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}