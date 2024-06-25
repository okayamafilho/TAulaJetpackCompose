package br.com.okayamafilho.taulajetpackcompose.data.remote.dto

data class UsuarioResultado(
    val limit: Int,
    val skip: Int,
    val total: Int,
    val users: List<User>
)