package com.c0de_h0ng.presentation.view

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.c0de_h0ng.domain.model.User
import com.c0de_h0ng.domain.usecase.GetRxUserUseCase
import com.c0de_h0ng.domain.usecase.GetUserUseCase
import com.c0de_h0ng.domain.usecase.Result
import com.c0de_h0ng.presentation.common.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val getUserUseCase: GetUserUseCase,
    private val getRxUserUseCase: GetRxUserUseCase
) : BaseViewModel() {

    private val _searchResult = MutableLiveData<List<User>>()
    val searchResult: LiveData<List<User>>
        get() = _searchResult

    private val _rxSearchResult = MediatorLiveData<List<User>>()
    val rxSearchResult: LiveData<List<User>>
        get() = _rxSearchResult

    private val rxSearchResultObserve = getRxUserUseCase.observe()


    fun getSearchResult(searchWord: String) {
        getUserUseCase(searchWord).onEach { result ->
            when (result) {
                is Result.Success -> {
                    Log.d("CoroutineCallResult ", "Success")
                    _searchResult.value = result.data ?: emptyList()
                }
                is Result.Error -> {
                    Log.d("CoroutineCallResult ", "Error")

                }
                is Result.Loading -> {
                    Log.d("CoroutineCallResult ", "Loading")

                }
            }
        }.launchIn(viewModelScope)
    }

    fun getRxSearchResult(searchWord: String) {
        this(getRxUserUseCase(searchWord))
        _rxSearchResult.addSource(rxSearchResultObserve) {
            when (it) {
                is Result.Success -> {
                    Log.d("RxJavaCallResult ", "Success")
                    val user = it.data
                    user?.let { userData ->
                        _rxSearchResult.value = userData
                    }
                }
                is Result.Error -> {
                    Log.d("RxJavaCallResult ", "Error")
                }
                is Result.Loading -> {
                    loadingProgress(it.isLoading)
                    Log.d("RxJavaCallResult ", "Loading")
                }
            }
        }
    }

}