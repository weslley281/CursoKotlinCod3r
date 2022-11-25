package lambdas

import fundamentos.pacoteB.soma

class Calculator{
    var result = 0

    fun sum(value1: Int, value2: Int){
        result += value1 + value2
    }

    fun add(value: Int){
        result += value
    }
}

fun main(args: Array<String>) {
    val calculator = Calculator()

    calculator.apply { sum(4,5) }.apply { add(5) }.apply { println(result) }
    calculator.apply {
        soma(4,5)
        add(5)
        println(result)
    }
    with(calculator){
        soma(4,5)
        add(5)
        println(result)
    }
}