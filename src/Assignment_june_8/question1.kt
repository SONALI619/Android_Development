package Assignment_june_8

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (even in numbers) {
        if (even% 2 == 0) {
            println("The even numbers are $even")
        }
    }
}