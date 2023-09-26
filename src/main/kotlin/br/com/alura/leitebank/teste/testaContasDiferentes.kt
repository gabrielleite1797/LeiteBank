package br.com.alura.leitebank.teste

import br.com.alura.leitebank.modelo.Cliente
import br.com.alura.leitebank.modelo.ContaCorrente
import br.com.alura.leitebank.modelo.ContaPoupanca
import br.com.alura.leitebank.modelo.Endereco

public fun testaContasDifirentes() {
    val contaCorrente = ContaCorrente(titular = Cliente("Alex", "111.111.111-11", 1, Endereco(logradouro = "Rua general nelson braga moreira")), numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = Cliente("Fran", "", 2), numero = 1001)

//    contaCorrente.deposita(1000.0)
//    contaPoupanca.deposita(1000.0)

    /*println("saldo corrente : ${contaCorrente.saldo}")
    println("saldo poupanca : ${contaPoupanca.saldo}")


    contaCorrente.saque(100.0)
    contaPoupanca.saque(100.0)

    println("saldo corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupanca após saque: ${contaPoupanca.saldo}")

    contaCorrente.tranferencia(100.0, contaPoupanca)

    println("saldo corrente após tranferencia para poupanca: ${contaCorrente.saldo}")
    println("saldo poupanca após saque receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.tranferencia(200.0, contaCorrente)

    println("saldo corrente após receber de poupança: ${contaCorrente.saldo}")
    println("saldo poupanca após tranferencia pra corrente: ${contaPoupanca.saldo}")*/

    println("Titular ${contaCorrente.titular}")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("endereço do titular ${contaCorrente.titular.endereco.logradouro}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("saldo corrente : ${contaCorrente.saldo}")

}