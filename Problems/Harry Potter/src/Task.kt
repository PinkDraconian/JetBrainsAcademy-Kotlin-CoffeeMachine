import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val input = scanner.next()
    println(when (input) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "not a valid house"
    })
}