package Assignment_june_10

data class User(val name: String, val email: String)

fun main() {
    val u1 = User("Sonali", "s@gmail.com")
    val u2 = User("Nisha", "n@gmail.com")
    println(u1 == u2)
}
