import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val duration = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val flightCost = scanner.nextInt()
    val hotelCost = scanner.nextInt()

    val totalCost = duration * foodCost + flightCost * 2 + hotelCost * (duration - 1)
    println(totalCost)
}