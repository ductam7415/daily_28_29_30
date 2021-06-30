package com.example.daily_28_29_30.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase

@Database(entities = [Email::class], version = 2, exportSchema = false)
abstract class EmailDatabase() : RoomDatabase() {
    abstract val emailDatabaseDao: EmailDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: EmailDatabase? = null

        fun getInstance(context: Context): EmailDatabase? {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        EmailDatabase::class.java,
                        "email_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                    
                }
                return instance
            }
        }
    }
}
