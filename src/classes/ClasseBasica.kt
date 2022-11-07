package classes

class Cliente{
    var nome: String = ""
    var idade: Int = 26
}

fun main(args: Array<String>) {
    val cliente = Cliente()
    cliente.nome = "Weslley"

    println("O cliente é ${cliente.nome} e sua idade é ${cliente.idade}")
}