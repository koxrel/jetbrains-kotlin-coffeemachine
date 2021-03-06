data class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        var lastId = 0

        fun create(name: String): Player = Player(++lastId, name, 100)
    }
}