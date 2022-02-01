package com.c0de_h0ng.presentation.di;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/c0de_h0ng/presentation/di/AppModule;", "", "()V", "provideGitHubApi", "Lcom/c0de_h0ng/data/remote/GitHubApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideGitHubRepository", "Lcom/c0de_h0ng/domain/repository/GitHubRepository;", "remote", "Lcom/c0de_h0ng/data/datasource/RemoteDatSource;", "provideOkHttp", "provideRemoteDataSource", "api", "presentation_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.c0de_h0ng.presentation.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.c0de_h0ng.data.remote.GitHubApi provideGitHubApi(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.c0de_h0ng.data.datasource.RemoteDatSource provideRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.data.remote.GitHubApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.c0de_h0ng.domain.repository.GitHubRepository provideGitHubRepository(@org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.data.datasource.RemoteDatSource remote) {
        return null;
    }
}