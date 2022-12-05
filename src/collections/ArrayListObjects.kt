package collections

data class Fruta(var nome: String, var preco: Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(Fruta("Banana", 1.5), Fruta("Morango", 9.99))
    for (fruta in frutas){
        println("A fruta é ${fruta.nome} e o preço é R$${fruta.preco}")
    }
}