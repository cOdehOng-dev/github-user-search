package com.c0de_h0ng.presentation.common.base;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\u0017\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0013R\u001c\u0010\n\u001a\u00028\u0001X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/c0de_h0ng/presentation/common/base/BaseViewHolder;", "T", "B", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "layoutRes", "", "parent", "Landroid/view/ViewGroup;", "(ILandroid/view/ViewGroup;)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "bind", "", "data", "(Ljava/lang/Object;)V", "presentation_debug"})
public abstract class BaseViewHolder<T extends java.lang.Object, B extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private B binding;
    
    public BaseViewHolder(@androidx.annotation.LayoutRes()
    int layoutRes, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final B getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    public abstract void bind(T data);
}