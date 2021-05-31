package com.sagarock101.database.converters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/sagarock101/database/converters/TypeConverterForTimeStamp;", "", "()V", "toDatabaseTimestamp", "", "timestamp", "Ljava/sql/Timestamp;", "(Ljava/sql/Timestamp;)Ljava/lang/Long;", "toTimestamp", "(Ljava/lang/Long;)Ljava/sql/Timestamp;", "database_release"})
public final class TypeConverterForTimeStamp {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.sql.Timestamp toTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.Long toDatabaseTimestamp(@org.jetbrains.annotations.Nullable()
    java.sql.Timestamp timestamp) {
        return null;
    }
    
    public TypeConverterForTimeStamp() {
        super();
    }
}