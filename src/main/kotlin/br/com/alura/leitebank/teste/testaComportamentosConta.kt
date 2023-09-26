package br.com.alura.leitebank.teste

import br.com.alura.leitebank.modelo.Cliente
import br.com.alura.leitebank.modelo.ContaCorrente
import br.com.alura.leitebank.modelo.ContaPoupanca

fun testaComportamentoConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(-200.0)

    val fran = Cliente("Fran", "", 2)
    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(70.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando da conta do Alex")
    contaAlex.saque(250.0)
    println(contaAlex.saldo)

    println("Sacando da conta da Fran")
    contaFran.saque(100.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta do Alex")
    contaAlex.saque(100.0)
    println(contaAlex.saldo)

    println("Saque em excesso na conta da Fran")
    contaFran.saque(500.0)
    println(contaFran.saldo)

    println("Tranferencia da conta pda Fran para o alex")

    if (contaFran.tranferencia(300.0, contaAlex)) {
        println("transferencia bem Sucedida")
    } else {
        println("Falha na Transferencia")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}
