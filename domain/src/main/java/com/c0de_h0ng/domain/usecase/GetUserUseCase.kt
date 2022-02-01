package com.c0de_h0ng.domain.usecase

import com.c0de_h0ng.domain.model.User
import com.c0de_h0ng.domain.repository.GitHubRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
class GetUserUseCase @Inject constructor(
    private val repository: GitHubRepository
) {

    operator fun invoke(searchUser: String): Flow<Result<List<User>>> = flow {
        try {
            val userList = repository.getUserList(searchUser)
            emit(Result.Success(userList))
        } catch (e: HttpException) {
            emit(Result.Error(e.localizedMessage ?: "An unexpected error occured", 400))
        } catch (e: IOException) {
            emit(Result.Error("Couldn't reach server. Check your internet", 400))
        } finally {
            emit(Result.Loading(isLoading = false))
        }
    }
}