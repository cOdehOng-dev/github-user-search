package com.c0de_h0ng.data.remote;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001b\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/c0de_h0ng/data/remote/GitHubApi;", "", "getRxUserList", "Lio/reactivex/Flowable;", "Lcom/c0de_h0ng/data/remote/dto/UserDto;", "searchUser", "", "getUserList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface GitHubApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getUserList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchUser, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.c0de_h0ng.data.remote.dto.UserDto> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users")
    public abstract io.reactivex.Flowable<com.c0de_h0ng.data.remote.dto.UserDto> getRxUserList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchUser);
}