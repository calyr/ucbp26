package com.ucb.app.movie.presentation.viewmodel

import com.ucb.app.login.domain.usecase.DoLoginUseCase
import com.ucb.app.login.presentation.viewmodel.LoginViewModel
import io.mockative.mock
import io.mockative.of
import kotlinx.coroutines.test.runTest
import app.cash.turbine.test
import com.ucb.app.login.presentation.state.LoginUiState
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class MovieViewModelTest {
    private val useCase = mock(of<DoLoginUseCase>())
    private val viewModel = LoginViewModel(useCase)
    @Test
    fun `should emit Loading when logi fails`() = runTest {
        viewModel.state.test {
            val initialState = awaitItem()
            assertFalse(initialState.isLoading)
        }
    }
}