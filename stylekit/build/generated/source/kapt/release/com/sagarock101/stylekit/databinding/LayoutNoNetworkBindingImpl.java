package com.sagarock101.stylekit.databinding;
import com.sagarock101.stylekit.R;
import com.sagarock101.stylekit.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutNoNetworkBindingImpl extends LayoutNoNetworkBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cl_no_internet, 1);
        sViewsWithIds.put(R.id.iv_image, 2);
        sViewsWithIds.put(R.id.tv_no_internet, 3);
        sViewsWithIds.put(R.id.btn_retry, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNoNetworkBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private LayoutNoNetworkBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ScrollView) bindings[0]
            , (android.widget.TextView) bindings[3]
            );
        this.svNoNetwork.setTag(null);
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
        if (BR.listSize == variableId) {
            setListSize((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListSize(@Nullable java.lang.Integer ListSize) {
        this.mListSize = ListSize;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listSize);
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
        int androidxDatabindingViewDataBindingSafeUnboxListSize = 0;
        int listSizeInt0ViewGONEViewVISIBLE = 0;
        boolean listSizeInt0 = false;
        java.lang.Integer listSize = mListSize;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(listSize)
                androidxDatabindingViewDataBindingSafeUnboxListSize = androidx.databinding.ViewDataBinding.safeUnbox(listSize);


                // read androidx.databinding.ViewDataBinding.safeUnbox(listSize) > 0
                listSizeInt0 = (androidxDatabindingViewDataBindingSafeUnboxListSize) > (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(listSizeInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(listSize) > 0 ? View.GONE : View.VISIBLE
                listSizeInt0ViewGONEViewVISIBLE = ((listSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.svNoNetwork.setVisibility(listSizeInt0ViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listSize
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(listSize) > 0 ? View.GONE : View.VISIBLE
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(listSize) > 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}