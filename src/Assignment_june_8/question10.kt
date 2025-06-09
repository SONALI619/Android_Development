package Assignment_june_8

fun longestString(list: List<String>): String {
    var longest = ""
    for (word in list) {
        if (word.length > longest.length) {
            longest = word
        }
    }
    return longest
}

fun main() {
    println(longestString(listOf("Python", "Cobra", "Anaconda", "Taipan", "Boa")))
}