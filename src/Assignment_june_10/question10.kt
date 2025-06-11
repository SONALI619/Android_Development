package Assignment_june_10

open class Animal {
    open fun makeSound() {
        println("Some sound")
    }
}

class Dog: Animal() {
    override fun makeSound() {
        println("Bark!")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound()
}
