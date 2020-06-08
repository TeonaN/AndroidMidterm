package com.example.midterm2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TYPES")
data class Type(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "TypeId")
    val itemId: Long,

    @ColumnInfo(name = "Fuel")
    val fuel: String,


    @ColumnInfo(name = "Electricity")
    val electricity: String,

    @ColumnInfo(name = "Water")
    val water: String,

    @ColumnInfo(name = "Gas")
    val gas: String

)
