package br.com.okayamafilho.taulajetpackcompose.data.remote.api

import br.com.okayamafilho.taulajetpackcompose.data.remote.dto.UsuarioResultado
import retrofit2.Response
import retrofit2.http.GET

interface DummyApi {

    @GET("users")
    suspend fun recuperarUsuarios() : Response<UsuarioResultado>
}