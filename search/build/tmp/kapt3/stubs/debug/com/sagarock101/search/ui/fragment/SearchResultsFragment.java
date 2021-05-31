package com.sagarock101.search.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0017J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\'\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u001aH\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020\u001aH\u0016J\b\u00100\u001a\u00020\u001aH\u0016J\u0014\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010302*\u000204H\u0007R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u00065"}, d2 = {"Lcom/sagarock101/search/ui/fragment/SearchResultsFragment;", "Lcom/sagarock101/core/view/BaseViewModelFragment;", "Lcom/sagarock101/search/databinding/FragmentSearchBinding;", "Lcom/sagarock101/search/ui/viewmodel/SearchViewModel;", "Landroid/view/View$OnClickListener;", "Lcom/sagarock101/search/interfaces/OnSpeechRecognitionPermissionGrantedListener;", "()V", "listener", "Landroid/text/TextWatcher;", "searchListAdapter", "Lcom/sagarock101/search/ui/adapters/SearchResultsAdapter;", "getSearchListAdapter", "()Lcom/sagarock101/search/ui/adapters/SearchResultsAdapter;", "setSearchListAdapter", "(Lcom/sagarock101/search/ui/adapters/SearchResultsAdapter;)V", "speechRecognitionListener", "Landroid/speech/RecognitionListener;", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "viewModelFactory", "Lcom/sagarock101/core/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/sagarock101/core/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/sagarock101/core/di/ViewModelFactory;)V", "endAnimateListeningText", "", "getLayout", "", "getRecognizerIntent", "Landroid/content/Intent;", "initView", "view", "Landroid/view/View;", "isNetworkActive", "isActive", "", "onClick", "v", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "setListItemClickListner", "setUpSpeechRecognition", "startAnimateListeningText", "startSpeechRecognition", "stopSpeechRecognition", "textChanges", "Lkotlinx/coroutines/flow/Flow;", "", "Landroid/widget/EditText;", "search_debug"})
public final class SearchResultsFragment extends com.sagarock101.core.view.BaseViewModelFragment<com.sagarock101.search.databinding.FragmentSearchBinding, com.sagarock101.search.ui.viewmodel.SearchViewModel> implements android.view.View.OnClickListener, com.sagarock101.search.interfaces.OnSpeechRecognitionPermissionGrantedListener {
    private android.text.TextWatcher listener;
    private android.speech.RecognitionListener speechRecognitionListener;
    private android.speech.SpeechRecognizer speechRecognizer;
    @org.jetbrains.annotations.NotNull()
    public com.sagarock101.search.ui.adapters.SearchResultsAdapter searchListAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.core.di.ViewModelFactory viewModelFactory;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.search.ui.adapters.SearchResultsAdapter getSearchListAdapter() {
        return null;
    }
    
    public final void setSearchListAdapter(@org.jetbrains.annotations.NotNull()
    com.sagarock101.search.ui.adapters.SearchResultsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.core.di.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.di.ViewModelFactory p0) {
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
    public void isNetworkActive(boolean isActive) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @kotlinx.coroutines.FlowPreview()
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void setListItemClickListner() {
    }
    
    private final void setUpSpeechRecognition() {
    }
    
    private final void endAnimateListeningText() {
    }
    
    private final void startAnimateListeningText() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final android.content.Intent getRecognizerIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.CheckResult()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> textChanges(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$textChanges) {
        return null;
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void startSpeechRecognition() {
    }
    
    @java.lang.Override()
    public void stopSpeechRecognition() {
    }
    
    public SearchResultsFragment() {
        super();
    }
}