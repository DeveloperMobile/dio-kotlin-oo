package digital.innovation.one

class Pessoa {
    var nome: String = "Tiago"
    var cpf: String = "123.123.123-12"
    private set
}

fun main() {
    var pessoa = Pessoa()
    println(pessoa.nome)
    println(pessoa.cpf)
}