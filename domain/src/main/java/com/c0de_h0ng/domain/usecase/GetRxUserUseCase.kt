package com.c0de_h0ng.domain.usecase

import com.c0de_h0ng.domain.model.User
import com.c0de_h0ng.domain.repository.GitHubRepository
import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
class GetRxUserUseCase @Inject constructor(
    private val repository: GitHubRepository
) : UseCase<String, List<User>>() {

    fun execute(searchWord: String): Flowable<List<User>> {
        return repository.getRxUserList(searchWord).subscribeOn(Schedulers.io())
    }

    override fun buildUseCaseFlowable(param: String): Flowable<List<User>> {
        return repository.getRxUserList(param).subscribeOn(Schedulers.io())
    }
}