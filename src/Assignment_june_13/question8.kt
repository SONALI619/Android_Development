package Assignment_june_13

fun main() {
    val sentence = "it is raining outside"
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val foundVowels = mutableSetOf<Char>()
    for (ch in sentence) {
        if (vowels.contains(ch)) {
            foundVowels.add(ch)
        }
    }
    println("Vowels found: $foundVowels")
}
