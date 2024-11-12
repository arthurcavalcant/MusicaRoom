package com.example.musicroom.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.example.musicroom.domain.Musica

@Entity(tableName = "musicas")
data class MusicaEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nome: String,
    val artista: String,
    val album: String
) {
    fun toDomain(): Musica {
        return Musica(id, nome, artista, album)
    }
}
