package org.example

class Complejo(val real: Double = 0.0, val imaginario: Double = 0.0) {
    override fun toString(): String {
        return if (imaginario >= 0) {
            "$real + ${imaginario}i"
        } else {
            "$real - ${-imaginario}i"
        }
    }
}
