package com.example.mystate.counterScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MyCounter() {

    //TODO Use of rememeber como habreis notado se estaba siguiendo el componenete
    // y haciendo una recomposición. Pero el valir no se estaba incrementando, esto es debido
    // a que con cada recomposición la variable count se esta creando una y otra vez.
    // quedando atascada en 0, para evitar esto se utiliza el remember.
    // De esta forma compose no solo sabrá que tiene que redibujar el compoenente,
    // también se encargará de mantener en la valor de la variable.

    var count = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        //TODO now we have to change to .value, a it is now an object not an Int
        Button(onClick = { count.value = 0 }) {
            Text(text = "pulsame")
        }
        Text(text = "hesido puslado ${count}")
    }

}