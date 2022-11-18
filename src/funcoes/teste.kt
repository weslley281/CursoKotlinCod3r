class Address(val city: String?, val state: String?) {

}

fun printAddress(address: Address) {
    val city: String = address.city ?: "(unknown city)"
    val state: String = address.state ?: "(unknown state)"
    println("$city $state")
}

fun main() {
    printAddress(Address("Lagos", "Lagos"))
}