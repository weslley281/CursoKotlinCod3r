package funcoes

fun min(a:Int, b:Int):Int = if (a < b) a else b

fun main(args: Array<String>) {
    println("O valor é ${min(3, 4)}")
}