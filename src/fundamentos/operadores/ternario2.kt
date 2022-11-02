package fundamentos.operadores

fun obterResultado(nota:Double) : String = if(nota >= 7.0) "passou" else "Reprovou"

fun main(args: Array<String>){
    println(obterResultado(8.3))
}