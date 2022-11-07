package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String){
    val nome: String = nomeInicial
}

fun main(args: Array<String>) {
    val p1 = Pessoa1(nome = "Fulano")
    p1.nome = "Cicrano"
    println(p1.nome)

    val  p2 = Pessoa2("Deltrano")
    val p3 = Pessoa3(nomeInicial = "Heltrano")
    println("${p2.nome} e ${p3.nome}")
}