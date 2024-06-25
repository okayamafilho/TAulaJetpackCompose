package br.com.okayamafilho.taulajetpackcompose.data.remote.api

import okhttp3.Response
import retrofit2.http.GET

interface DummyApi {

    @GET("users")
    suspend fun recuperarUsuarios() : Response
}