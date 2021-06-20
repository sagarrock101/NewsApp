package com.sagarock101;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/sagarock101/FragmentDialogTheme;", "Landroidx/fragment/app/DialogFragment;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "()V", "binding", "Lcom/sagarock101/stylekit/databinding/FragmentDialogThemeBinding;", "checkedThemeRes", "", "Ljava/lang/Integer;", "listener", "Lcom/sagarock101/FragmentDialogTheme$Companion$OnDialogThemeBtnListener;", "highLightSelectedTheme", "", "onCheckedChanged", "group", "Landroid/widget/RadioGroup;", "checkedId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "setListener", "setThemeToBeChecked", "themeRes", "Companion", "stylekit_debug"})
public final class FragmentDialogTheme extends androidx.fragment.app.DialogFragment implements android.widget.RadioGroup.OnCheckedChangeListener {
    private java.lang.Integer checkedThemeRes;
    private com.sagarock101.stylekit.databinding.FragmentDialogThemeBinding binding;
    private com.sagarock101.FragmentDialogTheme.Companion.OnDialogThemeBtnListener listener;
    public static final com.sagarock101.FragmentDialogTheme.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void highLightSelectedTheme() {
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    android.widget.RadioGroup group, int checkedId) {
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.sagarock101.FragmentDialogTheme.Companion.OnDialogThemeBtnListener listener) {
    }
    
    public final void setThemeToBeChecked(int themeRes) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public FragmentDialogTheme() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/sagarock101/FragmentDialogTheme$Companion;", "", "()V", "OnDialogThemeBtnListener", "stylekit_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/sagarock101/FragmentDialogTheme$Companion$OnDialogThemeBtnListener;", "", "onDialogThemeBtnClick", "", "themeName", "", "stylekit_debug"})
        public static abstract interface OnDialogThemeBtnListener {
            
            public abstract void onDialogThemeBtnClick(@org.jetbrains.annotations.NotNull()
            java.lang.String themeName);
        }
    }
}