package com.sagarock101.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/sagarock101/widget/WidgetViewModel;", "Lcom/sagarock101/core/viewmodel/CoroutineViewModel;", "()V", "_isSaved", "Landroidx/lifecycle/MutableLiveData;", "", "newsDatabaseRepo", "Lcom/sagarock101/database/NewsDatabaseRepo;", "getNewsDatabaseRepo", "()Lcom/sagarock101/database/NewsDatabaseRepo;", "setNewsDatabaseRepo", "(Lcom/sagarock101/database/NewsDatabaseRepo;)V", "savedLiveData", "Landroidx/lifecycle/LiveData;", "getSavedLiveData", "()Landroidx/lifecycle/LiveData;", "checkIfNewsExists", "Lkotlinx/coroutines/Job;", "title", "", "checkIfSaved", "", "articles", "Lcom/sagarock101/database/model/Articles;", "deleteNews", "insertNews", "widget_release"})
public final class WidgetViewModel extends com.sagarock101.core.viewmodel.CoroutineViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.database.NewsDatabaseRepo newsDatabaseRepo;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isSaved = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> savedLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.database.NewsDatabaseRepo getNewsDatabaseRepo() {
        return null;
    }
    
    public final void setNewsDatabaseRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.NewsDatabaseRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSavedLiveData() {
        return null;
    }
    
    private final kotlinx.coroutines.Job checkIfNewsExists(java.lang.String title) {
        return null;
    }
    
    public final void checkIfSaved(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteNews(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertNews(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles articles) {
        return null;
    }
    
    @javax.inject.Inject()
    public WidgetViewModel() {
        super(null);
    }
}