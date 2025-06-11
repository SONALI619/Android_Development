package Assignment_june_10

fun getLength(input: String?): Int {
    if (input == null) {
        return 0
    } else {
        return input.length
    }
}

fun main() {
    println(getLength("CHOCOLATE"))
    println(getLength(null))
}