package com.c0de_h0ng.presentation.common.base;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\rH\u0086\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005J\b\u0010\u0010\u001a\u00020\fH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/c0de_h0ng/presentation/common/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_isLoadingObservable", "Landroidx/lifecycle/MutableLiveData;", "", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "isLoadingObservable", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "invoke", "", "Lio/reactivex/disposables/Disposable;", "loadingProgress", "isLoading", "onCleared", "presentation_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoadingObservable = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoadingObservable() {
        return null;
    }
    
    public final void loadingProgress(boolean isLoading) {
    }
    
    public final void invoke(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}