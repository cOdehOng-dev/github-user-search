package com.c0de_h0ng.presentation.common

import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.c0de_h0ng.presentation.common.base.BaseListAdapter

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
object BindingAdapter {

    /**
     * EditText 설정
     */
    @BindingAdapter(value = ["editor_action", "focus_change", "text_watcher"], requireAll = false)
    @JvmStatic
    fun bindEditTextListener(
        editText: EditText,
        onEditorActionListener: TextView.OnEditorActionListener?,
        onFocusChangeListener: View.OnFocusChangeListener?,
        textWatcher: TextWatcher?
    ) {
        onEditorActionListener?.let { editText.setOnEditorActionListener(it) }
        onFocusChangeListener?.let { editText.onFocusChangeListener = it }
        textWatcher?.let { editText.addTextChangedListener(it) }
    }

    @BindingAdapter(value = ["recycler_view_adapter", "list_data", "touch"], requireAll = false)
    @JvmStatic
    fun bindRecyclerViewAdapter(view: RecyclerView, listAdapter: BaseListAdapter<*>?, list: List<Nothing>?, recyclerTouchListener: RecyclerTouchListener?) {
        listAdapter?.let { adapter ->
            view.adapter = adapter
            adapter.addAll(list)
        }
        recyclerTouchListener?.let { view.addOnItemTouchListener(RecyclerItemListener(it)) }
    }

    @BindingAdapter("img_url")
    @JvmStatic
    fun bindImageUrl(imageView: ImageView, url: String?) {
        Glide.with(imageView.context)
            .load(url)
            .circleCrop()
            .into(imageView)
    }

}