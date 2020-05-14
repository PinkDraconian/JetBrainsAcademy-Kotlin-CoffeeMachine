import java.util.*
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    var maximum = Int.MIN_VALUE
    do {
        val input = scanner.nextInt()
        maximum = max(maximum, input)
    } while (input != 0)

    println(maximum)
}