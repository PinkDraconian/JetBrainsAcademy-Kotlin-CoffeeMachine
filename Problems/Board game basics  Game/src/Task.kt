object PlayingField {
    object Size {
        var width: Int = 0
        var height: Int = 0
        fun changeSize(width: Int, height: Int) {
            this.width = width.coerceAtLeast(0)
            this.height = height.coerceAtLeast(0)
        }
    }
}