package br.com.okayamafilho.taulajetpackcompose.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick

@Composable
fun Botao(
    texto: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "+ ")
        Text(text = texto)
        Text(text = " +")
    }
}

@Composable
fun PerfilUsuario() {
    Column(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .border(
                2.dp, Color.Red, RoundedCornerShape(
                    20.dp
                )
            )
            .clip(
//                RoundedCornerShape(
//                    topStart = 10.dp,
//                    topEnd = 8.dp,
//                    bottomEnd = 20.dp,
//                    bottomStart = 8.dp
//                )
                (CircleShape)
            )
            .background(Color.Green),
//                .padding(top = 10.dp, end = 30.dp, bottom = 30.dp, start = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "TOSHIAKI", fontSize = 16.sp
        )
    }
}

@Preview
@Composable
fun BotaoPreview() {
    PerfilUsuario()
}