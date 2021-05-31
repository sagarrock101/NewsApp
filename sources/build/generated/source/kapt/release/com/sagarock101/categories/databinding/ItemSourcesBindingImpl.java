package com.sagarock101.categories.databinding;
import com.sagarock101.categories.R;
import com.sagarock101.categories.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSourcesBindingImpl extends ItemSourcesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cl_container, 4);
        sViewsWithIds.put(R.id.iv_source, 5);
        sViewsWithIds.put(R.id.btn_open_in_browser, 6);
        sViewsWithIds.put(R.id.iv_right_arrow, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSourcesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemSourcesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.cvParent.setTag(null);
        this.tvSourceDesc.setTag(null);
        this.tvSourceSource.setTag(null);
        this.tvSourceTitle.setTag(null);
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
        if (BR.source == variableId) {
            setSource((com.sagarock101.categories.model.Source) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSource(@Nullable com.sagarock101.categories.model.Source Source) {
        this.mSource = Source;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.source);
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
        java.lang.String sourceId = null;
        java.lang.String sourceDescription = null;
        java.lang.String sourceCategory = null;
        com.sagarock101.categories.model.Source source = mSource;

        if ((dirtyFlags & 0x3L) != 0) {



                if (source != null) {
                    // read source.id
                    sourceId = source.getId();
                    // read source.description
                    sourceDescription = source.getDescription();
                    // read source.category
                    sourceCategory = source.getCategory();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSourceDesc, sourceDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSourceSource, sourceCategory);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSourceTitle, sourceId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): source
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}