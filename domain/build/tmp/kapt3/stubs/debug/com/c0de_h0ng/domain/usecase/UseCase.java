package com.c0de_h0ng.domain.usecase;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\n\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/c0de_h0ng/domain/usecase/UseCase;", "T", "", "R", "()V", "result", "Landroidx/lifecycle/MutableLiveData;", "Lcom/c0de_h0ng/domain/usecase/Result;", "buildUseCaseFlowable", "Lio/reactivex/Flowable;", "param", "(Ljava/lang/Object;)Lio/reactivex/Flowable;", "invoke", "Lio/reactivex/disposables/Disposable;", "t", "(Ljava/lang/Object;)Lio/reactivex/disposables/Disposable;", "observe", "domain_debug"})
public abstract class UseCase<T extends java.lang.Object, R extends java.lang.Object> {
    private final androidx.lifecycle.MutableLiveData<com.c0de_h0ng.domain.usecase.Result<R>> result = null;
    
    public UseCase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.c0de_h0ng.domain.usecase.Result<R>> observe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable invoke(@org.jetbrains.annotations.NotNull()
    T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<R> buildUseCaseFlowable(@org.jetbrains.annotations.NotNull()
    T param);
}