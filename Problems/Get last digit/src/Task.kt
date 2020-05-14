import java.util.*

// write your code here
fun getLastDigit(a: Int): Int {
    return Math.abs(a % 10)
}

/* Do not change code below */
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}