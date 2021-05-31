package com.sagarock101.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\fJ\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bJ\u0014\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0007J\u001e\u0010\u0017\u001a\u00020\u0010*\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u00a8\u0006\u001e"}, d2 = {"Lcom/sagarock101/core/utils/Utils;", "", "()V", "getSpannable", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "strToChange", "", "size", "", "color", "", "start", "end", "refreshWidget", "", "className", "collectionId", "showToast", "msg", "truncateExtra", "content", "setOnSingleClickListener", "Landroid/view/View;", "clickListener", "Landroid/view/View$OnClickListener;", "interval", "", "OnSingleClickListener", "core_release"})
public final class Utils {
    public static final com.sagarock101.core.utils.Utils INSTANCE = null;
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String truncateExtra(@org.jetbrains.annotations.Nullable()
    java.lang.String content) {
        return null;
    }
    
    public final void setOnSingleClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setOnSingleClickListener, @org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener clickListener, long interval) {
    }
    
    public final void refreshWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String className, int collectionId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.SpannableString getSpannable(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String strToChange, float size, int color, int start, int end) {
        return null;
    }
    
    private Utils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/sagarock101/core/utils/Utils$OnSingleClickListener;", "Landroid/view/View$OnClickListener;", "clickListener", "intervalMs", "", "(Landroid/view/View$OnClickListener;J)V", "canClick", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onClick", "", "v", "Landroid/view/View;", "core_release"})
    public static final class OnSingleClickListener implements android.view.View.OnClickListener {
        private java.util.concurrent.atomic.AtomicBoolean canClick;
        private final android.view.View.OnClickListener clickListener = null;
        private final long intervalMs = 0L;
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public OnSingleClickListener(@org.jetbrains.annotations.NotNull()
        android.view.View.OnClickListener clickListener, long intervalMs) {
            super();
        }
    }
}