package fundamentos

fun imprimirConceito(nota: Any){
    when(nota as? Int){
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        2, 1, 0 -> println("D")
        else -> println("Nota invalida")
    }
}

fun main(args: Array<String>) {
    imprimirConceito(9.2.toInt())
}