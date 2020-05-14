import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    var n = scanner.nextInt()
    var next = 1
    while (n > 0) {
        if (n > next) {
            print("$next ".repeat(next))
            n -= next
        } else {
            print("$next ".repeat(n))
            n = 0
        }
        next++
    }
}