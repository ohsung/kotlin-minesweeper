package minesweeper.domain.board

import minesweeper.domain.data.PositiveNumber

class Board(private val width: PositiveNumber, private val height: PositiveNumber, private val mine: Mines) {

    init {
        require((width * height) > mine.size) {
            "지뢰 갯수가 많습니다."
        }
    }

    val board: List<Row>
        get() =
            List(height.number) { col ->
                Row.create(width.number, col, mine)
            }
}
