package classes

class Filme3(nome: String, anoLancamento: Int, genero: String){
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3("Adão Negro", 2022, "Ação")
    println("O filme ${filme.nome} do genero ${filme.genero} foi lançado em ${filme.anoLancamento}")

}