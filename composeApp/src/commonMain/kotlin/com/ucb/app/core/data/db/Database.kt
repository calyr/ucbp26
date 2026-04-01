package com.ucb.app.core.data.db

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.ucb.app.profile.data.dao.UserDao
import com.ucb.app.profile.data.entity.UserEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

@Database(entities = [UserEntity::class], version = 1)
@ConstructedBy(AppDatabaseConstructor::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getDao(): UserDao
}

// The Room compiler generates the `actual` implementations.
@Suppress("KotlinNoActualForExpect")
expect object AppDatabaseConstructor : RoomDatabaseConstructor<AppDatabase> {
    override fun initialize(): AppDatabase
}
expect fun getDatabaseBuilder(ctx: Any? = null): RoomDatabase.Builder<AppDatabase>