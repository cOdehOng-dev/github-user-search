package com.c0de_h0ng.data.datasource

import com.c0de_h0ng.data.remote.dto.UserDto
import io.reactivex.Flowable

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
interface RemoteDatSource {
    suspend fun getUserList(searchWord: String): UserDto
    fun getRxUserList(searchWord: String): Flowable<UserDto>
}