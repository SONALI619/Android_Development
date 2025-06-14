package Assignment_june_13

fun main() {
    val numbers = listOf(34, 12, 45, 65, 98, 33, 99, 77)
    val great = numbers.filter { it > 50 }
    println("the numbers greater than 50 are $great")
}
