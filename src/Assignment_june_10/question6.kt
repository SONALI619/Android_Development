package Assignment_june_10

fun main() {
    val address: String? = null
    // val len = address!!.length  // Causes NullPointerException
    val len = address?.length ?: 0
    println("Length: $len")
}
