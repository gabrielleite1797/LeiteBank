package br.com.alura.leitebank.teste

import br.com.alura.leitebank.modelo.Analista
import br.com.alura.leitebank.modelo.CalculadoraBonificacao
import br.com.alura.leitebank.modelo.Diretor
import br.com.alura.leitebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2469
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao}")

    if (fran.autentica(2469)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 1234,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }

    val maria = Analista(nome = "Maria", cpf = "444.444.444-44", salario = 3000.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("TOTAL DE BONIFICACAO: ${calculadora.total}")
}