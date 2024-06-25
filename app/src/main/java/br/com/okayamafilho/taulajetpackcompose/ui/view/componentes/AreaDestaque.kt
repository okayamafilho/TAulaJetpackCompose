package br.com.okayamafilho.taulajetpackcompose.ui.view.componentes

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.okayamafilho.taulajetpackcompose.data.remote.dto.User
import br.com.okayamafilho.taulajetpackcompose.data.remote.model.Destaque

@Composable
fun AreaDestaque(
    listaUsuarios: List<User>,
    modifier: Modifier = Modifier
){
    LazyRow(modifier = modifier) {
        items(listaUsuarios) {
            usuario -> ItemDestaque(usuario)
        }
    }
}