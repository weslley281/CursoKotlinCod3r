package collections

fun main(args: Array<String>) {
    val strings = arrayListOf<String>("Carro", "Moto", "Aviã", "Barco")

    for (item in strings){
        println(item.uppercase())
    }
}