package com.c0de_h0ng.presentation.common.base;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u0002H\u0001\u0012\u0002\b\u00030\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010J\u001b\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\fJ\u0013\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\u00020\f2\u0010\u0010\u001c\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u001e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/c0de_h0ng/presentation/common/base/BaseListAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/c0de_h0ng/presentation/common/base/BaseViewHolder;", "()V", "itemList", "", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "add", "", "data", "(Ljava/lang/Object;)V", "addAll", "", "change", "position", "", "(ILjava/lang/Object;)V", "clear", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "insert", "(Ljava/lang/Object;I)V", "onBindViewHolder", "holder", "remove", "setList", "presentation_debug"})
public abstract class BaseListAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.c0de_h0ng.presentation.common.base.BaseViewHolder<T, ?>> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<T> itemList;
    
    public BaseListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<T> getItemList() {
        return null;
    }
    
    protected final void setItemList(@org.jetbrains.annotations.NotNull()
    java.util.List<T> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.c0de_h0ng.presentation.common.base.BaseViewHolder<T, ?> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> data) {
    }
    
    public final void add(T data) {
    }
    
    public final void addAll(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> data) {
    }
    
    public final T getItem(int position) {
        return null;
    }
    
    public final void insert(T data, int position) {
    }
    
    public final void remove(int position) {
    }
    
    public final void change(int position, T data) {
    }
    
    public final void clear() {
    }
}