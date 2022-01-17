package digital.innovation.one.testes

import digital.innovation.one.Analista
import digital.innovation.one.Funcionario
import digital.innovation.one.Pessoa
import java.math.BigDecimal

fun main() {
    println("Pessoa")
    var tiago = Analista(nome = "Tiago Vieira", cpf = "123.456.789-10", salario = 2000.0)
    ImprimeRelatorioFuncionario.imrpime(tiago)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())