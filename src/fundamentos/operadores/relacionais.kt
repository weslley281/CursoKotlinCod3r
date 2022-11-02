package fundamentos.operadores

import java.util.Date

fun main(args: Array<String>) {
    println("alguma coisa" === "alguma coisa")
    println(3 !== 1)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    //igualdade referencial
    println("Resultado com '===' ${d1 === d2}")

    //igualdade estrutural
    println("Resultado com '==' ${d1 == d2}")
}