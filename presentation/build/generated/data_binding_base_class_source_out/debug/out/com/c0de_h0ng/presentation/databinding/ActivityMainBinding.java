// Generated by data binding compiler. Do not edit!
package com.c0de_h0ng.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.c0de_h0ng.presentation.R;
import com.c0de_h0ng.presentation.view.MainViewModel;
import com.c0de_h0ng.presentation.view.RxJavaResultListAdapter;
import com.c0de_h0ng.presentation.view.customview.ClearEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final ClearEditText etSearch;

  @NonNull
  public final RecyclerView rvRxJava;

  @Bindable
  protected MainViewModel mVm;

  @Bindable
  protected RxJavaResultListAdapter mRxJavaResultListAdapter;

  @Bindable
  protected TextView.OnEditorActionListener mEditorActionListener;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ClearEditText etSearch, RecyclerView rvRxJava) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etSearch = etSearch;
    this.rvRxJava = rvRxJava;
  }

  public abstract void setVm(@Nullable MainViewModel vm);

  @Nullable
  public MainViewModel getVm() {
    return mVm;
  }

  public abstract void setRxJavaResultListAdapter(
      @Nullable RxJavaResultListAdapter rxJavaResultListAdapter);

  @Nullable
  public RxJavaResultListAdapter getRxJavaResultListAdapter() {
    return mRxJavaResultListAdapter;
  }

  public abstract void setEditorActionListener(
      @Nullable TextView.OnEditorActionListener editorActionListener);

  @Nullable
  public TextView.OnEditorActionListener getEditorActionListener() {
    return mEditorActionListener;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
