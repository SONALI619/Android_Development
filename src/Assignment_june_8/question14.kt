package Assignment_june_8

fun maxInList(list: List<Int>?): Int {
    if (list == null || list.isEmpty()) {
        return -1
    }
    var max = list[0]
    for (num in list) {
        if (num > max) {
            max = num
        }
    }
    return max
}

fun main() {
    println(maxInList(listOf(2,10,65,32,3,100,489)))
    println(maxInList(null))
}