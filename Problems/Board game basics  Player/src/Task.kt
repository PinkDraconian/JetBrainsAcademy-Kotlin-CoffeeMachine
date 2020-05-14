data class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        private const val hp = 100
        fun create(name: String): Player {
            val id = Math.random().toInt()
            return Player(id, name, hp)
        }
    }
}