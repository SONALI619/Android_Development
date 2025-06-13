package Assignment_june_13

fun main() {
    val names = listOf("Krishna", "Siddharth", "Nishit", "Samriddhi","Divya")
    var count = 0
    for (name in names) {
        if (name.length > 5) {
            count++
        }
    }
    println("Names longer than 5 characters: $count")
}
