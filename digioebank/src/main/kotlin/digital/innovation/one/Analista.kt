package digital.innovation.one

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio(): Double = salario + (salario * 0.1)
}