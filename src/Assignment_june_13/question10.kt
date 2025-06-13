package Assignment_june_13

fun main() {
    val mySet = setOf(89, 32, 33, 14, 75)
    val element = 90
    if (mySet.contains(element)) {
        println("$element is in the set.")
    } else {
        println("$element is not in the set.")
    }
}