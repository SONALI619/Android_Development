package Assignment_june_13

fun main() {
    try {
        val list: List<String>? = null
        println(list!!.get(10))
    } catch (e: NullPointerException) {
        println("Caught NullPointerException")
    } catch (e: IndexOutOfBoundsException) {
        println("Caught IndexOutOfBoundsException")
    }
}
