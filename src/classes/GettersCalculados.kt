package classes

class  Produto(var nome: String, var preco: Double, var desconto: Double, val ativo: Boolean){
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main(args: Array<String>) {
    val p1 = Produto("iPad", 3454.99, 0.20, true)
    println(p1.precoComDesconto)

    val p2 = Produto("Supositorio", 49.99, 0.10, true)
    println(p2.precoComDesconto)

    val p3 = Produto("Chuca", 69.99, 0.00, false)
    println(p3.precoComDesconto)
}