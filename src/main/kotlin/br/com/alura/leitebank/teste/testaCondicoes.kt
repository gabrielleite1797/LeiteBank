package br.com.alura.leitebank.teste

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("modelo.Conta positiva")
        saldo == 0.0 -> println("modelo.Conta é Neutra")
        else -> println("modelo.Conta Negativa")
    }
}