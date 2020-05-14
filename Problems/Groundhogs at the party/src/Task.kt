import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // write your code here
    val cups = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()

    println(!isWeekend && cups <= 20 && cups >= 10 || isWeekend && cups <= 25 && cups >= 15)
}