package com.sagarock101.core.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/sagarock101/core/view/BaseActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "Lcom/sagarock101/core/reciever/NetworkChangeReceiver$NetworkChangeListener;", "()V", "layout", "", "getLayout", "()I", "networkChangeReceiver", "Lcom/sagarock101/core/reciever/NetworkChangeReceiver;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar$core_debug", "()Landroid/widget/ProgressBar;", "setProgressBar$core_debug", "(Landroid/widget/ProgressBar;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "shouldUseDataBinding", "", "Companion", "core_debug"})
public abstract class BaseActivity extends dagger.android.support.DaggerAppCompatActivity implements com.sagarock101.core.reciever.NetworkChangeReceiver.NetworkChangeListener {
    private com.sagarock101.core.reciever.NetworkChangeReceiver networkChangeReceiver;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ProgressBar progressBar;
    public static final com.sagarock101.core.view.BaseActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar$core_debug() {
        return null;
    }
    
    public final void setProgressBar$core_debug(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    public abstract int getLayout();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * @return true if child activity should use data binding instead of [.setContentView]
     */
    protected boolean shouldUseDataBinding() {
        return false;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/sagarock101/core/view/BaseActivity$Companion;", "", "()V", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}