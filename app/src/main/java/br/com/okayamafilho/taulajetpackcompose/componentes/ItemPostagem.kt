package br.com.okayamafilho.taulajetpackcompose.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.okayamafilho.taulajetpackcompose.model.Destaque
import br.com.okayamafilho.taulajetpackcompose.model.Postagem

@Composable
fun ItemPostagem(
    postagem: Postagem,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(top =  8.dp, bottom = 8.dp)
    ) {
        //Informacoes de perfil

        //Informacoes de Postagem
        Row(modifier = Modifier.padding(16.dp, 8.dp),
            verticalAlignment = Alignment.CenterVertically

            ) {
            Image(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape),
                painter = painterResource(id = postagem.imagemPerfilRes), contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = postagem.nome,
                style = MaterialTheme.typography.titleMedium
            )
        }

        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = postagem.fotoRes), contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier.padding(16.dp, 4.dp),
            text = postagem.descricao,
            style = MaterialTheme.typography.titleMedium
        )
    }
}