import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(
            when {
                c < a -> "Deficiency"
                c > b -> "Excess"
                else -> "Normal"
            }
    )
}