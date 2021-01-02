package com.sagarock101.newsapp.di

import com.sagarock101.newsheadlines.di.NewsHeadlinesModule
import dagger.Module

@Module(
    includes = [
    NewsHeadlinesModule::class
    ]
)
class AppModule {

}