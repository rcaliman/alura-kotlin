abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        protected set

    fun deposita(valor: Double): Boolean {
        if (valor > 0) {
            this.saldo += valor
            return true
        }
        return false
    }

    abstract fun saca(valor: Double): Boolean

    fun transfere(destino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}