import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val queen1PositionX = scanner.nextInt()
    val queen1PositionY = scanner.nextInt()
    val queen2PositionX = scanner.nextInt()
    val queen2PositionY = scanner.nextInt()

    val queensOnSameRow = queen1PositionX == queen2PositionX
    val queensOnSameColumn = queen1PositionY == queen2PositionY
    val queensOnDiagonal = abs(queen1PositionX - queen2PositionX) == abs(queen1PositionY - queen2PositionY)

    if (queensOnDiagonal || queensOnSameColumn || queensOnSameRow) {
        println("YES")
    } else {
        println("NO")
    }
}