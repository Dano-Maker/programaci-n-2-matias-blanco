package org.example

class Complejo(val real: Double = 0.0, val imaginario: Double = 0.0) {
    fun mostrarMensaje() {
        println("¡Hola! Soy un número complejo con parte real $real y parte imaginaria $imaginario")
    }
}
