package com.ucb.app.profile.data.datasource

import com.ucb.app.profile.data.entity.UserEntity

interface UserLocalDatasource {
    suspend fun insert(entity: UserEntity)
    suspend fun count(): Int
}