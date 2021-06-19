// Generated by Dagger (https://dagger.dev).
package com.sagarock101.newsheadlines.data.remote;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SectionRemoteSource_Factory implements Factory<SectionRemoteSource> {
  private final Provider<SectionService> sectionServiceProvider;

  public SectionRemoteSource_Factory(Provider<SectionService> sectionServiceProvider) {
    this.sectionServiceProvider = sectionServiceProvider;
  }

  @Override
  public SectionRemoteSource get() {
    return newInstance(sectionServiceProvider.get());
  }

  public static SectionRemoteSource_Factory create(
      Provider<SectionService> sectionServiceProvider) {
    return new SectionRemoteSource_Factory(sectionServiceProvider);
  }

  public static SectionRemoteSource newInstance(SectionService sectionService) {
    return new SectionRemoteSource(sectionService);
  }
}