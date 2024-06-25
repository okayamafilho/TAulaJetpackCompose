package br.com.okayamafilho.taulajetpackcompose.componentes

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.okayamafilho.taulajetpackcompose.model.Postagem

@Composable
fun AreaPostagem(
    listaPostagens: List<Postagem>,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier) {
        items(listaPostagens) {
                postagem -> ItemPostagem(postagem = postagem)
        }
    }
}