package com.example.daily_28_29_30.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface EmailDatabaseDao {
    @Insert
    fun insert(email: Email)

    @Update
    fun update(email: Email)

    @Query
        ("SELECT*from email where EntityEmailId = :key")
    fun get(key : Int): Email


    @Query
        ("SELECT*from email where title = :key")
    fun getTitle(key : Int): Email


    @Query
        ("SELECT*from email where content = :key")
    fun getContent(key : Int): Email


    @Query
        ("SELECT*from email where senderEmail = :key")
    fun getSender(key : Int): Email


}