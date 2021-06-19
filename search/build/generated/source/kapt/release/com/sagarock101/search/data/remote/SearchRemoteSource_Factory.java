// Generated by Dagger (https://dagger.dev).
package com.sagarock101.search.data.remote;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchRemoteSource_Factory implements Factory<SearchRemoteSource> {
  private final Provider<SearchService> searchServiceProvider;

  public SearchRemoteSource_Factory(Provider<SearchService> searchServiceProvider) {
    this.searchServiceProvider = searchServiceProvider;
  }

  @Override
  public SearchRemoteSource get() {
    return newInstance(searchServiceProvider.get());
  }

  public static SearchRemoteSource_Factory create(Provider<SearchService> searchServiceProvider) {
    return new SearchRemoteSource_Factory(searchServiceProvider);
  }

  public static SearchRemoteSource newInstance(SearchService searchService) {
    return new SearchRemoteSource(searchService);
  }
}