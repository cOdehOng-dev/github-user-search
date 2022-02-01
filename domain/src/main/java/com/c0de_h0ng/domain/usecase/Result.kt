package com.c0de_h0ng.domain.usecase

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T?) : Result<T>()
    data class Error(val exception: String?, val errorCode: Int = 500) : Result<Nothing>()
    data class Loading(val isLoading: Boolean) : Result<Nothing>()
}
