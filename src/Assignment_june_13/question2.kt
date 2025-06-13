package Assignment_june_13

fun main() {
    val fruits = mutableListOf("Mango", "Banana", "Melon", "Apple","Cherry")
    val iterator = fruits.iterator()
    while (iterator.hasNext()) {
        val fruit = iterator.next()
        if (fruit.startsWith("M")) {
            iterator.remove()
        }
    }
    println(fruits)
}
