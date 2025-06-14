package Assignment_june_13

fun main() {
    val cities = listOf("Mumbai", "Delhi", "Chennai", "Kolkata", "Bangalore")
    cities.forEachIndexed { index, item ->
        println("Cities at $index position : $item")
    }
}
