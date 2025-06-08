package Assignment_june_8

fun main() {
    val numbers = (1..10).toList()
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers from 1 to 10: $evenNumbers")
}