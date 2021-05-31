package com.sagarock101.core.reciever;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/sagarock101/core/reciever/NetworkChangeReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "networkChangeListener", "Lcom/sagarock101/core/reciever/NetworkChangeReceiver$NetworkChangeListener;", "getNetworkChangeListener", "()Lcom/sagarock101/core/reciever/NetworkChangeReceiver$NetworkChangeListener;", "setNetworkChangeListener", "(Lcom/sagarock101/core/reciever/NetworkChangeReceiver$NetworkChangeListener;)V", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "onReceive", "", "intent", "Landroid/content/Intent;", "NetworkChangeListener", "core_release"})
public final class NetworkChangeReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.Nullable()
    private com.sagarock101.core.reciever.NetworkChangeReceiver.NetworkChangeListener networkChangeListener;
    
    @org.jetbrains.annotations.Nullable()
    public final com.sagarock101.core.reciever.NetworkChangeReceiver.NetworkChangeListener getNetworkChangeListener() {
        return null;
    }
    
    public final void setNetworkChangeListener(@org.jetbrains.annotations.Nullable()
    com.sagarock101.core.reciever.NetworkChangeReceiver.NetworkChangeListener p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final boolean isNetworkAvailable(android.content.Context context) {
        return false;
    }
    
    public NetworkChangeReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/sagarock101/core/reciever/NetworkChangeReceiver$NetworkChangeListener;", "", "isNetworkActive", "", "isActive", "", "core_release"})
    public static abstract interface NetworkChangeListener {
        
        public abstract void isNetworkActive(boolean isActive);
    }
}