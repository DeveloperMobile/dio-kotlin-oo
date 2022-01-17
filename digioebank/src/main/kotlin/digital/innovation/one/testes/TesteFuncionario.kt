package digital.innovation.one.testes

import digital.innovation.one.Funcionario
import digital.innovation.one.Pessoa
import java.math.BigDecimal

fun main() {
    println("Pessoa")
    var pessoa = Pessoa(nome = "Tiago Vieira", cpf = "123.456.789-10")
    println(pessoa.nome)
    println(pessoa.cpf)
    println("Funcionário")
    var funcionario = Funcionario(nome = "Tiago Vieira", cpf = "123.456.789-10", BigDecimal.valueOf(2000.0))
    println(funcionario.nome)
    println(funcionario.cpf)
    println(funcionario.salario)
}