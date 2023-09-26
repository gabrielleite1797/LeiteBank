package br.com.alura.leitebank.modelo

import br.com.alura.leitebank.modelo.Autenticavel
import br.com.alura.leitebank.modelo.FuncionarioAdmin

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override val bonificacao: Double
        get() {
            println("Bonificacao modelo.Gerente")
            return salario
        }
}