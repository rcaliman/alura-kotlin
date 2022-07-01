open class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        private set

    fun deposita(valor: Double): Boolean {
        if (valor > 0) {
            this.saldo += valor
            return true
        }
        return false
    }

    open fun saca(valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            return true
        }
        return false
    }

    fun transfere(destino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}