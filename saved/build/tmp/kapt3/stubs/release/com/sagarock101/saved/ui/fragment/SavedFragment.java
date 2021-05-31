package com.sagarock101.saved.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020&H\u0002J\b\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.H\u0016J\u0012\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020&H\u0016J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u00020&H\u0002J\b\u00105\u001a\u00020&H\u0002J\b\u00106\u001a\u00020&H\u0002J\b\u00107\u001a\u00020&H\u0002J\b\u00108\u001a\u00020&H\u0002J\u0017\u00109\u001a\u00020&2\b\u0010:\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0002\u0010;R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006<"}, d2 = {"Lcom/sagarock101/saved/ui/fragment/SavedFragment;", "Lcom/sagarock101/core/view/BaseViewModelFragment;", "Lcom/sagarock101/saved/databinding/FragmentSavedBinding;", "Lcom/sagarock101/saved/viewmodel/SavedNewsViewModel;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "actionModeCallback", "Landroidx/appcompat/view/ActionMode$Callback;", "adapter", "Lcom/sagarock101/saved/ui/adapter/SavedNewsAdapter;", "getAdapter", "()Lcom/sagarock101/saved/ui/adapter/SavedNewsAdapter;", "setAdapter", "(Lcom/sagarock101/saved/ui/adapter/SavedNewsAdapter;)V", "currentSwipedItem", "Lcom/sagarock101/database/model/Articles;", "currentSwipedPosition", "", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "items", "Landroidx/recyclerview/selection/Selection;", "listOfItemsToBeDeleted", "", "listOfSavedArticles", "", "selectionTracker", "Landroidx/recyclerview/selection/SelectionTracker;", "vibrator", "Landroid/os/Vibrator;", "viewModelFactory", "Lcom/sagarock101/core/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/sagarock101/core/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/sagarock101/core/di/ViewModelFactory;)V", "actionModeDeletePressed", "", "attachItemTouchHelperToRecyclerView", "getLayout", "initView", "view", "Landroid/view/View;", "isNetworkActive", "isActive", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "removeItemTouchHelperFromRecyclerView", "setSavedNewsObserver", "setUpItemTouchHelper", "setupActionMode", "setupRvWithAdapter", "setupSelectorTracker", "updateMenuTitle", "selectedSize", "(Ljava/lang/Integer;)V", "saved_release"})
public final class SavedFragment extends com.sagarock101.core.view.BaseViewModelFragment<com.sagarock101.saved.databinding.FragmentSavedBinding, com.sagarock101.saved.viewmodel.SavedNewsViewModel> {
    private android.os.Vibrator vibrator;
    private androidx.recyclerview.selection.Selection<com.sagarock101.database.model.Articles> items;
    private androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.core.di.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public com.sagarock101.saved.ui.adapter.SavedNewsAdapter adapter;
    private com.sagarock101.database.model.Articles currentSwipedItem;
    private int currentSwipedPosition = -1;
    private java.util.List<com.sagarock101.database.model.Articles> listOfSavedArticles;
    private androidx.appcompat.view.ActionMode.Callback actionModeCallback;
    private androidx.appcompat.view.ActionMode actionMode;
    private androidx.recyclerview.selection.SelectionTracker<com.sagarock101.database.model.Articles> selectionTracker;
    private java.util.List<com.sagarock101.database.model.Articles> listOfItemsToBeDeleted;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.core.di.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.saved.ui.adapter.SavedNewsAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.sagarock101.saved.ui.adapter.SavedNewsAdapter p0) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void setSavedNewsObserver() {
    }
    
    private final void setupActionMode() {
    }
    
    private final void actionModeDeletePressed() {
    }
    
    private final void setupRvWithAdapter() {
    }
    
    private final void setupSelectorTracker() {
    }
    
    private final void setUpItemTouchHelper() {
    }
    
    private final void attachItemTouchHelperToRecyclerView() {
    }
    
    private final void removeItemTouchHelperFromRecyclerView() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void isNetworkActive(boolean isActive) {
    }
    
    private final void updateMenuTitle(java.lang.Integer selectedSize) {
    }
    
    public SavedFragment() {
        super();
    }
}