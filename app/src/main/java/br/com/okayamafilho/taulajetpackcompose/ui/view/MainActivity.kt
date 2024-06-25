package br.com.okayamafilho.taulajetpackcompose.ui.view

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.okayamafilho.taulajetpackcompose.R
import br.com.okayamafilho.taulajetpackcompose.data.model.Usuario
import br.com.okayamafilho.taulajetpackcompose.ui.theme.TAulaJetpackComposeTheme

class MainActivity : ComponentActivity() {

    private val usuarios = listOf(
        Usuario("Toshiaki", 39),
        Usuario("Maria", 65),
        Usuario("Zeni", 45),
        Usuario("Toshiaki", 39),
        Usuario("Maria", 17),
        Usuario("Toshiaki", 12),
        Usuario("Maria", 12),
        Usuario("Zeni", 24),
        Usuario("Zeni", 58),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TAulaJetpackComposeTheme {
//                PrimeiroApp()
//                ListaLazyColumn()
//                ListaLazyRow()
//                ListaLazyVerticalGrid()
//                SegundoApp()
//                TerceiroApp()
//                QuartoApp()
                QuintoApp()
            }
        }
    }//Fim Oncreate

    @Composable
    fun ListaLazyColumn() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Gray)
                .border(2.dp, Color.Red)
                .padding(top = 30.dp)


        ) {

            LazyColumn {
                items(usuarios.size) { indice ->
                    val nome = usuarios[indice].nome
                    val idade = usuarios[indice].idade
                    Text(
                        text = "$nome - $idade",
                        fontSize = 32.sp
                    )
                }
            }
//        for (i in 1 ..4 ) {
//            Image(
//                painter = painterResource(id = R.drawable.carro),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//                    .border(2.dp, Color.Red),
//                contentScale = ContentScale.Crop,
//            )
//        }
        }
    }

    @Composable
    fun ListaLazyRow() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Gray)
                .border(2.dp, Color.Red)
                .padding(top = 30.dp)

        ) {

            LazyColumn(
                modifier = Modifier.padding(8.dp)
            ) {
                items(usuarios.size) { indice ->
                    val nome = usuarios[indice].nome
                    val idade = usuarios[indice].idade
                    Row(
                        modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.carro),
                            contentDescription = null,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .border(2.dp, Color.Red),
                            contentScale = ContentScale.Crop,
                        )
                        Text(
                            text = "$nome - $idade",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 16.dp),

                            )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(2.dp)
                            .background(Color.Green)
                    )
                }
            }

        }
    }

    @Composable
    fun ListaLazyVerticalGrid() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Gray)
                .border(2.dp, Color.Red)
                .padding(top = 30.dp)

        ) {

//            LazyVerticalGrid(
////                columns = GridCells.Adaptive(122.dp),
//                columns = GridCells.Fixed(3),
//                modifier = Modifier.padding(8.dp)
//            ) {
//                items(usuarios.size) { indice ->
//                    val nome = usuarios[indice].nome
//                    val idade = usuarios[indice].idade
//                    Column {
//                        Image(
//                            painter = painterResource(id = R.drawable.carro),
//                            contentDescription = null,
//                            modifier = Modifier
//                                .height(100.dp)
//                                .width(100.dp)
//                                .border(2.dp, Color.Red),
//                            contentScale = ContentScale.Crop,
//                        )
//                        Text(text = "$nome")
//                    }
//                }
//            }

            LazyHorizontalGrid(
//                columns = GridCells.Adaptive(122.dp),
                rows = GridCells.Fixed(3),
                modifier = Modifier.padding(8.dp)
            ) {
                items(usuarios.size) { indice ->
                    val nome = usuarios[indice].nome
                    val idade = usuarios[indice].idade
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.carro),
                            contentDescription = null,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .border(2.dp, Color.Red),
                            contentScale = ContentScale.Crop,
                        )
                        Text(text = "$nome")
                    }
                }
            }
        }
    }

    @Composable
    fun PrimeiroApp() {

        Column(
            modifier = Modifier
//            .width(200.dp)
//            .height(200.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Gray)
                .border(2.dp, Color.Red)
                .padding(top = 30.dp)
//            .padding(top = 30.dp, end = 30.dp)

        ) {
            Text(text = "Toshiaki ", color = Color.Black, fontSize = 35.sp)
            Image(
                painter = painterResource(id = R.drawable.carro),
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .border(2.dp, Color.Red),
                contentScale = ContentScale.Fit,
                alignment = Alignment.Center
            )
            Icon(
//            painter = painterResource(id = R.drawable.ic_add_box_24),
                imageVector = Icons.Default.Lock,
                contentDescription = null,
//            modifier = Modifier.height(200.dp).width(200.dp).border(2.dp, Color.Red)
            )

            Button(onClick = { }) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (false) {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = null,
                        )
                        Text(text = "Desbloquear")
                    } else {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = null,
                        )
                        Text(text = "Desbloquear")
                    }
                }
            }
//        PerfilUsuario()
        }


//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight()
//            .background(Color.Gray),
//        //para Column
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.End
//        //espaço uniforme
//
//        //para Row
////        horizontalArrangement = Arrangement.SpaceEvenly,
////        verticalAlignment = Alignment.CenterVertically
//
//    ) {
//        Text(text = "Toshiaki ", color = Color.Black, fontSize = 35.sp)
//        Text(text = "Toshiaki ", color = Color.Red, fontSize = 20.sp)
//        Text(text = "Toshiaki ", color = Color.Green, fontSize = 15.sp)
//        Botao(texto = "Toshiaki") {
//
//        }
//    }

//    Button(onClick = { /*TODO*/ }) {

//    }
    }

    @Composable
    fun SegundoApp() {
        var contador by remember {
            mutableStateOf(0)
        }

        var nome by remember {
            mutableStateOf("")
        }
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(top = 30.dp)
                .fillMaxWidth()
                .fillMaxHeight()

        ) {
//            TextField(value = , onValueChange = ),
            OutlinedTextField(value = nome, onValueChange = { valordigitado ->
                nome = valordigitado
                Log.i("digitado", "digitado: $valordigitado")

            },
                placeholder = {
                    Text(text = "Digite seu nome")
                }

            )
            Button(onClick = {
                contador++
                Log.i("contador", "SegundoApp: $contador")
            }) {
                Text(text = "Clique")
            }
            Text(text = "Contador: ${nome}")
        }
    }

    @Composable
    fun TerceiroApp() {
        var contador by remember {
            mutableStateOf(0)
        }


        var nome by remember {
            mutableStateOf("")
        }

        var listaUsuarios by remember {
            mutableStateOf(listOf<Usuario>())
        }

        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(top = 16.dp)
                .fillMaxWidth()
                .fillMaxHeight()

        ) {
            Row(
                modifier = Modifier.padding(8.dp)
            ) {
                OutlinedTextField(value = nome, onValueChange = { valordigitado ->
                    nome = valordigitado
                    Log.i("digitado", "digitado: $valordigitado")

                },
                    placeholder = {
                        Text(text = "Digite seu nome")
                    }

                )
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = {
                    //Adicionar na lista
                    val usuario = Usuario(nome, 12)
                    listaUsuarios = listaUsuarios + usuario
                    nome = ""
                }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_add_box_24),
                        contentDescription = null
                    )
                }
            }//fimRow
            LazyColumn(
                modifier = Modifier.padding(
                    top = 20.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 8.dp
                )
            ) {
                items(listaUsuarios) { usuario ->
                    Text(text = "+) ${usuario.nome}")
                    Divider()
                }
            }
        }
    }

    @Composable
    fun QuartoApp() {
        var contador by remember {
            mutableStateOf(0)
        }

        var nome by remember {
            mutableStateOf("")
        }

        var checked by remember {
            mutableStateOf(false)
        }

        var listaUsuarios by remember {
            mutableStateOf(listOf<Usuario>())
        }

        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(top = 8.dp)
                .fillMaxWidth()
                .fillMaxHeight()

        ) {

        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun itemCartao(usuario: Usuario) {
        Card(
            modifier = Modifier
                .padding(
                    16.dp, 8.dp
                )
                .fillMaxWidth(),
            onClick = {
                Toast.makeText(applicationContext, "Clicado", Toast.LENGTH_SHORT)
            },
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            ),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Gray,
                contentColor = Color.Green
            )
        ) {
            Row(modifier = Modifier.padding(16.dp, 8.dp), verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.carro),
                    contentDescription = null,
                    modifier = Modifier
                        .height(80.dp)
                        .width(80.dp)
                        .border(2.dp, Color.Red),
                    contentScale = ContentScale.Crop,
                )
                Text(
                    text = "${usuario.nome} - ${usuario.idade}",
                    fontSize = 22.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }

    @Composable
    fun QuintoApp() {

        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(top = 16.dp)
                .fillMaxWidth()
                .fillMaxHeight()

        ) {

            LazyColumn {
                items(usuarios) { usuario ->
                    itemCartao(usuario = usuario)

                }
            }

        }
    }

    @Preview
    @Composable
    fun PrimeiroAppPreview() {
        QuintoApp()
    }

}//fechamento MainAcitivity

