package digital.innovation.one

class Pessoa {
    var nome: String = "Tiago"
    var cpf: String = "123.123.123-12"

    inner class Endereco {
        var rua: String = "Rua Teste"
    }
}

fun main() {
    var pessoa = Pessoa()
    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.Endereco().rua)
}