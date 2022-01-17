package digital.innovation.one.testes

import digital.innovation.one.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} = ${elemento.tipo}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} = ${it.tipo}")
    }
}