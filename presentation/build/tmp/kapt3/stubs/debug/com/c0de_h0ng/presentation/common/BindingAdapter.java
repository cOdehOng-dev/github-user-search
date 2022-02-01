package com.c0de_h0ng.presentation.common;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J8\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/c0de_h0ng/presentation/common/BindingAdapter;", "", "()V", "bindEditTextListener", "", "editText", "Landroid/widget/EditText;", "onEditorActionListener", "Landroid/widget/TextView$OnEditorActionListener;", "onFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "textWatcher", "Landroid/text/TextWatcher;", "bindImageUrl", "imageView", "Landroid/widget/ImageView;", "url", "", "bindRecyclerViewAdapter", "view", "Landroidx/recyclerview/widget/RecyclerView;", "listAdapter", "Lcom/c0de_h0ng/presentation/common/base/BaseListAdapter;", "list", "", "", "recyclerTouchListener", "Lcom/c0de_h0ng/presentation/common/RecyclerTouchListener;", "presentation_debug"})
public final class BindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final com.c0de_h0ng.presentation.common.BindingAdapter INSTANCE = null;
    
    private BindingAdapter() {
        super();
    }
    
    /**
     * EditText 설정
     */
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"editor_action", "focus_change", "text_watcher"}, requireAll = false)
    public static final void bindEditTextListener(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.Nullable()
    android.widget.TextView.OnEditorActionListener onEditorActionListener, @org.jetbrains.annotations.Nullable()
    android.view.View.OnFocusChangeListener onFocusChangeListener, @org.jetbrains.annotations.Nullable()
    android.text.TextWatcher textWatcher) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"recycler_view_adapter", "list_data", "touch"}, requireAll = false)
    public static final void bindRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    com.c0de_h0ng.presentation.common.base.BaseListAdapter<?> listAdapter, @org.jetbrains.annotations.Nullable()
    java.util.List list, @org.jetbrains.annotations.Nullable()
    com.c0de_h0ng.presentation.common.RecyclerTouchListener recyclerTouchListener) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"img_url"})
    public static final void bindImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
}