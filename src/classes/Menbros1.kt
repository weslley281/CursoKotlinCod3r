package classes

class Data(var dia: Int, var mes:Int, var ano:Int){
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    var nascimento: Data = Data(28,11,1995)

    println(nascimento)
}