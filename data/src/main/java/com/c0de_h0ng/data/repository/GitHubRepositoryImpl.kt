package com.c0de_h0ng.data.repository

import com.c0de_h0ng.data.datasource.RemoteDatSource
import com.c0de_h0ng.data.remote.dto.toUserList
import com.c0de_h0ng.domain.model.User
import com.c0de_h0ng.domain.repository.GitHubRepository
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
class GitHubRepositoryImpl @Inject constructor(
    private val remote: RemoteDatSource
) : GitHubRepository {

    override suspend fun getUserList(searchWord: String): List<User> {
        return remote.getUserList(searchWord).toUserList()
    }

    override fun getRxUserList(searchWord: String): Flowable<List<User>> {
        return remote.getRxUserList(searchWord).flatMap {
            Flowable.just(it.toUserList())
        }
    }

}