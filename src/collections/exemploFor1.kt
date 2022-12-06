package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("Fulano", "Cicrano", "Deltrano", "Beltrana", "Maltrano")

    for (aluno in alunos){
        println(aluno)
    }

    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} -> $aluno")
    }
}