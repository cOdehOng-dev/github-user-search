package com.c0de_h0ng.domain.model

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
data class User(
    val id: Int,
    val login: String,
    val profileUrl: String,
    val htmlUrl: String,
    val reposUrl: String
)
