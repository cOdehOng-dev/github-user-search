package com.c0de_h0ng.githubsearch.domain.repository

import com.c0de_h0ng.githubsearch.data.remote.dto.UserDto
import io.reactivex.Observable

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
interface GitHubRepository {

    suspend fun getUserList(searchWord: String): UserDto
    fun getRxUserList(searchWord: String): Observable<UserDto>
}