package digital.innovation.one.testes

import digital.innovation.one.Banco

fun main() {
    val banco = Banco(nome = "DigiOne", numero = 12)
    println(banco.nome)
    println(banco.numero)

    val banco2 = banco.copy(nome = "Banco2")

    println(banco2.nome)
    println(banco2.numero)
}