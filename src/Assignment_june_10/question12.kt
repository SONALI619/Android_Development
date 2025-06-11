package Assignment_june_10

abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double): Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}

fun main() {
    val c = Circle(3.0)
    println("Area: ${c.area()}")
}
