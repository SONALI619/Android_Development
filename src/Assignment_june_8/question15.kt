package Assignment_june_8

fun main() {
    val name: String? = "India"

    // !! force unwrap (crashes if null)
    println(name!!.length)

    // ?. safe call
    println(name?.length)

    // ?: Elvis operator
    val length = name?.length ?: 0
    println(length)
}