package Assignment_june_13

fun main() {
    val list = (1..20).toList()
    for (even in list) {
        if (even % 2 == 0) {
            println(even)
        }
    }
}