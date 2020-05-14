import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val endDigit = 1
    var n = scanner.nextInt()
    while (n != endDigit) {
        print("$n ")
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * 3 + 1
        }
    }
    print(endDigit)
}