import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val year = scanner.nextInt()
    println(
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                "Regular"
            } else {
                "Leap"
            }
        } else "Regular"
    )
}