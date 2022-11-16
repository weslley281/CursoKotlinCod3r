package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf<Aluno>(
        Aluno("Fulano", 7.4),
        Aluno("Cicrano", 8.0),
        Aluno("Deltrano", 6.5),
        Aluno("Maltrano", 4.8)
    )

    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }

    println(aprovados)
}