package minesweeper.game

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import minesweeper.domain.board.Board
import minesweeper.domain.board.CellType
import minesweeper.domain.board.Coordinate
import minesweeper.domain.board.toMines
import minesweeper.domain.data.PositiveNumber

class BoardTest : StringSpec({
    " mine 갯수는 총 Cell 갯수보다 적어야 합니다." {
        shouldThrow<IllegalArgumentException> {
            val row = PositiveNumber(5)
            val col = PositiveNumber(5)
            val mine = List(26) {
                Coordinate(0, 0)
            }.toMines()
            Board(row, col, mine)
        }
    }

    "Mine Board 상태는 width 5, height 5 총 Cell 25개를 가지며 [0,0][1,1][2,2][3,3][4,4] 위치에 지뢰가 심어져 있다" {
        val row = PositiveNumber(5)
        val col = PositiveNumber(5)
        val mine = mutableListOf(
            Coordinate(0, 0), Coordinate(1, 1), Coordinate(2, 2), Coordinate(3, 3), Coordinate(4, 4)
        ).toMines()

        val board = Board(row, col, mine)
        board.board.size shouldBe 5
        board.board[0].size shouldBe 5
        board.board.flatten().size shouldBe 25
        board.board[0][0].type shouldBe CellType.MINE
        board.board[0][1].type shouldBe CellType.NORMAL
        board.board[1][1].type shouldBe CellType.MINE
        board.board[2][2].type shouldBe CellType.MINE
        board.board[3][3].type shouldBe CellType.MINE
        board.board[4][4].type shouldBe CellType.MINE
    }
})
