package fundamentos.controle

fun main(args: Array<String>) {
    print("Digite o numero da tabuada: ")
    var tabuada = readLine()
    var numeroTabuada = tabuada!!.toInt()
    var operador: Int = 1

    while (operador <= 10){
        println("$operador X $tabuada = ${(operador * numeroTabuada)}")
        operador++
    }
}