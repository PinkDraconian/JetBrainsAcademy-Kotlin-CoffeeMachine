import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // write your code here
    println(scanner.next().first().isDigit().toString() + '\\' +
            scanner.next().first().isDigit().toString() + '\\' +
            scanner.next().first().isDigit().toString() + '\\' +
            scanner.next().first().isDigit().toString())
}