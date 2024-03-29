// Generated by Dagger (https://dagger.dev).
package com.sagarock101.categories.data.remoteSource;

import com.sagarock101.categories.data.SourceService;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SourceRemoteSource_Factory implements Factory<SourceRemoteSource> {
  private final Provider<SourceService> sourceServiceProvider;

  public SourceRemoteSource_Factory(Provider<SourceService> sourceServiceProvider) {
    this.sourceServiceProvider = sourceServiceProvider;
  }

  @Override
  public SourceRemoteSource get() {
    return newInstance(sourceServiceProvider.get());
  }

  public static SourceRemoteSource_Factory create(Provider<SourceService> sourceServiceProvider) {
    return new SourceRemoteSource_Factory(sourceServiceProvider);
  }

  public static SourceRemoteSource newInstance(SourceService sourceService) {
    return new SourceRemoteSource(sourceService);
  }
}
