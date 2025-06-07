package Assignment_june_7

fun main(){
    val price = 6
    when (price) {
        in 1..3 -> println("That's a cheap cup!")
        in 4..6 -> println("Mid-range brew.")
        else -> println("That’s some premium bean juice!")
    }
}