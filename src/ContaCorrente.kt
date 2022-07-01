class ContaCorrente(
    titular: String,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero,
) {
    override fun saca(valor: Double): Boolean {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valor){
            this.saldo -= valor
            return true
        }
        return false
    }
}