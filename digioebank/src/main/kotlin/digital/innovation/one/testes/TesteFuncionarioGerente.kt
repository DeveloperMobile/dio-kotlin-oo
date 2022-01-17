package digital.innovation.one.testes

import digital.innovation.one.Analista
import digital.innovation.one.Funcionario
import digital.innovation.one.Gerente
import digital.innovation.one.Pessoa
import java.math.BigDecimal

fun main() {
    var tiago = Gerente(nome = "Tiago Vieira", cpf = "123.456.789-10", salario = 2000.0, senha = "senha123")
    ImprimeRelatorioFuncionario.imrpime(tiago)
    TesteAutenticacao().autentica(tiago)
}