package Assignment_june_7

fun main(){
    val temp = 65
    when {
        temp < 60 -> println("Too Cold")
        temp in 60..75 -> println("Perfect")
        else -> println("Too Hot")
    }
}