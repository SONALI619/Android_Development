package Assignment_june_13

fun operateOnNumbers(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {
    val sum = operateOnNumbers(10, 5, { x, y -> x + y })
    val product = operateOnNumbers(10, 5, { x, y -> x * y })
    val difference = operateOnNumbers(10, 5, { x, y -> x - y })

    println("Sum: $sum")
    println("Product: $product")
    println("Difference: $difference")
}
