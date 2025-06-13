package Assignment_june_13

fun main() {
    val list1 = listOf(11, 22, 33, 44, 55)
    val list2 = listOf(33, 44, 55, 66, 77)
    val mergedList = mutableListOf<Int>()

    for (item in list1) mergedList.add(item)
    for (item in list2) if (!mergedList.contains(item)) mergedList.add(item)

    println(mergedList)
}
