package com.example.kotlinecodicas.data

import androidx.lifecycle.LiveData
import com.example.kotlinecodicas.model.ItemModel
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ItemDao {
        @Query("SELECT * FROM ItemModel")
        fun getAll(): LiveData<List<ItemModel>>
        @Insert
        fun insert(item: ItemModel)
        @Delete
        fun delete(item: ItemModel)
    }
