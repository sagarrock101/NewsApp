package com.sagarock101.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0012\u0010\u001a\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/sagarock101/core/utils/SnapOnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "snapHelper", "Lcom/sagarock101/core/utils/SnapHelper;", "onSnapPositionChangeListener", "Lcom/sagarock101/core/interfaces/OnSnapPositionChangeListener;", "(Lcom/sagarock101/core/utils/SnapHelper;Lcom/sagarock101/core/interfaces/OnSnapPositionChangeListener;)V", "getOnSnapPositionChangeListener", "()Lcom/sagarock101/core/interfaces/OnSnapPositionChangeListener;", "setOnSnapPositionChangeListener", "(Lcom/sagarock101/core/interfaces/OnSnapPositionChangeListener;)V", "getSnapHelper", "()Lcom/sagarock101/core/utils/SnapHelper;", "setSnapHelper", "(Lcom/sagarock101/core/utils/SnapHelper;)V", "snapPosition", "", "notifySnapPositionChange", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onScrollStateChanged", "newState", "onScrolled", "dx", "dy", "getSnapPosition", "core_release"})
public final class SnapOnScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private int snapPosition = androidx.recyclerview.widget.RecyclerView.NO_POSITION;
    @org.jetbrains.annotations.NotNull()
    private com.sagarock101.core.utils.SnapHelper snapHelper;
    @org.jetbrains.annotations.NotNull()
    private com.sagarock101.core.interfaces.OnSnapPositionChangeListener onSnapPositionChangeListener;
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    private final void notifySnapPositionChange(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onScrollStateChanged(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int newState) {
    }
    
    public final int getSnapPosition(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.utils.SnapHelper $this$getSnapPosition, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.core.utils.SnapHelper getSnapHelper() {
        return null;
    }
    
    public final void setSnapHelper(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.utils.SnapHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.core.interfaces.OnSnapPositionChangeListener getOnSnapPositionChangeListener() {
        return null;
    }
    
    public final void setOnSnapPositionChangeListener(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.interfaces.OnSnapPositionChangeListener p0) {
    }
    
    public SnapOnScrollListener(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.utils.SnapHelper snapHelper, @org.jetbrains.annotations.NotNull()
    com.sagarock101.core.interfaces.OnSnapPositionChangeListener onSnapPositionChangeListener) {
        super();
    }
}