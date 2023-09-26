package br.com.alura.leitebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}