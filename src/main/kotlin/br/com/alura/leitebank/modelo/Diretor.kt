package br.com.alura.leitebank.modelo

import br.com.alura.leitebank.modelo.Autenticavel
import br.com.alura.leitebank.modelo.FuncionarioAdmin

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override val bonificacao: Double
        get() {
            println("Bonificacao modelo.Diretor")
            return salario + plr
        }
}