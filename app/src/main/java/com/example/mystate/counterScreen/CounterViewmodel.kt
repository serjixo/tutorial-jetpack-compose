package com.example.mystate.counterScreen


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//TODO la clase hereda de Viewmodel para notificar a jetpackcompose que se trata de un view model,
// esto se tendrá en cuenta en el ciclo de viea de la aplicación.

class CounterViewModel : ViewModel() {
    /* TODO Se declara en privado el LiveData Mutable,
           esto es para que nuestras vistas puedan leer pero no modificar
           se declara privado y por convención la variable se inicia con _
           Seguidamente, se declara una referencia al valor que contiene
           de esta forma podemos exponer el valor sin que nadie más lo pueda modificar.
           */
    private var _count = MutableLiveData(0)
    val count: LiveData<Int> = _count
    fun incrementCount() {
        val currentCount = _count.value ?: 0
        _count.value = currentCount + 1
    }

}
