package com.example.musicroom.data

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface MusicaDAO {
        @Insert
        suspend fun insert(musicaEntity: MusicaEntity)
}