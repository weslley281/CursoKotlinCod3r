package collections

fun main(args: Array<String>) {
    val numbers = arrayListOf<Int>(1,2,3,4,5)
    val names = arrayListOf<String>("Fulano", "Cicrano", "Deltrano", "Beltrana", "Maltrano")
    val union = numbers + names

    for (item in union){
        println(item)
    }
}