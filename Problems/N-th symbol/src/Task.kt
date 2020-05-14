import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val input = scanner.nextLine()
    val n = scanner.nextInt()
    println("Symbol # $n of the string \"$input\" is '${input[n - 1]}'")
}