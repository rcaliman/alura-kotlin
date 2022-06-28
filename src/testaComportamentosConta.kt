fun testaComportamentosConta() {
    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta(titular = "Fran", numero = 1001)
    contaFran.deposita(300.0)

    println("Conta do Alex: ${contaAlex.titular} ${contaAlex.numero} ${contaAlex.saldo}")
    println("Conta da Fran: ${contaFran.titular} ${contaFran.numero} ${contaFran.saldo}")
    println("---- saca 10 ----")
    contaAlex.saca(10.0)
    contaFran.saca(10.0)
    println("Conta do Alex: ${contaAlex.titular} ${contaAlex.numero} ${contaAlex.saldo}")
    println("Conta da Fran: ${contaFran.titular} ${contaFran.numero} ${contaFran.saldo}")
    println("---- deposita 20 ----")
    contaAlex.deposita(20.0)
    contaFran.deposita(20.0)
    println("Conta do Alex: ${contaAlex.titular} ${contaAlex.numero} ${contaAlex.saldo}")
    println("Conta da Fran: ${contaFran.titular} ${contaFran.numero} ${contaFran.saldo}")
    println("---- transfere 5 ----")
    contaAlex.transfere(contaFran, 5.0)
    println("Conta do Alex: ${contaAlex.titular} ${contaAlex.numero} ${contaAlex.saldo}")
    println("Conta da Fran: ${contaFran.titular} ${contaFran.numero} ${contaFran.saldo}")
}