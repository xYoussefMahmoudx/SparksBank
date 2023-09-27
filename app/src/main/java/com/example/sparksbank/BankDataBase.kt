package com.example.sparksbank

import androidx.room.Database

@Database(
    entities = [User::class,Transfer::class],
    version = 1
)
abstract class BankDataBase {

    abstract val dao :BankDao
}