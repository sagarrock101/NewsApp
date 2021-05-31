// Generated by Dagger (https://dagger.dev).
package com.sagarock101.newsheadlines.di;

import com.sagarock101.newsheadlines.data.NewsHeadlinesRepo;
import com.sagarock101.newsheadlines.data.remote.NewsHeadLinesRemoteSource;
import com.sagarock101.newsheadlines.data.remote.SectionRemoteSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsHeadlinesModule_ProvideNewsHeadlinesRepoFactory implements Factory<NewsHeadlinesRepo> {
  private final NewsHeadlinesModule module;

  private final Provider<NewsHeadLinesRemoteSource> newsHeadLinesRemoteSourceProvider;

  private final Provider<SectionRemoteSource> sectionRemoteSourceProvider;

  public NewsHeadlinesModule_ProvideNewsHeadlinesRepoFactory(NewsHeadlinesModule module,
      Provider<NewsHeadLinesRemoteSource> newsHeadLinesRemoteSourceProvider,
      Provider<SectionRemoteSource> sectionRemoteSourceProvider) {
    this.module = module;
    this.newsHeadLinesRemoteSourceProvider = newsHeadLinesRemoteSourceProvider;
    this.sectionRemoteSourceProvider = sectionRemoteSourceProvider;
  }

  @Override
  public NewsHeadlinesRepo get() {
    return provideNewsHeadlinesRepo(module, newsHeadLinesRemoteSourceProvider.get(), sectionRemoteSourceProvider.get());
  }

  public static NewsHeadlinesModule_ProvideNewsHeadlinesRepoFactory create(
      NewsHeadlinesModule module,
      Provider<NewsHeadLinesRemoteSource> newsHeadLinesRemoteSourceProvider,
      Provider<SectionRemoteSource> sectionRemoteSourceProvider) {
    return new NewsHeadlinesModule_ProvideNewsHeadlinesRepoFactory(module, newsHeadLinesRemoteSourceProvider, sectionRemoteSourceProvider);
  }

  public static NewsHeadlinesRepo provideNewsHeadlinesRepo(NewsHeadlinesModule instance,
      NewsHeadLinesRemoteSource newsHeadLinesRemoteSource,
      SectionRemoteSource sectionRemoteSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideNewsHeadlinesRepo(newsHeadLinesRemoteSource, sectionRemoteSource));
  }
}
