package com.example.daily_28_29_30.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Entity_email")
data class Email(
    @PrimaryKey(autoGenerate = true)
    var EntityEamilId: Int,

    @ColumnInfo(name = "title")
    var title : String ,

    @ColumnInfo(name = "content")
    var content : String,

    @ColumnInfo(name = "senderEmail")
    var senderEmail: String
    
)
