package com.ucb.app.movie.domain.usecase

import com.ucb.app.github.vo.UrlImage
import com.ucb.app.movie.domain.model.MovieModel
import com.ucb.app.movie.domain.repository.MovieRepository
import io.mockative.coEvery
import io.mockative.mock
import io.mockative.of
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GetMovieUseCaseTest {

    private val repository = mock(of<MovieRepository>())

    @Test
    fun `should return movies when repository returns data `() = runTest {
        //arrange
        val useCase = GetMoviesUseCase(repository)
        val list = listOf(
            MovieModel("a","b", UrlImage("https://test.jpg")),
            MovieModel("a","b", UrlImage("https://test.jpg"))
        )
        coEvery { repository.getMovies() }.returns(list)

        //act
        val expect = useCase.invoke()

        //assert
        assertEquals(expect.size, list.size, "Not equals")
    }
}