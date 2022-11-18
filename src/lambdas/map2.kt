package lambdas

class Produto (val nome: String, val preco: Double)

val materialEscolar = listOf<Produto>(
    Produto("Chuca", 49.99),
    Produto("Supositorio", 39.99),
    Produto("Lubrificante", 19.99),
    Produto("Calsinha Comestivel", 11.99),
)

fun main(args: Array<String>) {
    val totalizar = { total: Double, atual: Double -> total + atual }
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)
    println("O preço total é $precoTotal")
}