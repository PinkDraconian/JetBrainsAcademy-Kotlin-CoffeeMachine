import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    var maximum = Int.MIN_VALUE
    val numberOfInputs = scanner.nextInt()
    repeat(numberOfInputs) {
        val value = scanner.nextInt()
        if (value % 4 == 0 && value > maximum) {
            maximum = value
        }
    }

    println(maximum)
}