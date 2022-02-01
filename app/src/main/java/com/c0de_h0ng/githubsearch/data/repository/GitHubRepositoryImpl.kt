package com.c0de_h0ng.githubsearch.data.repository

import com.c0de_h0ng.githubsearch.data.datasource.RemoteDatSource
import com.c0de_h0ng.githubsearch.data.remote.dto.UserDto
import com.c0de_h0ng.githubsearch.domain.repository.GitHubRepository
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
class GitHubRepositoryImpl @Inject constructor(
    private val remote: RemoteDatSource
) : GitHubRepository {

    override suspend fun getUserList(searchWord: String): UserDto {
        return remote.getUserList(searchWord)
    }

    override fun getRxUserList(searchWord: String): Observable<UserDto> {
        return remote.getRxUserList(searchWord).subscribeOn(Schedulers.io())
    }

}