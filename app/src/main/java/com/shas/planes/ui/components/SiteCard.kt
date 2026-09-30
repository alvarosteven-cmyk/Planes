package com.shas.planes.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
// Para importar cosas usa "Ctrl + alt"

// Para ver la imagen,tienes pulsar en "split"
@Composable
fun SiteCard(nombre: String, direccion: String, valoracion: Double){
    Card(
        modifier = Modifier.fillMaxWidth().padding(all=10.dp)   //Esto va a ser muy común
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(
                horizontal=6.dp,
                vertical = 8.dp
            ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }
        Column()
        {
            Text(text = nombre)
            Text(direccion)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

        }
            Text(text = valoracion.toString())
            Icon(
                imageVector=Icons.Rounded.Star,
                contentDescription = "Icono de estrella"      //Es necesario el contentDescription o te dará error(puedes simplemente poner "null")
        )
    }
}

@Composable
@Preview
fun SiteCardPreview(){
    SiteCard(
        nombre = "Colegio JOYFE",
        direccion = "C.Vital Aza 65",
        valoracion = 3.4
    )
}