package com.example.midterm2

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TypeDao {
    @Query("SELECT * FROM TYPES")
    fun getAllType(): List<Type>

    @Query("SELECT * FROM TYPES A WHERE A.TypeId IN (:typeIds)")
    fun getTypesByIds(typeIds: IntArray):List<Type>

    @Query("SELECT SUM(Fuel) FROM TYPES")
    fun getFuelSum():Long

    @Query("SELECT SUM(Electricity) FROM TYPES")
    fun getElectricitySum():Long

    @Query("SELECT SUM(Water) FROM TYPES")
    fun getWaterSum():Long

    @Query("SELECT SUM(Gas) FROM TYPES")
    fun getGasSum():Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg types: Type)


}