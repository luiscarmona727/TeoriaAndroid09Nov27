package cat.montilivi.teoria09_11_2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import cat.montilivi.teoria09_11_2026.navegacio.HostNavegacio
import cat.montilivi.teoria09_11_2026.ui.pantalles.BarraSuperior
import cat.montilivi.teoria09_11_2026.ui.pantalles.BarraSuperiorAmbIcona
import cat.montilivi.teoria09_11_2026.ui.pantalles.Pantalla1
import cat.montilivi.teoria09_11_2026.ui.pantalles.PantallaMenu
import cat.montilivi.teoria09_11_2026.ui.pantalles.ScaffoldAmbForats
import cat.montilivi.teoria09_11_2026.ui.theme.Teoria09112026Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Teoria09112026Theme {
                val controladorNavegacio=rememberNavController()
                ScaffoldAmbForats(barraNavegacio ={
                    BarraSuperiorAmbIcona("Scaffold amb forats") },
                    contingut = {padding->
                        Column(Modifier.padding(padding)) {
                            HostNavegacio(
                            controladorNavegacio = controladorNavegacio
                        )
                        }
                    })
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Column(Modifier.padding(innerPadding)){
//                        HostNavegacio(
//                            controladorNavegacio = controladorNavegacio
//                        )
//                    }
//                }
            }
        }
    }
}