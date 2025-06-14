package Assignment_june_13

fun main() {
    try {
        val input = "Eighty Six"
        val number = input.toInt()
        println(number)
    } catch (e: NumberFormatException) {
        println("Invalid number format")
    }
}