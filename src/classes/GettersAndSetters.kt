package classes

class Client2{
    constructor(nome: String){
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value){ field = value.takeIf { value.isNotEmpty() } ?: "Anonimo"}
}

fun main(args: Array<String>) {
    val c1 = Client2("")
    println(c1.nome)

    val c2 = Client2("Fulano")
    println(c2.nome)
}