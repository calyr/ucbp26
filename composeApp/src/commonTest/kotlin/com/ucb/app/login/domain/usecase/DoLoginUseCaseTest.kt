package com.ucb.app.login.domain.usecase

import com.ucb.app.login.domain.model.LoginModel
import com.ucb.app.login.domain.repository.AuthenticationRepository
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertTrue

class AuthenticationRepositoryFake: AuthenticationRepository {
    var loginCalled = false
    override suspend fun login(model: LoginModel) {
        loginCalled = true
    }

}

class DoLoginUseCaseTest {

    @Test
    fun `call the repository authentication method`() = runTest {
        //arrange
        val repository = AuthenticationRepositoryFake()
        val usecase = DoLoginUseCase(repository)
        val model = LoginModel("calyr.software@gmail.com", "1234")
        //act
        usecase.invoke(model)
        //assett
        assertTrue { repository.loginCalled }
    }
}