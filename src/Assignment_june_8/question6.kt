package Assignment_june_8

fun sumOfOddNumbers(list: List<Int>): Int {
    var sum = 0
    for (num in list) {
        if (num % 2 != 0) {
            sum += num
        }
    }
    return sum
}

fun main() {
    println(sumOfOddNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
}