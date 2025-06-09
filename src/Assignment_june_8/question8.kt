package Assignment_june_8

fun fullName(first: String = "", last: String = ""): String {
    return first + " " + last
}

fun main() {
    println(fullName("Sonali", "Bera"))
}