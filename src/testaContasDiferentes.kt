fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(titular = "Alex", numero = 1000)

    val contaPoupanca: Conta = ContaPoupanca(titular = "Fran", numero = 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupanca após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(contaPoupanca, 100.0)

    println("saldo corrente após transferencia para poupança: ${contaCorrente.saldo}")
    println("saldo poupanca após transferencia para poupança: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(contaCorrente, 100.0)

    println("saldo corrente após transferencia para conta corrente: ${contaCorrente.saldo}")
    println("saldo poupanca após transferencia para conta corrente: ${contaPoupanca.saldo}")
}