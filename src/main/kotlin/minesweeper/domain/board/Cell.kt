package minesweeper.domain.board

data class Cell(val type: CellType, var count: Int = 0, var state: CellState = CellState.HIDE) {

    val isMine: Boolean
        get() = type == CellType.MINE

    val isOpen: Boolean
        get() = state == CellState.OPEN

    fun open() {
        state = CellState.OPEN
    }

    companion object {
        fun create(isMine: Boolean, count: Int = 0): Cell = Cell(CellType.of(isMine), count)
    }
}
