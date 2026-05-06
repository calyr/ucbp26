package com.ucb.app.github.data.mapper

import com.ucb.app.github.data.dto.UserDto
import com.ucb.app.github.domain.model.GithubModel
import com.ucb.app.github.vo.UrlImage

fun UserDto.toModel() = GithubModel(
    name = name?:"",
    urlImage = UrlImage(avatarUrl),
    avatar = login,
    bio = bio ?: "",
    company = company ?: ""
)