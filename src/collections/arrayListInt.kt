package collections

fun main(args: Array<String>) {
    val pares = arrayListOf<Int>(2, 4, 6)
    val inpares = intArrayOf(1, 3, )

    for (n in inpares.union(pares).sorted()){
        println("$n ")
    }
}