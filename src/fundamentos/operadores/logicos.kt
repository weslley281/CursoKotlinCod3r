package fundamentos.operadores

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = false
    val executouTrabalho2: Boolean = false

    val comprarSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprarTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprarTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println(if (comprarSorvete) "Vai comprar sorvete" else "Não vai comprar sorvete")
    println(if (comprarTv50) "Vai comprar tv de 50" else "Não vai comprar tv de 50")
    println(if (comprarTv32) "Vai comprar tv de 32" else "Não vai comprar tv de 32")
}