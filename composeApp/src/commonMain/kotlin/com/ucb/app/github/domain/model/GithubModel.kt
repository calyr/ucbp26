package com.ucb.app.github.domain.model

import com.ucb.app.github.vo.UrlImage

data class GithubModel(
    val name: String = "",
    val urlImage: UrlImage? = null,
    val avatar: String = "",
    val company: String = "",
    val bio: String = ""
)