package com.c0de_h0ng.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/c0de_h0ng/presentation/view/MainActivity;", "Lcom/c0de_h0ng/presentation/common/base/BaseActivity;", "Lcom/c0de_h0ng/presentation/databinding/ActivityMainBinding;", "Landroid/widget/TextView$OnEditorActionListener;", "()V", "layoutRes", "", "getLayoutRes", "()I", "viewModel", "Lcom/c0de_h0ng/presentation/view/MainViewModel;", "getViewModel", "()Lcom/c0de_h0ng/presentation/view/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeViewModel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEditorAction", "", "v", "Landroid/widget/TextView;", "actionId", "event", "Landroid/view/KeyEvent;", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.c0de_h0ng.presentation.common.base.BaseActivity<com.c0de_h0ng.presentation.databinding.ActivityMainBinding> implements android.widget.TextView.OnEditorActionListener {
    private final kotlin.Lazy viewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected int getLayoutRes() {
        return 0;
    }
    
    private final com.c0de_h0ng.presentation.view.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeViewModel() {
    }
    
    @java.lang.Override()
    public boolean onEditorAction(@org.jetbrains.annotations.NotNull()
    android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
}