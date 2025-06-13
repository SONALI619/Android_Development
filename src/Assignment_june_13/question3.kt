package Assignment_june_13

fun main() {
    val employees = mapOf("Mohan" to "Human Resource", "Kiran" to "Manager", "Vivek" to "Finance")
    for ((name, department) in employees) {
        println("$name works in $department")
    }
}
