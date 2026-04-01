package com.ucb.app.profile.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ucb.app.profile.data.entity.UserEntity

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: UserEntity)

    @Query("SELECT count(*) FROM UserEntity")
    suspend fun count(): Int
}