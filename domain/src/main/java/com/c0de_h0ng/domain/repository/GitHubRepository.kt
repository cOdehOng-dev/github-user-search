package com.c0de_h0ng.domain.repository

import com.c0de_h0ng.domain.model.User
import io.reactivex.Flowable

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
interface GitHubRepository {

    suspend fun getUserList(searchWord: String): List<User>
    fun getRxUserList(searchWord: String): Flowable<List<User>>
}