package digital.innovation.one

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel {
    override fun calculoAuxilio(): Double = salario + (salario * 0.4)
    override fun login(): Boolean = "senha123" == senha
}