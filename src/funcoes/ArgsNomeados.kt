package funcoes

fun relacaoDeTrabalho(chefe:String, funcionario:String):String{
    return "$funcionario é subordinado ao $chefe"
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("Cicrano", "Fulano"))
    println(relacaoDeTrabalho(funcionario = "Fulano", chefe = "Cirano"))
}