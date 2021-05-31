package com.sagarock101.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/sagarock101/core/utils/BindingUtils;", "", "()V", "getElapsedTime", "", "utcTimeString", "", "getSourceAndTime", "sourceName", "date", "Ljava/sql/Timestamp;", "core_release"})
public final class BindingUtils {
    public static final com.sagarock101.core.utils.BindingUtils INSTANCE = null;
    
    /**
     * @param utcTimeString Time in UTC:+00 - Example: 2018-05-10T10:13:00Z
     * @return Formatted String of time elapsed by now in min/hrs/days
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getElapsedTime(long utcTimeString) {
        return null;
    }
    
    /**
     * Utility method for fetching formatted News Source and Time
     *
     * @param sourceName Article source name
     * @param date       Publish date of article
     * @return Formatted outputted Example: **CNN • 7h**
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getSourceAndTime(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceName, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp date) {
        return null;
    }
    
    private BindingUtils() {
        super();
    }
}