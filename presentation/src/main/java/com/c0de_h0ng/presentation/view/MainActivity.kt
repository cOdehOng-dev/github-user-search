package com.c0de_h0ng.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.activity.viewModels
import com.c0de_h0ng.presentation.R
import com.c0de_h0ng.presentation.common.base.BaseActivity
import com.c0de_h0ng.presentation.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(), TextView.OnEditorActionListener {

    override val layoutRes: Int
        get() = R.layout.activity_main

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.editorActionListener = this
        observeViewModel()
        viewModel.getSearchResult("mike")
    }

    private fun observeViewModel() {
        binding.vm = viewModel
        with(viewModel) {
            // Coroutine
            searchResult.observe(this@MainActivity) {
                Log.d("CoroutineResult Size", it.count().toString())
            }
            // RxJava
            rxSearchResult.observe(this@MainActivity) {
                binding.rxJavaResultListAdapter = RxJavaResultListAdapter()
            }

            // Loading
            isLoadingObservable.observe(this@MainActivity) {
                when {
                    it -> showLoadingDialog()
                    else -> hideLoadingDialog()
                }
            }
        }
    }

    override fun onEditorAction(v: TextView, actionId: Int, event: KeyEvent?): Boolean {
        if (v.id == R.id.et_search && actionId == EditorInfo.IME_ACTION_DONE) {
            Log.d("Search Start", "")
            viewModel.getRxSearchResult(binding.etSearch.text.toString())
        }
        return false
    }

}