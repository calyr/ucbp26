package com.ucb.app.login.domain.usecase

import com.ucb.app.login.domain.model.LoginModel
import com.ucb.app.login.domain.repository.AuthenticationRepository
import io.mockative.any
import io.mockative.coEvery
import io.mockative.coVerify
import io.mockative.mock
import io.mockative.of
import kotlinx.coroutines.test.runTest
import kotlin.test.Test

class DoLoginUseCase2Test {

    private val repository = mock(of<AuthenticationRepository>())

    private val usecase = DoLoginUseCase(repository)

    @Test
    fun `call the repository authentication method`() = runTest {

        //arrange
        val model = LoginModel("calyr.software@gmail.com", "1234")
        //act
        usecase.invoke(model)
        //asset
        coVerify { repository.login(model)}.wasInvoked()
    }
}