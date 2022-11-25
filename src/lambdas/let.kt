package lambdas

fun main(args: Array<String>) {
    val listEithNull = listOf("A", null, "B", null, "C", null)

    for (item in listEithNull){
        item?.let { println(it) }
    }
}