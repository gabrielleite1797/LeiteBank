package br.com.alura.leitebank.modelo

import br.com.alura.leitebank.modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
    private set
    fun registra(funcionario: Funcionario){
        println("nome: ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }
//    fun registra(funcionario: modelo.Gerente){
//        this.total += funcionario.bonificacao
//    }
//    fun registra(funcionario: modelo.Diretor){
//        this.total += funcionario.bonificacao
//    }
}