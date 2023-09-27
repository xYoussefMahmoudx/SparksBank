package com.example.sparksbank

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "transfer_table")
data class Transfer(

    val tFrom:Int,
    val tTo:Int,
    val tAMount:Int,
    @PrimaryKey(autoGenerate = true)
    val transferId:Int=0
)
