package com.c0de_h0ng.presentation.databinding;
import com.c0de_h0ng.presentation.R;
import com.c0de_h0ng.presentation.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.LinearLayoutCompat mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.c0de_h0ng.presentation.view.customview.ClearEditText) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.etSearch.setTag(null);
        this.mboundView0 = (androidx.appcompat.widget.LinearLayoutCompat) bindings[0];
        this.mboundView0.setTag(null);
        this.rvRxJava.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.c0de_h0ng.presentation.view.MainViewModel) variable);
        }
        else if (BR.rxJavaResultListAdapter == variableId) {
            setRxJavaResultListAdapter((com.c0de_h0ng.presentation.view.RxJavaResultListAdapter) variable);
        }
        else if (BR.editorActionListener == variableId) {
            setEditorActionListener((android.widget.TextView.OnEditorActionListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.c0de_h0ng.presentation.view.MainViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setRxJavaResultListAdapter(@Nullable com.c0de_h0ng.presentation.view.RxJavaResultListAdapter RxJavaResultListAdapter) {
        this.mRxJavaResultListAdapter = RxJavaResultListAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.rxJavaResultListAdapter);
        super.requestRebind();
    }
    public void setEditorActionListener(@Nullable android.widget.TextView.OnEditorActionListener EditorActionListener) {
        this.mEditorActionListener = EditorActionListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.editorActionListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmRxSearchResult((androidx.lifecycle.LiveData<java.util.List<com.c0de_h0ng.domain.model.User>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmRxSearchResult(androidx.lifecycle.LiveData<java.util.List<com.c0de_h0ng.domain.model.User>> VmRxSearchResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.c0de_h0ng.presentation.view.MainViewModel vm = mVm;
        com.c0de_h0ng.presentation.view.RxJavaResultListAdapter rxJavaResultListAdapter = mRxJavaResultListAdapter;
        android.widget.TextView.OnEditorActionListener editorActionListener = mEditorActionListener;
        androidx.lifecycle.LiveData<java.util.List<com.c0de_h0ng.domain.model.User>> vmRxSearchResult = null;
        java.util.List<com.c0de_h0ng.domain.model.User> vmRxSearchResultGetValue = null;

        if ((dirtyFlags & 0x17L) != 0) {



                if (vm != null) {
                    // read vm.rxSearchResult
                    vmRxSearchResult = vm.getRxSearchResult();
                }
                updateLiveDataRegistration(0, vmRxSearchResult);


                if (vmRxSearchResult != null) {
                    // read vm.rxSearchResult.getValue()
                    vmRxSearchResultGetValue = vmRxSearchResult.getValue();
                }
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.c0de_h0ng.presentation.common.BindingAdapter.bindEditTextListener(this.etSearch, editorActionListener, (android.view.View.OnFocusChangeListener)null, (android.text.TextWatcher)null);
        }
        if ((dirtyFlags & 0x17L) != 0) {
            // api target 1

            com.c0de_h0ng.presentation.common.BindingAdapter.bindRecyclerViewAdapter(this.rvRxJava, rxJavaResultListAdapter, vmRxSearchResultGetValue, (com.c0de_h0ng.presentation.common.RecyclerTouchListener)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.rxSearchResult
        flag 1 (0x2L): vm
        flag 2 (0x3L): rxJavaResultListAdapter
        flag 3 (0x4L): editorActionListener
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}