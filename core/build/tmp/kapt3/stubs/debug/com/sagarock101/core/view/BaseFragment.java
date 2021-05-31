package com.sagarock101.core.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H$J&\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/sagarock101/core/view/BaseFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/sagarock101/core/reciever/NetworkChangeReceiver$NetworkChangeListener;", "()V", "fragmentArguments", "Landroid/os/Bundle;", "getFragmentArguments", "()Landroid/os/Bundle;", "networkChangeReceiver", "Lcom/sagarock101/core/reciever/NetworkChangeReceiver;", "getNetworkChangeReceiver", "()Lcom/sagarock101/core/reciever/NetworkChangeReceiver;", "setNetworkChangeReceiver", "(Lcom/sagarock101/core/reciever/NetworkChangeReceiver;)V", "bindView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCreateView", "savedInstanceState", "onPause", "", "onResume", "onViewCreated", "view", "searchIcon", "showIcon", "", "Companion", "core_debug"})
public abstract class BaseFragment extends dagger.android.support.DaggerFragment implements com.sagarock101.core.reciever.NetworkChangeReceiver.NetworkChangeListener {
    @org.jetbrains.annotations.NotNull()
    public com.sagarock101.core.reciever.NetworkChangeReceiver networkChangeReceiver;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String TAG = "com.sagarock101.core.view.BaseFragment";
    public static final com.sagarock101.core.view.BaseFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sagarock101.core.reciever.NetworkChangeReceiver getNetworkChangeReceiver() {
        return null;
    }
    
    public final void setNetworkChangeReceiver(@org.jetbrains.annotations.NotNull()
    com.sagarock101.core.reciever.NetworkChangeReceiver p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.os.Bundle getFragmentArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.view.View bindView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container);
    
    public final void searchIcon(boolean showIcon) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public BaseFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/sagarock101/core/view/BaseFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "core_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        public final void setTAG(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}