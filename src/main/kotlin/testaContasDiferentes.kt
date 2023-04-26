public fun testaContasDifirentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente : ${contaCorrente.saldo}")
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
    println("saldo poupanca após tranferencia pra corrente: ${contaPoupanca.saldo}")
}