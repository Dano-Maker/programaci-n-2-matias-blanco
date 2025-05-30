package org.example

class Complejo(real: Double = 0.0, imaginario: Double = 0.0) {
    private var _real: Double = real
    private var _imaginario: Double = imaginario

    var real: Double
        get() = _real
        set(value) {
            if (value < 0) {
                println("Advertencia: La parte real no puede ser negativa")
            }
            _real = value
        }

    var imaginario: Double
        get() = _imaginario
        set(value) {
            if (value < 0) {
                println("Advertencia: La parte imaginaria no puede ser negativa")
            }
            _imaginario = value
        }

    override fun toString(): String {
        return if (_imaginario >= 0) {
            "$_real + ${_imaginario}i"
        } else {
            "$_real - ${-_imaginario}i"
        }
    }
}
