package minesweeper.domain.board

data class Coordinate(val x: Int, val y: Int)

infix fun Int.position(that: Int): Coordinate = Coordinate(this, that)
