package Assignment_june_8

fun main() {
    val str: String? = "123"
    if (str != null) {
        val num = str.toIntOrNull()
        if (num != null) {
            println(num * 2)
        } else {
            println("Invalid number")
        }
    }
}