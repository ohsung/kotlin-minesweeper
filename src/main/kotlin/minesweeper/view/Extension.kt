package minesweeper.view

import minesweeper.domain.board.CellType
import minesweeper.domain.board.Row

fun CellType.toImage(count: String) = when (this) {
    CellType.MINE -> "*"
    CellType.NORMAL -> count
}

fun List<Row>.toShow(): String = this.joinToString("\n") {
    it.toShow()
}

fun Row.toShow(): String = this.joinToString(" ") {
    it.type.toImage(it.count.toString())
}
