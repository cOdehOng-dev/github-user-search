package com.c0de_h0ng.presentation.common;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/c0de_h0ng/presentation/common/RxUseCase;", "R", "", "()V", "result", "Landroidx/lifecycle/MutableLiveData;", "Lcom/c0de_h0ng/presentation/common/CallResult;", "getResult", "()Landroidx/lifecycle/MutableLiveData;", "observe", "presentation_debug"})
public abstract class RxUseCase<R extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.c0de_h0ng.presentation.common.CallResult<R>> result = null;
    
    public RxUseCase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<com.c0de_h0ng.presentation.common.CallResult<R>> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.c0de_h0ng.presentation.common.CallResult<R>> observe() {
        return null;
    }
}