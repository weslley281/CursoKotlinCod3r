package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>){
    kotlin.io.println(funcaoSimples("OK"))
    var coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("${soma(2,3)} ${subtracao(4,6)}")
}