package com.sagarock101.search.databinding;
import com.sagarock101.search.R;
import com.sagarock101.search.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_as_toolbar, 4);
        sViewsWithIds.put(R.id.iv_search_icon, 5);
        sViewsWithIds.put(R.id.et_search, 6);
        sViewsWithIds.put(R.id.tv_listening, 7);
        sViewsWithIds.put(R.id.iv_close, 8);
        sViewsWithIds.put(R.id.tv_you_can_search_for_news_using_phrases, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ProgressBar) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.rvSearchResults.setTag(null);
        this.tvNoResultsForQuery.setTag(null);
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
        if (BR.vm == variableId) {
            setVm((com.sagarock101.search.ui.viewmodel.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.sagarock101.search.ui.viewmodel.SearchViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmSearchResultsLiveData((androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.search.model.SearchResponse>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmSearchResultsLiveData(androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.search.model.SearchResponse>> VmSearchResultsLiveData, int fieldId) {
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
        com.sagarock101.core.data.DataWrapper.Status vmSearchResultsLiveDataStatus = null;
        java.util.List<com.sagarock101.search.model.Results> vmSearchResultsLiveDataDataResponseResults = null;
        com.sagarock101.search.ui.viewmodel.SearchViewModel vm = mVm;
        com.sagarock101.search.model.Response vmSearchResultsLiveDataDataResponse = null;
        com.sagarock101.core.data.DataWrapper<com.sagarock101.search.model.SearchResponse> vmSearchResultsLiveDataGetValue = null;
        androidx.lifecycle.LiveData<com.sagarock101.core.data.DataWrapper<com.sagarock101.search.model.SearchResponse>> vmSearchResultsLiveData = null;
        com.sagarock101.search.model.SearchResponse vmSearchResultsLiveDataData = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (vm != null) {
                    // read vm.searchResultsLiveData
                    vmSearchResultsLiveData = vm.getSearchResultsLiveData();
                }
                updateLiveDataRegistration(0, vmSearchResultsLiveData);


                if (vmSearchResultsLiveData != null) {
                    // read vm.searchResultsLiveData.getValue()
                    vmSearchResultsLiveDataGetValue = vmSearchResultsLiveData.getValue();
                }


                if (vmSearchResultsLiveDataGetValue != null) {
                    // read vm.searchResultsLiveData.getValue().status
                    vmSearchResultsLiveDataStatus = vmSearchResultsLiveDataGetValue.getStatus();
                    // read vm.searchResultsLiveData.getValue().data
                    vmSearchResultsLiveDataData = vmSearchResultsLiveDataGetValue.getData();
                }


                if (vmSearchResultsLiveDataData != null) {
                    // read vm.searchResultsLiveData.getValue().data.response
                    vmSearchResultsLiveDataDataResponse = vmSearchResultsLiveDataData.getResponse();
                }


                if (vmSearchResultsLiveDataDataResponse != null) {
                    // read vm.searchResultsLiveData.getValue().data.response.results
                    vmSearchResultsLiveDataDataResponseResults = vmSearchResultsLiveDataDataResponse.getResults();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.sagarock101.search.ui.bindings.ViewExtensionsKt.showProgressBasedOnStatus(this.progressBar, vmSearchResultsLiveDataStatus);
            com.sagarock101.search.ui.bindings.ViewExtensionsKt.showViewBasedOnListSize(this.rvSearchResults, vmSearchResultsLiveDataDataResponseResults);
            com.sagarock101.search.ui.bindings.ViewExtensionsKt.showTextWhenResultsAreEmptyAfterSearch(this.tvNoResultsForQuery, vmSearchResultsLiveDataStatus, vmSearchResultsLiveDataDataResponseResults);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.searchResultsLiveData
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}