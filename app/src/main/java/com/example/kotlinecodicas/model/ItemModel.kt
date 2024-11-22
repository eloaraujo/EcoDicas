package com.example.kotlinecodicas.model

import androidx.room.Entity
import androidx.room.PrimaryKey

    @Entity
    data class ItemModel(
        @PrimaryKey(autoGenerate = true)
        val id: Int = 0,
        val title: String,
        val description: String
    )
