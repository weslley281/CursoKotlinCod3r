package collections

fun main(args: Array<String>) {
    val numbers = Array<Int>(10){i -> i * 10}

    for (number in numbers){
        println(number)
    }

    println(numbers.get(1))
    println(numbers[1])
    println(numbers.size)
    numbers[1] = 1234
    println(numbers[1])
}