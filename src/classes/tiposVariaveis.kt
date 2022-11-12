package classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel(){
    val local = "Fulano"
    println("$diretamenteNoArquivo")
}

class Coisa {
    var  variavelDeInstancia: String = "Boa noite"

    companion object{
        @JvmStatic val  constanteClasse = "Cicrano"
    }

    fun fazer(){
        val local: Int = 7
        if (local > 3){
            val variavelDeBloco = "Beltrano"
            println("${diretamenteNoArquivo} ${variavelDeInstancia} ${constanteClasse}")
        }
    }
}