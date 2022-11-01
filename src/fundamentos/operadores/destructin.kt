package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca, modelo) = Carro("Ford","Ka")
    println("Meu carro é um $marca $modelo")

    val (_, _, terceiroLugar) = listOf<String>("Fulano", "Cicrano", "Deltrano")
    println(terceiroLugar)
}
