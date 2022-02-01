package com.c0de_h0ng.domain.repository;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/c0de_h0ng/domain/repository/GitHubRepository;", "", "getRxUserList", "Lio/reactivex/Flowable;", "", "Lcom/c0de_h0ng/domain/model/User;", "searchWord", "", "getUserList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface GitHubRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.c0de_h0ng.domain.model.User>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<com.c0de_h0ng.domain.model.User>> getRxUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord);
}