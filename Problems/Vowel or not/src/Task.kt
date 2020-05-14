import java.util.Scanner

// write your function here
fun isVowel(letter: Char): Boolean = letter.toLowerCase() == 'a' || letter.toLowerCase() == 'e' ||
        letter.toLowerCase() == 'u' || letter.toLowerCase() == 'i' || letter.toLowerCase() == 'o'

fun main() {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}