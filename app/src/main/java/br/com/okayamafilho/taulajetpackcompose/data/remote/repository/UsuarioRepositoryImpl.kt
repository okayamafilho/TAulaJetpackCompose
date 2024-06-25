package br.com.okayamafilho.taulajetpackcompose.data.remote.repository

import br.com.okayamafilho.taulajetpackcompose.data.remote.api.DummyApi
import br.com.okayamafilho.taulajetpackcompose.data.remote.dto.User
import javax.inject.Inject

class UsuarioRepositoryImpl @Inject constructor(
    private val dummyApi: DummyApi
) : IUsuarioRepository {
    override suspend fun recuperarUsuarios(): List<User> {
        try {
            val resposta = dummyApi.recuperarUsuarios()
            if (resposta.isSuccessful && resposta.body() != null) {
                val listaUsuarios = resposta.body()?.users
                if (listaUsuarios != null) {
                    return listaUsuarios
                }
            }

        } catch (erroRequisicao: Exception) {

        }
        return emptyList()
    }


}