import java.util.*
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val areaOfRoom = when (scanner.next()) {
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val perimeter = (a + b + c) / 2
            sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c))
        }
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            a * b
        }
        "circle" -> {
            val a = scanner.nextDouble()
            a * a * 3.14
        }
        else -> 0.0
    }
    println(areaOfRoom)
}