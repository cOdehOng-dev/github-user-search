package com.c0de_h0ng.data.datasource

import com.c0de_h0ng.data.remote.GitHubApi
import com.c0de_h0ng.data.remote.dto.UserDto
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
class RemoteDataSourceImpl @Inject constructor(
    private val api: GitHubApi
) : RemoteDatSource {

    override suspend fun getUserList(searchWord: String): UserDto {
        return api.getUserList(searchWord)
    }

    override fun getRxUserList(searchWord: String): Flowable<UserDto> {
        return api.getRxUserList(searchWord)
    }
}