package Assignment_june_13

class InvalidAgeException(message: String) : Exception(message)

fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be 18 or older")
    } else {
        println("Age is valid")
    }
}

fun main() {
    checkAge(25)

}
