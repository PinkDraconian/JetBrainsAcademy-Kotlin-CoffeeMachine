import java.util.*

fun possibleTriangle(a: Int, b: Int, c: Int): Boolean {
    return a + b > c && b + c > a && a + c > b
}

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(if (possibleTriangle(a, b, c)) "YES" else "NO")
}