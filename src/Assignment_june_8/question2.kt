package Assignment_june_8

fun main() {
    val names = mutableListOf("Ankita", "Uday", "Aradhana", "Sagar","Ankit", "Nishita")
    val result = mutableListOf<String>()
    for (name in names) {
        if (!name.startsWith("A")) {
            result.add(name)
        }
    }
    println(result)
}