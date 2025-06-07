package Assignment_june_7

fun main(){
    val caffeine = 85
    val strength = when(caffeine) {
        in 0..30 -> "Mild"
        in 31..70 -> "Medium"
        in 71..100 -> "Strong"
        else -> "Unknown"
    }
    println("Your coffee strength is $strength")
}