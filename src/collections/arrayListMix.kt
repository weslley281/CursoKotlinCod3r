package collections

fun main(args: Array<String>) {
    val listMix = arrayListOf<Any>("Wesslley", true, 26, 73.5)

    for (item in listMix){
        if (item is String){
            println(item.uppercase());
        }else{
            println("O item é $item")
        }
    }
}