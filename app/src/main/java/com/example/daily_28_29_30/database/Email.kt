package com.example.daily_28_29_30.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "email")
data class Email(
    @PrimaryKey(autoGenerate = true)
    var EntityEmailId: Int,

    @ColumnInfo(name = "title")
    var title : String ,

    @ColumnInfo(name = "content")
    var content : String,

    @ColumnInfo(name = "senderEmail")
    var senderEmail: String

)
