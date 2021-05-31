package com.sagarock101.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/sagarock101/core/utils/SnapHelper;", "Landroidx/recyclerview/widget/LinearSnapHelper;", "()V", "mHorizontalHelper", "Landroidx/recyclerview/widget/OrientationHelper;", "mVerticalHelper", "attachToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "calculateDistanceToFinalSnap", "", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "targetView", "Landroid/view/View;", "distanceToStart", "", "helper", "findSnapView", "getHorizontalHelper", "getStartView", "getVerticalHelper", "core_release"})
public final class SnapHelper extends androidx.recyclerview.widget.LinearSnapHelper {
    private androidx.recyclerview.widget.OrientationHelper mVerticalHelper;
    private androidx.recyclerview.widget.OrientationHelper mHorizontalHelper;
    
    @java.lang.Override()
    public void attachToRecyclerView(@org.jetbrains.annotations.Nullable()
    @javax.annotation.Nullable()
    androidx.recyclerview.widget.RecyclerView recyclerView) throws java.lang.IllegalStateException {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public int[] calculateDistanceToFinalSnap(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, @org.jetbrains.annotations.NotNull()
    android.view.View targetView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View findSnapView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return null;
    }
    
    private final int distanceToStart(android.view.View targetView, androidx.recyclerview.widget.OrientationHelper helper) {
        return 0;
    }
    
    private final android.view.View getStartView(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.OrientationHelper helper) {
        return null;
    }
    
    private final androidx.recyclerview.widget.OrientationHelper getVerticalHelper(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return null;
    }
    
    private final androidx.recyclerview.widget.OrientationHelper getHorizontalHelper(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return null;
    }
    
    public SnapHelper() {
        super();
    }
}