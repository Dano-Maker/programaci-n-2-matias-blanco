package org.example

fun main() {
    // Creando un número complejo con valores específicos
    val complejo1 = Complejo(3.0, 4.0)
    println("Objeto Complejo creado con valores específicos")
    println("Representación: $complejo1")
    println("Parte real: ${complejo1.real}")
    println("Parte imaginaria: ${complejo1.imaginario}")
    
    // Intentando cambiar valores
    println("\nIntentando cambiar valores:")
    complejo1.real = -1.0  // Esto mostrará una advertencia
    complejo1.imaginario = -2.0  // Esto también mostrará una advertencia
    
    // Creando un número complejo con solo el valor real
    val complejo2 = Complejo(real = 5.0)
    println("\nObjeto Complejo creado con solo real")
    println("Representación: $complejo2")
    
    // Creando un número complejo con solo el valor imaginario
    val complejo3 = Complejo(imaginario = 2.0)
    println("\nObjeto Complejo creado con solo imaginario")
    println("Representación: $complejo3")
    
    // Creando un número complejo con valores por defecto
    val complejo4 = Complejo()
    println("\nObjeto Complejo creado con valores por defecto")
    println("Representación: $complejo4")
}
