import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    val numberOfStudents = scanner.nextInt()
    repeat(numberOfStudents) {
        val value = scanner.nextInt()
        when (value) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }

    println("$d $c $b $a")
}