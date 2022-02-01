package com.c0de_h0ng.presentation.common;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/c0de_h0ng/presentation/common/RecyclerItemListener;", "Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;", "touchListener", "Lcom/c0de_h0ng/presentation/common/RecyclerTouchListener;", "(Lcom/c0de_h0ng/presentation/common/RecyclerTouchListener;)V", "onInterceptTouchEvent", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroid/view/MotionEvent;", "onRequestDisallowInterceptTouchEvent", "", "disallowIntercept", "onTouchEvent", "presentation_debug"})
public final class RecyclerItemListener implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
    private final com.c0de_h0ng.presentation.common.RecyclerTouchListener touchListener = null;
    
    public RecyclerItemListener(@org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.presentation.common.RecyclerTouchListener touchListener) {
        super();
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override()
    public void onTouchEvent(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
    }
    
    @java.lang.Override()
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }
}