package com.example.sparksbank

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BankDao {

    @Query("SELECT * FROM user_table ")
    fun getAllUsers(): Flow<List<User>>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUsers(words : List<User>)

    @Query("SELECT * FROM transfer_table")
    fun getTransactions(): Flow<List<Transfer>>


    @Query("Update user_table set currentBalance = currentBalance - :amount where userId = :tFrom")
    suspend fun withdraw(amount : Double, tFrom: Int):Int

    @Query("Update user_table set currentBalance = currentBalance  + :amount where userId = :tTo")
    suspend fun deposit(amount : Double, tTo: Int): Int

}