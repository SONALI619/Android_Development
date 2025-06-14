package Assignment_june_13

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val taken = numbers.takeWhile { it < 5 }
    println("takeWhile: $taken") // stops when first 6 is found

    val dropped = numbers.dropWhile { it < 5 }
    println("dropWhile: $dropped") // skips till first 6, includes rest
}
