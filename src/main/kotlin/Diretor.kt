class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){

    override val bonificacao: Double
        get() {
            println("Bonificacao Diretor")
            return salario + plr
        }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}