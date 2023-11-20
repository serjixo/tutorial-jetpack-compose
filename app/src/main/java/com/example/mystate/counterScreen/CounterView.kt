package com.example.mystate.counterScreen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


/* TODO ahora recibimos por parámetro
    (de momento de forma manual luego veremos la inyección de dependencias)
    y utilizaremos el ViewModel para leer y modificar el estado.
    utilizaremos el observeasState para subscribirnos a los datos y que el
    composable haga recomposición cuando el valor cambia
    */
@Composable
fun MyCounter(counterViewModel: CounterViewModel) {

    /*TODO Aquí sustituiremos la línea de la lógica del estado por una
       en la que leemos el valor del ViewModel*/
    val count by counterViewModel.count.observeAsState(initial = 0)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
//TODO pasamos a utilizar el método para la lógica en lugar de modificar directamente,
        Button(onClick = { counterViewModel.incrementCount() }) {
            Text(text = "pulsame")
        }

        Text(text = "hesido puslado ${count}")
    }
}