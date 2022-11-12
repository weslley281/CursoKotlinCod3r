package classes

class  Geladeira(val marca: String, val  litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastamp", 320)
    val g2 = Geladeira("Brastamp", 320)

    println(if (g1 == g2){"Else são iguais"}else{"Não são iguais"})
    println(g1.toString())

    val tv1 = Televisao("LG", 32)
    val tv2 = Televisao("LG", 32)

    println(if (tv1 == tv2){"Else são iguais"}else{"Não são iguais"})
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(polegadas = 60))

    var (marca, polegada) = tv1
    println("A marca é $marca e a polegada é $polegada")
}