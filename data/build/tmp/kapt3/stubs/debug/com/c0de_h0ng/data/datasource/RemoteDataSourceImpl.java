package com.c0de_h0ng.data.datasource;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0019\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/c0de_h0ng/data/datasource/RemoteDataSourceImpl;", "Lcom/c0de_h0ng/data/datasource/RemoteDatSource;", "api", "Lcom/c0de_h0ng/data/remote/GitHubApi;", "(Lcom/c0de_h0ng/data/remote/GitHubApi;)V", "getRxUserList", "Lio/reactivex/Flowable;", "Lcom/c0de_h0ng/data/remote/dto/UserDto;", "searchWord", "", "getUserList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class RemoteDataSourceImpl implements com.c0de_h0ng.data.datasource.RemoteDatSource {
    private final com.c0de_h0ng.data.remote.GitHubApi api = null;
    
    @javax.inject.Inject()
    public RemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.data.remote.GitHubApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.c0de_h0ng.data.remote.dto.UserDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.c0de_h0ng.data.remote.dto.UserDto> getRxUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord) {
        return null;
    }
}