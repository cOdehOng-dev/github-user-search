package com.c0de_h0ng.githubsearch.domain.model

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
data class User(
    val id: Int,
    val login: String,
    val profileUrl: String,
    val htmlUrl: String,
    val reposUrl: String
)
