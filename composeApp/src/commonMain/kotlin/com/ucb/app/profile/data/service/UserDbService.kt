package com.ucb.app.profile.data.service

import com.ucb.app.profile.data.dao.UserDao
import com.ucb.app.profile.data.datasource.UserLocalDatasource
import com.ucb.app.profile.data.entity.UserEntity

class UserDbService(
    val dao: UserDao
): UserLocalDatasource {
    override suspend fun insert(entity: UserEntity) {
        dao.insert(entity)
    }

    override suspend fun count(): Int {
        return dao.count()
    }
}