package classes

class Filme2 (val nome: String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>) {
    val filme = Filme2("Wakanda Forever", 2022, "Ação")
    println("O filme ${filme.nome} do genero ${filme.genero} foi lançado em ${filme.anoLancamento}")
}