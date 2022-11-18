package lambdas

fun main(args: Array<String>) {
    print("Digite a sua mensagem: ")
    val entrada = readln()
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"

    println(mensagem)
}