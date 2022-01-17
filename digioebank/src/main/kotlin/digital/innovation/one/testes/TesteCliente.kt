package digital.innovation.one.testes

import digital.innovation.one.Cliente
import digital.innovation.one.ClienteTipo

fun main() {
    val tiago = Cliente(
        nome = "Tiago",
        cpf = "123.456.789-10",
        clienteTipo = ClienteTipo.PF,
        senha = "123456")

    println(tiago)
    TesteAutenticacao().autentica(tiago)
}