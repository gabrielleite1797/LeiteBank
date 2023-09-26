package br.com.alura.leitebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set
    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }


    abstract fun saque(valor: Double)

    fun tranferencia(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double{
//        return saldo
//    }
//    fun setSaldo(valor: Double){
//        if (valor > 0){
//            saldo = valor
//        }
//    }
}