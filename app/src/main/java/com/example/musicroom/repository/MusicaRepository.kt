package com.example.musicroom.repository

import com.example.musicroom.data.MusicaDAO
import com.example.musicroom.domain.Musica

class MusicaRepository (private val musicaDAO: MusicaDAO) {
    suspend fun insert(musica: Musica){
        musicaDAO.insert(musica.toEntity())
    }
}