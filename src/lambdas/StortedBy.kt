package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf<String>("Fulano", "Cicrano", "Deltrano", "Maltrano")
    val  ordenados = nomes.sortedBy { it }

    println(ordenados)
}