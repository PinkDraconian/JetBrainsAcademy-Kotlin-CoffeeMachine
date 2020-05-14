import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.next()
    val b = scanner.next()
    val c = scanner.next()
    println(a in b..c)
}