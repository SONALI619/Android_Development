package Assignment_june_7

fun main(){
    for (order in 1..10) {
        if (order == 3 || order == 7) {
            println("Skipping decaf order #$order")
            continue
        }
        println("Processing order #$order")
    }
}