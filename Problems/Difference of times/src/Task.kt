import java.util.Scanner

fun seconds(hour: Int, minute: Int, second: Int): Int {
    return (hour * 60 + minute) * 60 + second
}

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val firstHour = scanner.nextInt()
    val firstMinute = scanner.nextInt()
    val firstSecond = scanner.nextInt()
    val secondHour = scanner.nextInt()
    val secondMinute = scanner.nextInt()
    val secondSecond = scanner.nextInt()

    val firstSeconds = seconds(firstHour, firstMinute, firstSecond)
    val secondSeconds = seconds(secondHour, secondMinute, secondSecond)

    println(secondSeconds - firstSeconds)
}