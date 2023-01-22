fun main(args: Array<String>) {
    println("Bem vindo ao LeiteBank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
}

class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos(){
    var i = 0
    while (i < 5){
        val titular = "Gabriel $i"
        val numeroConta = 1000 + i
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
fun testaCondicoes(saldo: Double){
    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta é Neutra")
        else -> println("Conta Negativa")
    }
}