package Assignment_june_13

fun checkInput(input : String) {
    if (input.isBlank()) {
        throw IllegalArgumentException("Input string is blank")
    } else {
        println("Valid input: $input")
    }
}

fun main() {
    checkInput("Hello Kotlin!")
}
