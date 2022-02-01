package com.c0de_h0ng.domain.usecase;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\u0006\u0010\f\u001a\u00020\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/c0de_h0ng/domain/usecase/GetRxUserUseCase;", "Lcom/c0de_h0ng/domain/usecase/UseCase;", "", "", "Lcom/c0de_h0ng/domain/model/User;", "repository", "Lcom/c0de_h0ng/domain/repository/GitHubRepository;", "(Lcom/c0de_h0ng/domain/repository/GitHubRepository;)V", "buildUseCaseFlowable", "Lio/reactivex/Flowable;", "param", "execute", "searchWord", "domain_debug"})
public final class GetRxUserUseCase extends com.c0de_h0ng.domain.usecase.UseCase<java.lang.String, java.util.List<? extends com.c0de_h0ng.domain.model.User>> {
    private final com.c0de_h0ng.domain.repository.GitHubRepository repository = null;
    
    @javax.inject.Inject()
    public GetRxUserUseCase(@org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.domain.repository.GitHubRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<com.c0de_h0ng.domain.model.User>> execute(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.c0de_h0ng.domain.model.User>> buildUseCaseFlowable(@org.jetbrains.annotations.NotNull()
    java.lang.String param) {
        return null;
    }
}