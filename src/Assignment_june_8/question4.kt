package Assignment_june_8

fun main() {
    val words = listOf("Kotlin", "Java", "C++", "Anaconda", "Python")
    var count = 0
    for (word in words) {
        if (word.length > 4) {
            count++
        }
    }
    println("Count: $count")
}