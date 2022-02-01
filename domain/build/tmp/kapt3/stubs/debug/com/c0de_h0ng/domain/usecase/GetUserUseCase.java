package com.c0de_h0ng.domain.usecase;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/c0de_h0ng/domain/usecase/GetUserUseCase;", "", "repository", "Lcom/c0de_h0ng/domain/repository/GitHubRepository;", "(Lcom/c0de_h0ng/domain/repository/GitHubRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/c0de_h0ng/domain/usecase/Result;", "", "Lcom/c0de_h0ng/domain/model/User;", "searchUser", "", "domain_debug"})
public final class GetUserUseCase {
    private final com.c0de_h0ng.domain.repository.GitHubRepository repository = null;
    
    @javax.inject.Inject()
    public GetUserUseCase(@org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.domain.repository.GitHubRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.c0de_h0ng.domain.usecase.Result<java.util.List<com.c0de_h0ng.domain.model.User>>> invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String searchUser) {
        return null;
    }
}