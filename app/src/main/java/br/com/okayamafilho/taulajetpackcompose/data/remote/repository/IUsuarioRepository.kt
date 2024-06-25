package br.com.okayamafilho.taulajetpackcompose.data.remote.repository

import br.com.okayamafilho.taulajetpackcompose.data.remote.dto.User

interface IUsuarioRepository {
    suspend fun recuperarUsuarios(): List<User>

}