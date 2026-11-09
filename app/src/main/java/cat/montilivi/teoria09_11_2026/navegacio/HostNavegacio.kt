package cat.montilivi.teoria09_11_2026.navegacio

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import cat.montilivi.teoria09_11_2026.ui.pantalles.Pantalla1
import cat.montilivi.teoria09_11_2026.ui.pantalles.Pantalla2
import cat.montilivi.teoria09_11_2026.ui.pantalles.PantallaMenu
import kotlinx.serialization.Serializable

@Composable
fun HostNavegacio(controladorNavegacio: NavHostController){
    NavHost(
        navController = controladorNavegacio,
        startDestination = DestiPantallaMenu
    ){
        composable<DestiPantallaMenu>{
            PantallaMenu(
                onClickPantalla1 = {controladorNavegacio.navigate(DestiPantalla1)},
                onClickPantalla2 = {controladorNavegacio.navigate(DestiPantalla2)},
            )
        }
        composable<DestiPantalla1> {
            Pantalla1()
        }
        composable<DestiPantalla2>{
            Pantalla2()
        }
    }
}

@Serializable
object DestiPantallaMenu

@Serializable
object DestiPantalla1

@Serializable
object DestiPantalla2