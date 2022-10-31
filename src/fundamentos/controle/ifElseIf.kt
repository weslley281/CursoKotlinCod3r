package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 8.5

    if(nota in 9.0..10.0){
        println("Fantastico")
    }else if(nota in 7.0..8.9){
        println("Parabens")
    }else if(nota in 4.0..6.9){
        println("Tem como recuperar")
    }else if(nota in 0.0..3.9){
        println("Te vejo no proximo semestre")
    }else{
        println("Valor invalido")
    }
}