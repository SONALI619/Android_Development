package Assignment_june_13

fun main() {
    val isPalindrome: (String) -> Boolean = { str ->
        val reversed = str.reversed()
        str == reversed
    }
    println(isPalindrome("sir"))
    println(isPalindrome("madam"))
}
