package Assignment_june_13

fun main() {
    val strings = listOf("Apple","Watermelon", "Banana", "Mango","Orange")
    val lengths = mutableListOf<Int>()
    for (str in strings) {
        lengths.add(str.length)
    }
    println(lengths)
}
