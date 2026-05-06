package com.ucb.app.movie.domain.model

import com.ucb.app.github.vo.UrlImage

data class MovieModel(
    val description: String,
    val title: String,
    val pathUrl: UrlImage
)