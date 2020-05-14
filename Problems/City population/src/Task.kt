data class City(val name: String) {
    var population: Int = 0
        set(value) {
            field = value.coerceAtMost(50_000_000).coerceAtLeast(0)
        }
}