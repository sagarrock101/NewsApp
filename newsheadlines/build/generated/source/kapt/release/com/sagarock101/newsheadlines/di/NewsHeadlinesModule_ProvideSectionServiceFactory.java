// Generated by Dagger (https://dagger.dev).
package com.sagarock101.newsheadlines.di;

import com.sagarock101.newsheadlines.data.remote.SectionService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsHeadlinesModule_ProvideSectionServiceFactory implements Factory<SectionService> {
  private final NewsHeadlinesModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NewsHeadlinesModule_ProvideSectionServiceFactory(NewsHeadlinesModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public SectionService get() {
    return provideSectionService(module, retrofitProvider.get());
  }

  public static NewsHeadlinesModule_ProvideSectionServiceFactory create(NewsHeadlinesModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NewsHeadlinesModule_ProvideSectionServiceFactory(module, retrofitProvider);
  }

  public static SectionService provideSectionService(NewsHeadlinesModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideSectionService(retrofit));
  }
}