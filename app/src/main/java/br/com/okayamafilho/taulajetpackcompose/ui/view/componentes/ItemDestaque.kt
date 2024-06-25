package br.com.okayamafilho.taulajetpackcompose.ui.view.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.okayamafilho.taulajetpackcompose.data.remote.dto.User
import br.com.okayamafilho.taulajetpackcompose.data.remote.model.Destaque
import coil.compose.AsyncImage

@Composable
fun ItemDestaque(
    usuario: User,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(8.dp)) {
        AsyncImage(
            model = usuario.image,
            modifier = Modifier
                .background(Color.LightGray, CircleShape)
                .size(56.dp)
                .clip(CircleShape),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            text = usuario.firstName,
            style = MaterialTheme.typography.titleMedium
        )
    }
}