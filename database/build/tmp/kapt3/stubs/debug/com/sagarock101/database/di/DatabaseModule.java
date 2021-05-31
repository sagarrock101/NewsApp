package com.sagarock101.database.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/sagarock101/database/di/DatabaseModule;", "", "()V", "provideDao", "Lcom/sagarock101/database/NewsDao;", "newsDatabase", "Lcom/sagarock101/database/NewsDatabase;", "provideNewsDatabase", "application", "Landroid/app/Application;", "provideNewsDatabaseRepo", "Lcom/sagarock101/database/NewsDatabaseRepo;", "dao", "database_debug"})
@dagger.Module(includes = {com.sagarock101.core.di.CoreDataModule.class})
public final class DatabaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.database.NewsDatabase provideNewsDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.database.NewsDao provideDao(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.NewsDatabase newsDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sagarock101.database.NewsDatabaseRepo provideNewsDatabaseRepo(@org.jetbrains.annotations.NotNull()
    com.sagarock101.database.NewsDao dao) {
        return null;
    }
    
    public DatabaseModule() {
        super();
    }
}