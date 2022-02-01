package com.c0de_h0ng.githubsearch.domain.usecase

import com.c0de_h0ng.githubsearch.common.CallResult
import com.c0de_h0ng.githubsearch.data.remote.dto.toUserList
import com.c0de_h0ng.githubsearch.domain.model.User
import com.c0de_h0ng.githubsearch.domain.repository.GitHubRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
class GetUserUseCase @Inject constructor(
    private val repository: GitHubRepository
) {

    operator fun invoke(searchUser: String): Flow<CallResult<List<User>>> = flow {
        try {
            val userList = repository.getUserList(searchUser).toUserList()
            emit(CallResult.Success(userList))
        } catch (e: HttpException) {
            emit(CallResult.Error(e.localizedMessage ?: "An unexpected error occured", 400))
        } catch (e: IOException) {
            emit(CallResult.Error("Couldn't reach server. Check your internet", 400))
        } finally {
            emit(CallResult.Loading(isLoading = false))
        }
    }
}