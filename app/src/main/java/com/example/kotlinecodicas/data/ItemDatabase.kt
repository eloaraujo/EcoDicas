package com.example.kotlinecodicas.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlinecodicas.model.ItemModel

@Database(entities = [ItemModel::class], version = 2)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}