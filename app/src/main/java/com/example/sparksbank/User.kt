package com.example.sparksbank

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User


    (
        val name :String,
        val email:String,
        val currentBalance:Int,
        @PrimaryKey(autoGenerate = true)
        val userId:Int=0
    )