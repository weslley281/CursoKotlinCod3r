package lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf<String>("Fulano", "Cicrano", "Deltrano")
    alunos.map { it.uppercase() }.apply { println(this) }
}