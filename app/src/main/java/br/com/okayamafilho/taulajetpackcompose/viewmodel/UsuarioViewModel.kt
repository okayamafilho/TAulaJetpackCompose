package br.com.okayamafilho.taulajetpackcompose.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.okayamafilho.taulajetpackcompose.data.remote.dto.User
import br.com.okayamafilho.taulajetpackcompose.data.remote.repository.IUsuarioRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsuarioViewModel @Inject constructor(
    private val repository: IUsuarioRepository

) : ViewModel() {
    private val _usuarios = MutableLiveData<List<User>>()
    val usuarios: LiveData<List<User>>
        get() = _usuarios

    fun recuperarUsuarios() {
        viewModelScope.launch {
            val listaUsuarios = repository.recuperarUsuarios()
            _usuarios.postValue(listaUsuarios)
        }
    }
}