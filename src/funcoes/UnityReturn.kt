package funcoes

fun imprimirMaior(a: Int, b: Int){
    println(Math.max(a, b))
}

fun imprimirMaior2(a: Int, b: Int): Unit{
    println(Math.max(a, b))
}

fun imprimirMaior3(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return
}

fun imprimirMaior4(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimirMaior(8, 5)
    imprimirMaior2(8, 5)
    imprimirMaior3(8, 5)
    imprimirMaior4(8, 5)
}