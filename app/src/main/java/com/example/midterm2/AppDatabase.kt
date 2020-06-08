package com.example.midterm2

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Type::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getTypeDao(): TypeDao
}


