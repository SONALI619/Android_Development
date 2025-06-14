package Assignment_june_13

fun main() {
    val list = listOf("Java", "Python", "C++", "Kotlin")
    try {
        println(list[8])
    } catch (e: Exception) {
        println("Error: ${e.message}")
    } finally {
        println("End of operation")
    }
}