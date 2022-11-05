package funcoes

class Produto(val nome:String, val preco:Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("Chuca", 39.99)
    val p2 = Produto("Supositório", 49.99)
    val oMaisCaro = if(p1 maisCaroQue p2) "O ${p1.nome} é mais caro" else "O ${p2.nome} é mais caro"
    println(oMaisCaro)
}