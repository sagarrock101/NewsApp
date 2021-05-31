package com.sagarock101.saved.ui.itemSelection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/sagarock101/saved/ui/itemSelection/MyItemKeyProvider;", "Landroidx/recyclerview/selection/ItemKeyProvider;", "Lcom/sagarock101/database/model/Articles;", "listItems", "", "(Ljava/util/List;)V", "getKey", "position", "", "getPosition", "key", "saved_release"})
public final class MyItemKeyProvider extends androidx.recyclerview.selection.ItemKeyProvider<com.sagarock101.database.model.Articles> {
    private final java.util.List<com.sagarock101.database.model.Articles> listItems = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.sagarock101.database.model.Articles getKey(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getPosition(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.model.Articles key) {
        return 0;
    }
    
    public MyItemKeyProvider(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sagarock101.database.model.Articles> listItems) {
        super(0);
    }
}