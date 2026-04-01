package com.ucb.app.profile.data.repository

import com.ucb.app.profile.data.datasource.UserLocalDatasource
import com.ucb.app.profile.data.entity.UserEntity
import com.ucb.app.profile.domain.model.ProfileModel
import com.ucb.app.profile.domain.repository.ProfileRepository

class ProfileRepositoryImpl(
    val localDatasource: UserLocalDatasource
): ProfileRepository {
    override suspend fun update(profile: ProfileModel) {
        TODO("Not yet implemented")
    }

    override suspend fun create(profile: ProfileModel) {
        localDatasource.insert(UserEntity(1, "Roberto Carlos", "Callisaya"))

        println("Cantidad de elementos en la base de datos ${localDatasource.count()}")
    }

    override suspend fun findById(id: String): ProfileModel {
        TODO("Not yet implemented")
    }
}