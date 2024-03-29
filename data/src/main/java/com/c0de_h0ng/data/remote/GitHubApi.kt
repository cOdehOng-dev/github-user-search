package com.c0de_h0ng.data.remote

import com.c0de_h0ng.data.remote.dto.UserDto
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
interface GitHubApi {

    @GET("users")
    suspend fun getUserList(
        @Query("q") searchUser: String
    ) : UserDto

    @GET("users")
    fun getRxUserList(
        @Query("q") searchUser: String
    ) : Flowable<UserDto>

}