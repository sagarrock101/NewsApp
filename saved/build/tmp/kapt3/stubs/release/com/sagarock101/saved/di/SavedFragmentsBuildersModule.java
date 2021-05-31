package com.sagarock101.saved.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/sagarock101/saved/di/SavedFragmentsBuildersModule;", "", "()V", "contributeSavedFragment", "Lcom/sagarock101/saved/ui/fragment/SavedFragment;", "contributeSavedNewsDetailFragment", "Lcom/sagarock101/saved/ui/fragment/SavedNewsDetailFragment;", "saved_release"})
@dagger.Module()
public abstract class SavedFragmentsBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.sagarock101.saved.ui.fragment.SavedFragment contributeSavedFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.sagarock101.saved.ui.fragment.SavedNewsDetailFragment contributeSavedNewsDetailFragment();
    
    public SavedFragmentsBuildersModule() {
        super();
    }
}