package br.com.alura.leitebank.modelo

import br.com.alura.leitebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if (admin.autentica(senha)){
            println("Bem Vindo ao LeiteBank")
        }else{
            println("Falha na autenticação")
        }

    }

}