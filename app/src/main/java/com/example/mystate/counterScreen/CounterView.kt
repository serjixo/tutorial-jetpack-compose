package com.example.mystate.counterScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MyCounter() {

    //TODO en lugar de utilizar todo el rato el .value podemos añadir el keyword by, funciona como getter / setter
    // de hecho fijate en los imports que se han añadido con el by.

    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        //TODO al añadir el by ahora no necesitamos el by
        Button(onClick = { count = 0 }) {
            Text(text = "pulsame")
        }
        Text(text = "hesido puslado ${count}")
    }

}