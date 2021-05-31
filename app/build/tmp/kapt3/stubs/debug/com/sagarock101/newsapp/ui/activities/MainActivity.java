package com.sagarock101.newsapp.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010+\u001a\u00020,2\u0006\u0010(\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020,H\u0002J\b\u0010/\u001a\u00020,H\u0002J\b\u00100\u001a\u00020,H\u0002J\u0010\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020,2\u0006\u00103\u001a\u00020\u0016H\u0016J\b\u00104\u001a\u00020,H\u0016J\u0012\u00105\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0012\u00108\u001a\u00020,2\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0012\u0010;\u001a\u00020\u00162\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\"\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010C\u001a\u00020,2\u0006\u0010(\u001a\u00020-H\u0016J\u0010\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020\u00162\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010H\u001a\u00020,H\u0014J\b\u0010I\u001a\u00020,H\u0014J\b\u0010J\u001a\u00020,H\u0002J\b\u0010K\u001a\u00020,H\u0002J\b\u0010L\u001a\u00020\u0016H\u0014J\b\u0010M\u001a\u00020,H\u0002J\b\u0010N\u001a\u00020,H\u0002J\b\u0010O\u001a\u00020,H\u0002J\b\u0010P\u001a\u00020,H\u0002J\u0010\u0010Q\u001a\u00020,2\u0006\u0010R\u001a\u000207H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010)R\u0012\u0010*\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010)\u00a8\u0006S"}, d2 = {"Lcom/sagarock101/newsapp/ui/activities/MainActivity;", "Lcom/sagarock101/core/view/BaseActivity;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemReselectedListener;", "Lcom/sagarock101/FragmentDialogTheme$Companion$OnDialogThemeBtnListener;", "Landroid/view/View$OnClickListener;", "()V", "DARK_THEME", "", "LIGHT_THEME", "aboutDialogFragment", "Lcom/sagarock101/AboutDialogFragment;", "binding", "Lcom/sagarock101/newsapp/databinding/ActivityMainBinding;", "getBinding", "()Lcom/sagarock101/newsapp/databinding/ActivityMainBinding;", "setBinding", "(Lcom/sagarock101/newsapp/databinding/ActivityMainBinding;)V", "btmNavAlphaObjectAnimator", "Landroid/animation/ObjectAnimator;", "btmNavObjectAnimator", "isNetworkActive", "", "layout", "getLayout", "()I", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "Lkotlin/Lazy;", "preferenceHelper", "Lcom/sagarock101/core/utils/PreferenceHelper;", "getPreferenceHelper", "()Lcom/sagarock101/core/utils/PreferenceHelper;", "setPreferenceHelper", "(Lcom/sagarock101/core/utils/PreferenceHelper;)V", "themeDialogFragment", "Lcom/sagarock101/FragmentDialogTheme;", "themeName", "Ljava/lang/Integer;", "themeSelected", "changeTheme", "", "", "createDialog", "hideBtmNavBar", "hideNoInternetMessage", "hideViewOrShowViews", "visibility", "isActive", "onBackPressed", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestinationChanged", "controller", "destination", "Landroidx/navigation/NavDestination;", "arguments", "onDialogThemeBtnClick", "onNavigationItemReselected", "item", "Landroid/view/MenuItem;", "onOptionsItemSelected", "onPause", "onResume", "setupSharedPreferences", "setupTheme", "shouldUseDataBinding", "showAboutDialog", "showBtmNavBar", "showDialog", "showNoInternetMessage", "showSearchDialog", "view", "app_debug"})
public final class MainActivity extends com.sagarock101.core.view.BaseActivity implements androidx.navigation.NavController.OnDestinationChangedListener, com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener, com.sagarock101.FragmentDialogTheme.Companion.OnDialogThemeBtnListener, android.view.View.OnClickListener {
    private java.lang.Integer themeSelected;
    private com.sagarock101.FragmentDialogTheme themeDialogFragment;
    private com.sagarock101.AboutDialogFragment aboutDialogFragment;
    @org.jetbrains.annotations.NotNull()
    public com.sagarock101.newsapp.databinding.ActivityMainBinding binding;
    private boolean isNetworkActive = true;
    private final kotlin.Lazy navController$delegate = null;
    private android.animation.ObjectAnimator btmNavObjectAnimator;
    private android.animation.ObjectAnimator btmNavAlphaObjectAnimator;
    private java.lang.Integer themeName;
    private final int LIGHT_THEME = com.sagarock101.stylekit.R.style.LightTheme;
    private final int DARK_THEME = com.sagarock101.stylekit.R.style.DarkTheme;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.sagarock101.core.utils.PreferenceHelper preferenceHelper;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.newsapp.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsapp.databinding.ActivityMainBinding p0) {
    }
    
    private final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.core.utils.PreferenceHelper getPreferenceHelper() {
        return null;
    }
    
    public final void setPreferenceHelper(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.utils.PreferenceHelper p0) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupTheme() {
    }
    
    private final void setupSharedPreferences() {
    }
    
    private final void createDialog() {
    }
    
    @java.lang.Override()
    public void onDestinationChanged(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController controller, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDestination destination, @org.jetbrains.annotations.Nullable()
    android.os.Bundle arguments) {
    }
    
    private final void showBtmNavBar() {
    }
    
    private final void hideBtmNavBar() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onNavigationItemReselected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showAboutDialog() {
    }
    
    @java.lang.Override()
    public void isNetworkActive(boolean isActive) {
    }
    
    private final void hideNoInternetMessage() {
    }
    
    private final void showNoInternetMessage() {
    }
    
    private final void showDialog() {
    }
    
    @java.lang.Override()
    public void onDialogThemeBtnClick(@org.jetbrains.annotations.NotNull()
    java.lang.String themeName) {
    }
    
    private final void changeTheme(java.lang.String themeName) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void hideViewOrShowViews(int visibility) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void showSearchDialog(android.view.View view) {
    }
    
    @java.lang.Override()
    protected boolean shouldUseDataBinding() {
        return false;
    }
    
    public MainActivity() {
        super();
    }
}