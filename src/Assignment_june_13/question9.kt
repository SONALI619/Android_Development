package Assignment_june_13

fun main() {
    val numbers = mutableListOf(65, 73, 99, 10, 24)
    for (i in 0 until numbers.size) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] < numbers[j]) {
                val temp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = temp
            }
        }
    }
    println(numbers)
}
