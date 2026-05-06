package com.ucb.app.login.domain.repository

import com.ucb.app.login.domain.model.LoginModel
import io.mockative.Mockable

@Mockable
interface AuthenticationRepository {
    suspend fun login(model: LoginModel)
}