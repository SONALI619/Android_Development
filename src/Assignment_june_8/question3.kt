package Assignment_june_8

fun main() {
    val studentMarks = mapOf("Hemant" to 80, "Anita" to 70, "Ashish" to 90)
    for ((name, mark) in studentMarks) {
        if (mark > 75) {
            println(name)
        }
    }
}