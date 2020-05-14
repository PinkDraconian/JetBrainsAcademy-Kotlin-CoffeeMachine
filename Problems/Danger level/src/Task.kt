enum class DangerLevel(val levelScore: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Int {
        return levelScore
    }
}

fun main() {
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM

    println(high.getLevel() > medium.getLevel()) // true
}
