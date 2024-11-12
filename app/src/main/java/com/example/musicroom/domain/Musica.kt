package com.example.musicroom.domain;

import com.example.musicroom.data.MusicaEntity

data class Musica(
    var id: Int = 0,
    var nome: String,
    var artista: String,
    var album: String
) {
    fun toEntity():
            MusicaEntity {
        return MusicaEntity(id, nome, artista, album)
    }
}
