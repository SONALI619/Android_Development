package Assignment_june_13

fun new_func(x: Int, operation: (Int) -> Int): Int {
    return operation(x)
}

fun main() {
    val result = new_func(5, { num -> num * 2 })
    println("Result: $result")
}