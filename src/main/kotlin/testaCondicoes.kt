fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta é Neutra")
        else -> println("Conta Negativa")
    }
}