package com.sagarock101.newsheadlines.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\u0012\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u0016J\u0012\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010.\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010/\u001a\u00020\u0017H\u0016J\b\u00100\u001a\u00020\u0017H\u0016J\b\u00101\u001a\u00020\u0017H\u0016J\u0010\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\'H\u0016J\u0018\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000eH\u0016J\b\u00107\u001a\u00020\u0017H\u0002J\b\u00108\u001a\u00020\u0017H\u0002J\b\u00109\u001a\u00020\u0017H\u0002J\u0016\u0010:\u001a\u00020\u0017*\u00020;2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006<"}, d2 = {"Lcom/sagarock101/newsheadlines/ui/fragments/NewsHeadlinesFragment;", "Lcom/sagarock101/core/view/BaseViewModelFragment;", "Lcom/sagarock101/newsheadlines/databinding/FragmentNewsHeadlinesBinding;", "Lcom/sagarock101/newsheadlines/viewmodel/NewsViewModel;", "Lcom/sagarock101/core/interfaces/Injectable;", "Lcom/sagarock101/core/interfaces/OnSnapPositionChangeListener;", "Lcom/google/android/material/chip/ChipGroup$OnCheckedChangeListener;", "Landroid/view/View$OnClickListener;", "()V", "adapter", "Lcom/sagarock101/newsheadlines/ui/adapter/TopHeadlinesAdapter;", "handler", "Landroid/os/Handler;", "prevCheckedId", "", "Ljava/lang/Integer;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "attachSnapTov", "", "callApiForOnlyAllChipSelected", "callApiIfAnyOfChipSelected", "getLayout", "getNews", "category", "", "hideNoWifiMsg", "initView", "view", "Landroid/view/View;", "isNetworkActive", "isActive", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCheckedChanged", "group", "Lcom/google/android/material/chip/ChipGroup;", "checkedId", "onClick", "v", "onCreate", "onDestroyView", "onPause", "onResume", "onSaveInstanceState", "outState", "onSnapPositionChange", "position", "previousPosition", "scrollToFirstArticle", "setAdapterToRecyclerView", "showNoWifiMsg", "callApiIfChipIsPressed", "Lcom/google/android/material/chip/Chip;", "newsheadlines_debug"})
public final class NewsHeadlinesFragment extends com.sagarock101.core.view.BaseViewModelFragment<com.sagarock101.newsheadlines.databinding.FragmentNewsHeadlinesBinding, com.sagarock101.newsheadlines.viewmodel.NewsViewModel> implements com.sagarock101.core.interfaces.Injectable, com.sagarock101.core.interfaces.OnSnapPositionChangeListener, com.google.android.material.chip.ChipGroup.OnCheckedChangeListener, android.view.View.OnClickListener {
    private java.lang.Integer prevCheckedId;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.sagarock101.newsheadlines.ui.adapter.TopHeadlinesAdapter adapter;
    private android.os.Handler handler;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
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
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void setAdapterToRecyclerView() {
    }
    
    private final void attachSnapTov() {
    }
    
    @java.lang.Override()
    public void onSnapPositionChange(int position, int previousPosition) {
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    com.google.android.material.chip.ChipGroup group, int checkedId) {
    }
    
    private final void scrollToFirstArticle() {
    }
    
    private final void getNews(java.lang.String category) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void isNetworkActive(boolean isActive) {
    }
    
    private final void hideNoWifiMsg() {
    }
    
    private final void showNoWifiMsg() {
    }
    
    private final void callApiIfChipIsPressed(@org.jetbrains.annotations.NotNull()
    com.google.android.material.chip.Chip $this$callApiIfChipIsPressed, java.lang.String category) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void callApiIfAnyOfChipSelected() {
    }
    
    private final void callApiForOnlyAllChipSelected() {
    }
    
    public NewsHeadlinesFragment() {
        super();
    }
}