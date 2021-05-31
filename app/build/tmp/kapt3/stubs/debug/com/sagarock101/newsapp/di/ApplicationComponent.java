package com.sagarock101.newsapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H&\u00a8\u0006\u0007"}, d2 = {"Lcom/sagarock101/newsapp/di/ApplicationComponent;", "Ldagger/android/AndroidInjector;", "Lcom/sagarock101/newsapp/MyApplication;", "inject", "", "application", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.sagarock101.newsapp.di.ActivityBuildersModule.class, com.sagarock101.newsheadlines.di.NewsHeadlinesModule.class, com.sagarock101.categories.di.SourceDataModule.class, com.sagarock101.newsapp.di.ViewModelModule.class, com.sagarock101.database.di.DatabaseModule.class, com.sagarock101.newsheadlines.di.NewsViewModelModule.class, com.sagarock101.search.di.SearchModule.class, com.sagarock101.search.di.SearchViewModelModule.class, com.sagarock101.search.di.SearchBuildersModule.class, com.sagarock101.categories.di.SourceViewModelModule.class, com.sagarock101.widget.di.ServiceBuildersModule.class, com.sagarock101.widget.di.WidgetViewModelModule.class, com.sagarock101.widget.di.WidgetBuildersModule.class, com.sagarock101.saved.di.SavedNewsViewModelModule.class, com.sagarock101.saved.di.SavedFragmentsBuildersModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent extends dagger.android.AndroidInjector<com.sagarock101.newsapp.MyApplication> {
    
    @java.lang.Override()
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.sagarock101.newsapp.MyApplication application);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/sagarock101/newsapp/di/ApplicationComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/sagarock101/newsapp/di/ApplicationComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.sagarock101.newsapp.di.ApplicationComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.sagarock101.newsapp.di.ApplicationComponent build();
    }
}