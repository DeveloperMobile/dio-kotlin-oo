package digital.innovation.one

class Pessoa {
    var nome: String = "Tiago"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    var pessoa = Pessoa()
    println(pessoa.pessoaInfo())
}