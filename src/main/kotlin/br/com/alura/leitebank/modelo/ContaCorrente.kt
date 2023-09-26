package br.com.alura.leitebank.modelo

import br.com.alura.leitebank.modelo.Conta

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){
    override fun saque(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}