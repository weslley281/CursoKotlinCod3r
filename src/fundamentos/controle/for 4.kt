package fundamentos.controle

fun main(args: Array<String>) {
    val alunos = arrayListOf<String>("Fulano", "Deltrano", "Cicrano")
    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1}: $aluno")
    }
}