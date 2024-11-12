package com.example.musicroom.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MusicaEntity::class], version = 1)
abstract class MusicaDatabase: RoomDatabase() {
    abstract fun musicaDAO(): MusicaDAO
    companion object {
        @Volatile
        private var INSTANCE: MusicaDatabase? = null
        fun getDatabase(context: Context): MusicaDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MusicaDatabase::class.java,
                    "musicasroom.db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}