package com.c0de_h0ng.presentation.view;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00120\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/c0de_h0ng/presentation/view/MainViewModel;", "Lcom/c0de_h0ng/presentation/common/base/BaseViewModel;", "getUserUseCase", "Lcom/c0de_h0ng/domain/usecase/GetUserUseCase;", "getRxUserUseCase", "Lcom/c0de_h0ng/domain/usecase/GetRxUserUseCase;", "(Lcom/c0de_h0ng/domain/usecase/GetUserUseCase;Lcom/c0de_h0ng/domain/usecase/GetRxUserUseCase;)V", "_rxSearchResult", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/c0de_h0ng/domain/model/User;", "_searchResult", "Landroidx/lifecycle/MutableLiveData;", "rxSearchResult", "Landroidx/lifecycle/LiveData;", "getRxSearchResult", "()Landroidx/lifecycle/LiveData;", "rxSearchResultObserve", "Lcom/c0de_h0ng/domain/usecase/Result;", "searchResult", "getSearchResult", "", "searchWord", "", "presentation_debug"})
public final class MainViewModel extends com.c0de_h0ng.presentation.common.base.BaseViewModel {
    private final com.c0de_h0ng.domain.usecase.GetUserUseCase getUserUseCase = null;
    private final com.c0de_h0ng.domain.usecase.GetRxUserUseCase getRxUserUseCase = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.c0de_h0ng.domain.model.User>> _searchResult = null;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.c0de_h0ng.domain.model.User>> _rxSearchResult = null;
    private final androidx.lifecycle.MutableLiveData<com.c0de_h0ng.domain.usecase.Result<java.util.List<com.c0de_h0ng.domain.model.User>>> rxSearchResultObserve = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.domain.usecase.GetUserUseCase getUserUseCase, @org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.domain.usecase.GetRxUserUseCase getRxUserUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.c0de_h0ng.domain.model.User>> getSearchResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.c0de_h0ng.domain.model.User>> getRxSearchResult() {
        return null;
    }
    
    public final void getSearchResult(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord) {
    }
    
    public final void getRxSearchResult(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord) {
    }
}