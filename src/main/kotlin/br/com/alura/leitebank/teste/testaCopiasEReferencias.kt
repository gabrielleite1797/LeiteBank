package br.com.alura.leitebank.teste

import br.com.alura.leitebank.modelo.Cliente
import br.com.alura.leitebank.modelo.ContaCorrente
import br.com.alura.leitebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente("João", "", 1)
    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular = joao

    val contaMaria = ContaPoupanca(Cliente("Maria", "", 2), 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta joao: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
