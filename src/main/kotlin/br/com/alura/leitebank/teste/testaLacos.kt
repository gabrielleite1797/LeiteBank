package br.com.alura.leitebank.teste

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular = "Gabriel $i"
        val numeroConta = 2000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
        i++
    }
    for (i in 5 downTo 1) {
        val titular = "Gabriel $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }
}