package com.c0de_h0ng.data.repository;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/c0de_h0ng/data/repository/GitHubRepositoryImpl;", "Lcom/c0de_h0ng/domain/repository/GitHubRepository;", "remote", "Lcom/c0de_h0ng/data/datasource/RemoteDatSource;", "(Lcom/c0de_h0ng/data/datasource/RemoteDatSource;)V", "getRxUserList", "Lio/reactivex/Flowable;", "", "Lcom/c0de_h0ng/domain/model/User;", "searchWord", "", "getUserList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class GitHubRepositoryImpl implements com.c0de_h0ng.domain.repository.GitHubRepository {
    private final com.c0de_h0ng.data.datasource.RemoteDatSource remote = null;
    
    @javax.inject.Inject()
    public GitHubRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.data.datasource.RemoteDatSource remote) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.c0de_h0ng.domain.model.User>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.c0de_h0ng.domain.model.User>> getRxUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord) {
        return null;
    }
}