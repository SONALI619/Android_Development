package Assignment_june_13

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val factorial = numbers.reduce { acc, num -> acc * num }
    println("Factorial: $factorial")
}
