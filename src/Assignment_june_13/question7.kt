package Assignment_june_13

fun main() {
    val items = mapOf("Tempered Glass" to 600, "Bucket" to 200, "Electric Kettle" to 700)
    for ((item, price) in items) {
        if (price > 500) {
            println(" the $item costs $price")
        }
    }
}
