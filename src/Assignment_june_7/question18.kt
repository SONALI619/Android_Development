package Assignment_june_7

fun main(){
    val tipNumber = (1..4).random()
    when (tipNumber) {
        1 -> println("Tip: Coffee first, adulting second.")
        2 -> println("Tip: Life’s too short for bad coffee.")
        3 -> println("Tip: Espresso yourself!")
        4 -> println("Tip: Brew-tiful mornings start here!")
    }
}