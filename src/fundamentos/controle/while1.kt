package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int = 0

    while (opcao != 1){
        print("Digite um numer que não seja o numero 1: ")
        val line = readLine()
        if (line != null) {
            opcao = line.toInt()
            println("Foi digitado: $opcao")
        }
    }

    println("Até a próxima")
}