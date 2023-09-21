package com.example.sparksbank

import androidx.room.PrimaryKey

data class Transfer(

    val tFrom:Int,
    val tTo:Int,
    val tAMount:Int,
    @PrimaryKey(autoGenerate = true)
    val transferId:Int=0
)
