package com.sagarock101.saved.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/sagarock101/saved/ui/fragment/SavedFragmentDirections;", "", "()V", "ActionSavedFragmentToSavedNewsDetailFragment", "Companion", "saved_release"})
public final class SavedFragmentDirections {
    public static final com.sagarock101.saved.ui.fragment.SavedFragmentDirections.Companion Companion = null;
    
    private SavedFragmentDirections() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/sagarock101/saved/ui/fragment/SavedFragmentDirections$ActionSavedFragmentToSavedNewsDetailFragment;", "Landroidx/navigation/NavDirections;", "articles", "Lcom/sagarock101/database/model/Articles;", "(Lcom/sagarock101/database/model/Articles;)V", "getArticles", "()Lcom/sagarock101/database/model/Articles;", "component1", "copy", "equals", "", "other", "", "getActionId", "", "getArguments", "Landroid/os/Bundle;", "hashCode", "toString", "", "saved_release"})
    static final class ActionSavedFragmentToSavedNewsDetailFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.Nullable()
        private final com.sagarock101.database.model.Articles articles = null;
        
        @java.lang.Override()
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
        @java.lang.Override()
        public android.os.Bundle getArguments() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.sagarock101.database.model.Articles getArticles() {
            return null;
        }
        
        public ActionSavedFragmentToSavedNewsDetailFragment(@org.jetbrains.annotations.Nullable()
        com.sagarock101.database.model.Articles articles) {
            super();
        }
        
        public ActionSavedFragmentToSavedNewsDetailFragment() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.sagarock101.database.model.Articles component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sagarock101.saved.ui.fragment.SavedFragmentDirections.ActionSavedFragmentToSavedNewsDetailFragment copy(@org.jetbrains.annotations.Nullable()
        com.sagarock101.database.model.Articles articles) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/sagarock101/saved/ui/fragment/SavedFragmentDirections$Companion;", "", "()V", "actionSavedFragmentToSavedNewsDetailFragment", "Landroidx/navigation/NavDirections;", "articles", "Lcom/sagarock101/database/model/Articles;", "saved_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections actionSavedFragmentToSavedNewsDetailFragment(@org.jetbrains.annotations.Nullable()
        com.sagarock101.database.model.Articles articles) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}