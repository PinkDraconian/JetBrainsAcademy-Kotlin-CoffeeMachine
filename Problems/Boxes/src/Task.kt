import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val cube1Sorted = intArrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).sorted().toIntArray()
    val cube2Sorted = intArrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).sorted().toIntArray()

    println(when {
        cube1Sorted.contentEquals(cube2Sorted) -> "Box 1 = Box 2"
        cube1Sorted[0] >= cube2Sorted[0] &&
                cube1Sorted[1] >= cube2Sorted[1] &&
                cube1Sorted[2] >= cube2Sorted[2] -> "Box 1 > Box 2"
        cube1Sorted[0] <= cube2Sorted[0] &&
                cube1Sorted[1] <= cube2Sorted[1] &&
                cube1Sorted[2] <= cube2Sorted[2] -> "Box 1 < Box 2"
        else -> "Incomparable"
    })
}
