package Assignment_june_13

fun main() {
    val age = -31
    if (age < 0) {
        throw Exception("Age cannot be negative")
    }
    println("Age: $age")
}