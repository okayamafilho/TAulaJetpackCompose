package br.com.okayamafilho.taulajetpackcompose.di

import br.com.okayamafilho.taulajetpackcompose.data.remote.api.DummyApi
import br.com.okayamafilho.taulajetpackcompose.utils.Constantes
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideDummyAPI(retrofit: Retrofit): DummyApi {
        return retrofit.create(DummyApi::class.java)
    }
}