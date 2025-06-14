package Assignment_june_13

fun main() {
    try {
        val a = 10
        val b = 0
        val result = a / b
        println(result)
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero")
    }
}
