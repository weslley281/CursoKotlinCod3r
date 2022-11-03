package fundamentos.operadores

fun main(args: Array<String>) {
    //val valor = "abc"
    val valor = null

    if(valor is String){
        println(valor)
    }else if(valor !is String){
        println("Não é uma string")
    }
}