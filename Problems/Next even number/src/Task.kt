import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val value = scanner.nextInt()

    if (value % 2 == 0) {
        println(value + 2)
    } else {
        println(value + 1)
    }
}