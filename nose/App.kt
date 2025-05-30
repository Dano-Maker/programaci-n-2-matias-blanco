package org.example

fun main() {
    // Creando un número complejo con valores específicos
    val complejo1 = Complejo(3.0, 4.0)
    println("Objeto Complejo creado con valores específicos")
    complejo1.mostrarMensaje()
    
    // Creando un número complejo con solo el valor real
    val complejo2 = Complejo(real = 5.0)
    println("Objeto Complejo creado con solo real")
    complejo2.mostrarMensaje()
    
    // Creando un número complejo con solo el valor imaginario
    val complejo3 = Complejo(imaginario = 2.0)
    println("Objeto Complejo creado con solo imaginario")
    complejo3.mostrarMensaje()
    
    // Creando un número complejo con valores por defecto
    val complejo4 = Complejo()
    println("Objeto Complejo creado con valores por defecto")
    complejo4.mostrarMensaje()
}
