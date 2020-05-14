import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    val firstDigit = number / 100
    val secondDigit = number / 10 % 10
    val thirdDigit = number % 10
    println(thirdDigit * 100 + secondDigit * 10 + firstDigit)
}