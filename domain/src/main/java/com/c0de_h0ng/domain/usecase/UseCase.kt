package com.c0de_h0ng.domain.usecase

import android.util.Log
import androidx.lifecycle.MutableLiveData
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
abstract class UseCase<T: Any, R: Any> {
    private val result = MutableLiveData<Result<R>>()
    fun observe() = result

    operator fun invoke(t: T): Disposable {
        return buildUseCaseFlowable(t)
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe {
                result.value = Result.Loading(true)
            }
            .doOnTerminate {
                result.value = Result.Loading(false)
            }
            .subscribe({
                Log.d("Result >>> ", "Success")
                result.value = Result.Success(it)
            }, {
                Log.d("Result >>> ", it.localizedMessage ?: "An unexpected error occured")
                result.value = Result.Error(it.localizedMessage ?: "An unexpected error occured", 400)
            })
    }

    abstract fun buildUseCaseFlowable(param: T): Flowable<R>

}