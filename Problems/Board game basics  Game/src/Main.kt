object PlayingField {
    object Size {
        // TODO
        var width = 0
        var height = 0

        fun changeSize(width: Int, height: Int) {
            this.width = width.coerceAtLeast(0)
            this.height = height.coerceAtLeast(0)
        }
    }
}