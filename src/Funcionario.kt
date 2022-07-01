abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    abstract val bonificacao: Double

//    open val bonificacao: Double
//        get() {
//            return salario * .1
//        }
}