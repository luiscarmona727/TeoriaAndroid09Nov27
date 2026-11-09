package cat.montilivi.teoria09_11_2026.ui.pantalles

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaMenu(onClickPantalla1: () -> Unit, onClickPantalla2: () -> Unit) {
    Column(){
        Text("Pantalla Menú", style= TextStyle(fontSize = 60.sp, fontWeight = FontWeight.Bold))
        Spacer(Modifier.height(16.dp))
        Button(onClick = onClickPantalla1) {Text("Anar a la pantalla 1") }
        Button(onClick = onClickPantalla2) {Text("Anar a la pantalla 2") }

    }
}