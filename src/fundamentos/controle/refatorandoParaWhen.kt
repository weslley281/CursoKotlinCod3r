package fundamentos.controle

fun main(args: Array<String>) {
    val nota = 10

    when(nota){
        10, 9 -> println("fantastico")
        8, 7 -> println("parabéns")
        in 4..6 -> println("parabéns")
        in 0..3 -> println("parabéns")
        else -> println("Nota Inválida")
    }
}