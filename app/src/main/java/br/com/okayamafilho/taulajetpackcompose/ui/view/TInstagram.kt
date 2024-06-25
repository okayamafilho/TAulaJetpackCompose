package br.com.okayamafilho.taulajetpackcompose.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.okayamafilho.taulajetpackcompose.R
import br.com.okayamafilho.taulajetpackcompose.componentes.AreaDestaque
import br.com.okayamafilho.taulajetpackcompose.componentes.AreaPostagem
import br.com.okayamafilho.taulajetpackcompose.componentes.BarraInferior
import br.com.okayamafilho.taulajetpackcompose.componentes.BarraSuperior
import br.com.okayamafilho.taulajetpackcompose.model.Destaque
import br.com.okayamafilho.taulajetpackcompose.model.Postagem
import br.com.okayamafilho.taulajetpackcompose.ui.theme.TAulaJetpackComposeTheme

class TInstagram : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)

    private val listaDestaques = listOf(
        Destaque(R.drawable.perfil_01, "Toshiaki"),
        Destaque(R.drawable.perfil_02, "Vitor"),
        Destaque(R.drawable.perfil_03, "Raoni"),
        Destaque(R.drawable.perfil_01, "Carlo"),
        Destaque(R.drawable.perfil_02, "Pedro"),
        Destaque(R.drawable.perfil_03, "Joao"),
        Destaque(R.drawable.perfil_01, "Toshiaki"),
        Destaque(R.drawable.perfil_02, "Vitor"),
        Destaque(R.drawable.perfil_03, "Raoni"),
        Destaque(R.drawable.perfil_01, "Carlo"),
        Destaque(R.drawable.perfil_02, "Pedro"),
        Destaque(R.drawable.perfil_03, "Joao"),
    )

    private val listaPostagens = listOf(
        Postagem(R.drawable.perfil_01, "Toshiaki", R.drawable.carro, "Descricao do carro F1"),
        Postagem(R.drawable.perfil_01, "Zeni", R.drawable.praia, "Descricao da imagem da praia"),
        Postagem(R.drawable.perfil_01, "Maria", R.drawable.carro, "Descricao do carro F1"),
        Postagem(R.drawable.perfil_01, "Rosane", R.drawable.praia, "Descricao da imagem da praia"),
        Postagem(R.drawable.perfil_01, "Rosa", R.drawable.carro, "Descricao do carro F1"),
        Postagem(R.drawable.perfil_01, "Toshiaki", R.drawable.carro, "Descricao do carro F1"),
        Postagem(R.drawable.perfil_01, "Zeni", R.drawable.praia, "Descricao da imagem da praia"),
        Postagem(R.drawable.perfil_01, "Maria", R.drawable.carro, "Descricao do carro F1"),
        Postagem(R.drawable.perfil_01, "Rosane", R.drawable.praia, "Descricao da imagem da praia"),
        Postagem(R.drawable.perfil_01, "Rosa", R.drawable.carro, "Descricao do carro F1"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TAulaJetpackComposeTheme {
                Scaffold(
                    topBar = {
                        BarraSuperior()
                    },
                    bottomBar = {
                        BottomAppBar {
//                            Text(text = "Bottom App Bar")
                            BarraInferior()
                        }
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = { }) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_add_box_24),
                                contentDescription = null
                            )
                        }
                    },
                    floatingActionButtonPosition = FabPosition.End,
                    modifier = Modifier.fillMaxSize()
                ) { paddingInterno ->
                    Home(
                        Modifier.padding(paddingInterno)
                    )
                }
            }
        }
    }

    @Composable
    fun Home(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier.fillMaxWidth()
        ) {
            //Área de destaque
            //Postagens
//            AreaDestaque(listaDestaques, Modifier.padding(9.dp))
            AreaDestaque(listaDestaques)
            Divider()
            AreaPostagem(listaPostagens)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun AppPreview() {
        TAulaJetpackComposeTheme {
            Home()
        }
    }
}

