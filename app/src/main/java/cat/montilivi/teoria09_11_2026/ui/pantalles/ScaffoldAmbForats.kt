package cat.montilivi.teoria09_11_2026.ui.pantalles

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import cat.montilivi.teoria09_11_2026.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperior(titol:String){
    TopAppBar(
        title = {Text(titol)},
        colors= TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperiorAmbIcona(titol:String){
    TopAppBar(
        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.caseta),
                contentDescription="desc."
            )
        },
        title = {Text(titol)},
        colors= TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        ),
        actions = {
            Icon(painter=painterResource(R.drawable.estrella), contentDescription = "",tint= Color.Yellow)
            Icon(painter=painterResource(R.drawable.estrella), contentDescription = "",tint= Color.Red)
            Icon(painter=painterResource(R.drawable.estrella), contentDescription = "",tint= Color.Yellow)
            Icon(painter=painterResource(R.drawable.estrella), contentDescription = "",tint= Color.Red)
            Icon(painter=painterResource(R.drawable.estrella), contentDescription = "",tint= Color.Yellow)
        }
    )
}

@Composable
fun ScaffoldAmbForats(
    barraNavegacio: @Composable () -> Unit,
    contingut: @Composable (padding: PaddingValues) -> Unit
){
    Scaffold(
        topBar=barraNavegacio,
        bottomBar={ BottomAppBar(){Text("Soc l'Scaffold amb forats") } }
    ){padding->
        contingut(padding)
    }
}