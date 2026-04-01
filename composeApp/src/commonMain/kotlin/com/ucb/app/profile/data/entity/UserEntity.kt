package com.ucb.app.profile.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey(
        autoGenerate = true
    )
    val id: Long,
    val name: String,
    val lastName: String
)