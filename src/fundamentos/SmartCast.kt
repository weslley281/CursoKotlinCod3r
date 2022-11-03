package fundamentos

fun souEsperto(x: Any){
    if(x is String){
        println(x.toUpperCase())
    }else if(x is Int){
        println(x.plus(3))
    }
}

fun souEsperto2(x: Any){
    when(x){
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repense sua vida")
    }
}

fun main(args: Array<String>) {
    souEsperto("Weslley")
    souEsperto(26)
    souEsperto2(false)
}