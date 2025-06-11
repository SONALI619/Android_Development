package Assignment_june_10

class Person(val name: String, val age: Int) {
    constructor(name: String): this(name, 18)
}

fun main() {
    val p1 = Person("Sonali")
    val p2 = Person("Riya", 25)
    println("${p1.name}, ${p1.age}")
    println("${p2.name}, ${p2.age}")
}
