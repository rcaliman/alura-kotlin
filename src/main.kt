fun main() {
    println("Bem vindo ao Bytebank")
//    testaComportamentosConta()
    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )

    println("-----------------------------")
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificação: ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 12345,
    )

    println("-----------------------------")
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificação: ${fran.bonificacao()}")

    if(fran.autentica(12345)){
        println("autenticou com sucesso.")
    } else {
        println("falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "222.222.222-00",
        salario = 4000.0,
        senha = 123456,
        plr = 200.0,
    )

    println("-----------------------------")
    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("gui: ${fran.salario}")
    println("bonificação: ${fran.bonificacao()}")
    println("plr: ${gui.plr}")

    if(fran.autentica(12345)){
        println("autenticou com sucesso.")
    } else {
        println("falha na autenticação")
    }
}

