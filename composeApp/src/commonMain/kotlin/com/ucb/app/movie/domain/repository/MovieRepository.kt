package com.ucb.app.movie.domain.repository

import com.ucb.app.movie.domain.model.MovieModel
import io.mockative.Mockable

@Mockable
interface MovieRepository {
    suspend fun getMovies(): List<MovieModel>
}