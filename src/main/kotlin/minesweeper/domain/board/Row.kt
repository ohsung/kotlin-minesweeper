package minesweeper.domain.board

data class Row(private val cells: List<Cell>) : List<Cell> by cells {
    companion object {
        fun create(width: Int, col: Int, mines: Mines): Row = Row(
            List(width) { row ->
                val coordinate = row position col
                val isMine = mines.contains(coordinate)
                val nearMineCount = mines.nearMineCount(coordinate)
                Cell.create(isMine, nearMineCount)
            }
        )
    }
}
